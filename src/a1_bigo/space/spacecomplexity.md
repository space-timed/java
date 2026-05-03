Space Complexity
================

1\. What is Space Complexity?
-----------------------------

Space complexity measures how much **memory** an algorithm uses as the input size grows.

> It answers: **How much memory does this algorithm need as input increases?**

It includes:

-   Memory for input
-   Memory for variables
-   Memory for function calls
-   Memory for temporary data structures

Formally:

> Space complexity = **Total memory required as a function of input size**

* * * * *

2\. Components of Space Complexity
----------------------------------

Space complexity is made up of two main parts:

### 2.1 Input Space

-   Memory used to store input data
-   Example: an array of size `n` → `O(n)`

* * * * *

### 2.2 Auxiliary Space

-   Extra memory used by the algorithm (temporary variables, data structures, recursion stack)

> Auxiliary space is often what we actually care about in practice

* * * * *

### Key Insight

-   **Space Complexity = Input Space + Auxiliary Space**
-   But in interviews:

    > People usually refer to **auxiliary space** when they say "space complexity"

* * * * *

3\. Fixed vs Variable Space
---------------------------

### 3.1 Fixed Part (Constant)

-   Independent of input size
-   Includes:
    -   Variables
    -   Constants
    -   Program instructions

* * * * *

### 3.2 Variable Part

-   Depends on input size
-   Includes:
    -   Arrays
    -   Data structures
    -   Recursion stack

* * * * *

4\. Types of Space Complexity
-----------------------------

- O(1) — Constant space complexity
- O(log n) — Logarithmic space complexity
- O(n) — Linear space complexity
- O(n log n) — Linearithmic space complexity
- O(n^2) — Quadratic space complexity
- O(2^n) — Exponential space complexity
- O(n!) — Factorial space complexity

### 4.1 Constant Space --- O(1)

Memory does not grow with input size.

```
int sum(int[] arr) {  
  int total = 0;  // constant space    
  for (int i = 0; i < arr.length; i++) { 
         total += arr[i];    
         }    
 return total;
 }
```

-   Only a few variables used
-   No extra memory → **O(1)**

* * * * *

### 4.2 Linear Space --- O(n)

Memory grows proportionally with input.

```
int[] copyArray(int[] arr) {
    int[] copy = new int[arr.length];  // O(n) 
    for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];    
        }    
    return copy;
    }
```

-   New array of size `n`
-   → **O(n)** space

* * * * *

### 4.3 Logarithmic Space --- O(log n)

Memory grows slowly with input.

Usually comes from **recursion depth**.

```
int binarySearch(int[] arr, int left, int right, int target) {
    if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == target) 
            return mid;    
        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, right, target);    
            }
        }
```

-   Each recursive call adds stack memory
-   Depth ≈ log(n)
-   → **O(log n)** space

* * * * *

### 4.4 Linearithmic Space --- O(n log n)

Occurs when:

-   Multiple recursive levels
-   Each level uses linear memory

Example: some divide-and-conquer algorithms

* * * * *

### 4.5 Quadratic Space --- O(n²)

Memory grows as square of input.

```
int[][] createMatrix(int n) {
    return new int[n][n];  // O(n²)
    }
```

-   2D array
-   → **O(n²)** space

* * * * *

### 4.6 Exponential Space --- O(2ⁿ)

Memory grows extremely fast.

Example: storing all subsets

```
void generateSubsets(int[] arr, List<List<Integer>> result, List<Integer> current, int index) {
    if (index == arr.length) {
            result.add(new ArrayList<>(current));  // stores subsets        
            return;    
        }    
    generateSubsets(arr, result, current, index + 1);    
    current.add(arr[index]);    
    generateSubsets(arr, result, current, index + 1);    
    current.remove(current.size() - 1);
    }
```

-   Stores all subsets → `2ⁿ`
-   → **O(2ⁿ)** space

* * * * *

### 4.7 Factorial Space --- O(n!)

Used in permutations:

```
void permute(int[] nums, List<List<Integer>> result, List<Integer> current, boolean[] used) {
    if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));  // n! permutations        
            return;    
        }    
        for (int i = 0; i < nums.length; i++) {        
        if (used[i]) 
            continue;        
            
            used[i] = true;        
            current.add(nums[i]);        
            
            permute(nums, result, current, used);        
            
            current.remove(current.size() - 1);        
            used[i] = false;    
        }
    }
```

-   Stores all permutations
-   → **O(n!)** space

* * * * *

5\. Recursion and Space Complexity
----------------------------------

Recursion uses **call stack memory**.

Example:

```
int sum(int n) {
    if (n == 0) return 0;
    return n + sum(n - 1);
}
```

-   Calls stack up to `n`
-   → **O(n)** space

* * * * *

### Important Insight

-   Recursive depth = space complexity
-   Iterative version can reduce space

* * * * *

6\. In-Place Algorithms
-----------------------

An algorithm is **in-place** if it uses constant extra memory.

Example:

```
void reverse(int[] arr) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
```

-   No extra data structures
-   → **O(1)** space

* * * * *

7\. How to Calculate Space Complexity
-------------------------------------

### Step-by-step:

1.  Identify input size → `n`
2.  Count:
    -   Variables → constant
    -   Arrays → depends on size
    -   Recursion → stack depth
    -   Data structures → size-dependent
3.  Form expression
4.  Drop constants → Big O

* * * * *

### Example:

```
int[] arr = new int[n];   // O(n)
int x = 0;                // O(1)
```

Total:

```
O(n + 1) → O(n)
```

* * * * *

8\. Space Complexity vs Auxiliary Space
---------------------------------------

This is a common confusion:

| Term | Meaning |
| --- | --- |
| Space Complexity | Total memory (input + extra) |
| Auxiliary Space | Extra memory only |

Example:

-   Input array: `O(n)`
-   Extra array: `O(n)`

→ Space Complexity = `O(n)`\
→ Auxiliary Space = `O(n)`

* * * * *

9\. Space vs Time Trade-off
---------------------------

Often:

> You can reduce time by using more space

Example:

-   Using a HashMap:
    -   Faster lookups → more memory

This is called a **space-time trade-off**

* * * * *

10\. Key Observations
---------------------

-   Space grows with:
    -   Data structures
    -   Recursion depth
    -   Stored results
-   Constants are ignored in Big O
-   Memory constraints matter in:
    -   Embedded systems
    -   Large-scale systems
    -   Competitive programming

* * * * *

11\. Common Pitfalls
--------------------

### ❌ Ignoring recursion stack

✔️ Recursion uses memory

* * * * *

### ❌ Confusing input with auxiliary space

✔️ Input may or may not be counted (context matters)

* * * * *

### ❌ Forgetting temporary structures

✔️ Arrays, maps, stacks all count

* * * * *

### ❌ Thinking loops increase space

✔️ Loops affect time, not space (unless storing data)

* * * * *

12\. Mental Model
-----------------

Think of space complexity as:

> "How much memory does this need as input becomes huge?"

* * * * *

13\. References
---------------

-   <https://www.geeksforgeeks.org/dsa/g-fact-86/>
-   <https://www.datacamp.com/tutorial/space-complexity>
-   <https://www.baeldung.com/cs/space-complexity>