package a6_designpatterns.behavioral;

/**
 * ============================================================================
 * PATTERN: CHAIN OF RESPONSIBILITY (Behavioral)
 * ============================================================================
 *
 * SIMPLE DEFINITION:
 * The Chain of Responsibility is a behavioral design pattern where a request is
 * passed sequentially along a dynamic chain of handlers. Upon receiving the
 * request, each handler decides either to:
 *   1. Process the request (handle it).
 *   2. Pass it along to the next handler in line.
 *   3. Terminate/reject the request (short-circuit).
 *
 * Senders are completely decoupled from receivers: the sender only issues the
 * request to the head of the chain, without needing to know which handler or
 * how many handlers will eventually process it.
 *
 * CORE ROLES:
 * 1. Request: Encapsulates all data and context required for evaluation.
 * 2. Handler (Approver): Abstract base class defining the successor pointer
 *    and the forwarding/delegation template method.
 * 3. Concrete Handlers: Independent units with distinct single responsibilities
 *    (e.g., Compliance, Team Lead, Manager, Director, CEO).
 * 4. Client: Assembles the chain and triggers execution at the head.
 * ============================================================================
 */
public class ChainOfResponsibility {

    // -------------------------------------------------------------------------
    // 1. Request
    // -------------------------------------------------------------------------
    public static class PurchaseRequest {
        private final String id;
        private final String purpose;
        private final double amount;
        private final boolean requiresComplianceReview;

        public PurchaseRequest(String id, String purpose, double amount, boolean requiresComplianceReview) {
            this.id = id;
            this.purpose = purpose;
            this.amount = amount;
            this.requiresComplianceReview = requiresComplianceReview;
        }

        public String getId() {
            return id;
        }

        public String getPurpose() {
            return purpose;
        }

        public double getAmount() {
            return amount;
        }

        public boolean requiresComplianceReview() {
            return requiresComplianceReview;
        }

        @Override
        public String toString() {
            return String.format("[%s] '%s' ($%,.2f%s)",
                    id, purpose, amount, requiresComplianceReview ? ", Compliance Review Required" : "");
        }
    }

    // -------------------------------------------------------------------------
    // 2. Base Handler
    // -------------------------------------------------------------------------
    public static abstract class Approver {
        protected final String name;
        protected Approver nextApprover;

        public Approver(String name) {
            this.name = name;
        }

        /**
         * Sets the next handler in the chain.
         * Returns the passed handler to allow fluent method chaining.
         */
        public Approver setNext(Approver nextApprover) {
            this.nextApprover = nextApprover;
            return nextApprover;
        }

        /**
         * Template method for processing requests along the chain.
         * Subclasses specify handling criteria in canHandle() and handle().
         */
        public void process(PurchaseRequest request) {
            if (canHandle(request)) {
                handle(request);
            } else if (nextApprover != null) {
                System.out.printf("  -> %s cannot approve. Escalating to %s...%n", name, nextApprover.name);
                nextApprover.process(request);
            } else {
                // Reached the end of the chain without any handler satisfying the request
                System.out.printf("  [REJECTED] %s: No approver with sufficient authority for request %s%n",
                        request.getId(), request);
            }
        }

        protected abstract boolean canHandle(PurchaseRequest request);
        protected abstract void handle(PurchaseRequest request);
    }

    // -------------------------------------------------------------------------
    // 3. Concrete Handlers
    // -------------------------------------------------------------------------

    /**
     * Intercepts requests that require mandatory regulatory or legal review.
     */
    public static class ComplianceOfficer extends Approver {
        public ComplianceOfficer(String name) {
            super(name);
        }

        @Override
        protected boolean canHandle(PurchaseRequest request) {
            return request.requiresComplianceReview();
        }

        @Override
        protected void handle(PurchaseRequest request) {
            System.out.printf("  [APPROVED] %s (Compliance Officer) conducted audit and approved request %s%n",
                    name, request);
        }
    }

    /**
     * Approves team-level operational expenses up to $1,000.
     */
    public static class TeamLead extends Approver {
        private static final double APPROVAL_LIMIT = 1_000.0;

        public TeamLead(String name) {
            super(name);
        }

        @Override
        protected boolean canHandle(PurchaseRequest request) {
            return request.getAmount() <= APPROVAL_LIMIT;
        }

        @Override
        protected void handle(PurchaseRequest request) {
            System.out.printf("  [APPROVED] %s (Team Lead) approved request %s%n", name, request);
        }
    }

    /**
     * Approves department expenses up to $10,000.
     */
    public static class DepartmentManager extends Approver {
        private static final double APPROVAL_LIMIT = 10_000.0;

        public DepartmentManager(String name) {
            super(name);
        }

        @Override
        protected boolean canHandle(PurchaseRequest request) {
            return request.getAmount() <= APPROVAL_LIMIT;
        }

        @Override
        protected void handle(PurchaseRequest request) {
            System.out.printf("  [APPROVED] %s (Department Manager) approved request %s%n", name, request);
        }
    }

    /**
     * Approves business unit expenses up to $50,000.
     */
    public static class Director extends Approver {
        private static final double APPROVAL_LIMIT = 50_000.0;

        public Director(String name) {
            super(name);
        }

        @Override
        protected boolean canHandle(PurchaseRequest request) {
            return request.getAmount() <= APPROVAL_LIMIT;
        }

        @Override
        protected void handle(PurchaseRequest request) {
            System.out.printf("  [APPROVED] %s (Director) approved request %s%n", name, request);
        }
    }

    /**
     * Approves executive corporate expenses up to $250,000.
     */
    public static class CEO extends Approver {
        private static final double APPROVAL_LIMIT = 250_000.0;

        public CEO(String name) {
            super(name);
        }

        @Override
        protected boolean canHandle(PurchaseRequest request) {
            return request.getAmount() <= APPROVAL_LIMIT;
        }

        @Override
        protected void handle(PurchaseRequest request) {
            System.out.printf("  [APPROVED] %s (CEO) approved executive request %s%n", name, request);
        }
    }

    // -------------------------------------------------------------------------
    // 4. Client Demonstration
    // -------------------------------------------------------------------------
    public static void main(String[] args) {
        // Construct the chain:
        // Compliance -> TeamLead -> DepartmentManager -> Director -> CEO
        Approver compliance = new ComplianceOfficer("Harvey Specter");
        Approver lead = new TeamLead("Alice");
        Approver manager = new DepartmentManager("Bob");
        Approver director = new Director("Carol");
        Approver ceo = new CEO("David");

        compliance.setNext(lead)
                  .setNext(manager)
                  .setNext(director)
                  .setNext(ceo);

        System.out.println("=== Chain of Responsibility Demonstration ===");

        PurchaseRequest[] requests = {
            new PurchaseRequest("REQ-101", "Office Supplies", 350.0, false),
            new PurchaseRequest("REQ-102", "Developer Laptops", 6_200.0, false),
            new PurchaseRequest("REQ-103", "Data Center Server Migration", 38_000.0, false),
            new PurchaseRequest("REQ-104", "Enterprise Software Licensing", 120_000.0, false),
            new PurchaseRequest("REQ-105", "Acquisition of Startup", 1_000_000.0, false),
            new PurchaseRequest("REQ-106", "Vendor Security Audit Software", 4_500.0, true)
        };

        for (PurchaseRequest request : requests) {
            System.out.println("\nProcessing: " + request);
            compliance.process(request);
        }

        // Demonstrating dynamic chain reconfiguration:
        System.out.println("\n=== Dynamic Chain Reconfiguration (Fast-Track: Director -> CEO only) ===");
        director.setNext(ceo); // Bypasses Compliance, TeamLead, and Manager
        PurchaseRequest urgentRequest = new PurchaseRequest("REQ-107", "Emergency Cloud Burst", 15_000.0, false);
        System.out.println("Processing: " + urgentRequest);
        director.process(urgentRequest);
    }
}
