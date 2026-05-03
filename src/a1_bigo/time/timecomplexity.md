Time Complexity
===============

1\. What is Time Complexity?
----------------------------

Time complexity describes how the running time of an algorithm grows as the input size grows. It is usually estimated by counting how many elementary operations an algorithm performs, rather than measuring the exact time on a specific machine. That is why time complexity is about growth rate, not stopwatch time.

A key idea is that the actual runtime of the same code can vary across machines, loads, compilers, and inputs of the same size. Time complexity tries to remove those differences and focus on how the work scales.

* * * * *

2\. Why Time Complexity Matters
-------------------------------

Time complexity helps you compare algorithms in a way that still makes sense when the input becomes large. Two solutions may feel similar on a tiny dataset, but the one with the slower growth rate usually becomes much better as the input grows.

It is useful because it helps you:

-   predict how code behaves at scale,
-   choose between competing approaches,
-   spot expensive loops or repeated work,
-   and avoid algorithms that become too slow as data grows.

* * * * *

3\. How Time Complexity Is Written
----------------------------------

Time complexity is commonly written using asymptotic notation, especially Big-O. Big-O gives an upper bound on growth. In the same family, Big-Ω gives a lower bound and Big-Θ gives a tight bound. These notations are used because exact formulas are often messy, and the important question is usually how the growth behaves for large input sizes.

For most programming discussions, the complexity is expressed in terms of `n`, where `n` is the input size.

* * * * *

4\. Best Case, Average Case, Worst Case
---------------------------------------

An algorithm can take different amounts of time on different inputs of the same size. That is why time complexity is often discussed in three ways:

-   **Best case**: the fastest possible input arrangement.
-   **Average case**: the typical expected running time over inputs of that size.
-   **Worst case**: the maximum time needed for any input of that size.

In practice, worst-case analysis is very common because it gives a safe guarantee. Average-case analysis is used when the input distribution is known or meaningful.

* * * * *

5\. How to Think About It
-------------------------

A good mental model is:

> Count how the number of steps grows when `n` grows.

-   If the work stays the same no matter how big `n` gets, it is constant.
-   If the work grows by one step per item, it is linear.
-   If the work doubles with each new item, it grows much faster and becomes expensive quickly.

* * * * *

6\. Common Time Complexity Types
--------------------------------

Below is a practical list of the main time complexity classes commonly discussed in computer science, from smaller growth to larger growth. Wikipedia's table of common time complexities includes these classes and related examples.

### 6.1 Constant Time --- `O(1)`

The runtime does not grow with input size. It stays roughly the same no matter how large the input is. Common examples include accessing one array element or reading a variable.

```
int first = arr[0];
```

This is `O(1)` because it does one direct access.

* * * * *

### 6.2 Inverse Ackermann Time --- `O(α(n))`

This grows so slowly that it is treated as almost constant in practice. It appears in advanced data structures such as disjoint set union / union-find with path compression.

```
// Example use case: union-find operations
int find(int x) {
    if (parent[x] != x) parent[x] = find(parent[x]);
    return parent[x];
}
```

This style of operation is often analyzed with inverse Ackermann growth in advanced settings.

* * * * *

### 6.3 Iterated Logarithmic Time --- `O(log* n)`

This is the number of times you must repeatedly take the logarithm before the value becomes small. It grows even more slowly than ordinary logarithmic time. It is mostly seen in theoretical algorithms.

* * * * *

### 6.4 Log-Logarithmic Time --- `O(log log n)`

This grows extremely slowly, slower than `O(log n)`. It appears in some specialized data structures and priority-queue analyses.

* * * * *

### 6.5 Logarithmic Time --- `O(log n)`

The work grows slowly as the input grows. A classic example is binary search, where each step cuts the search space roughly in half.

```
int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;

        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }

    return -1;
}
```

This is `O(log n)` because the search space is reduced by about half each iteration.

* * * * *

### 6.6 Polylogarithmic Time --- `O((log n)^k)`

This means a polynomial in logarithms, such as `O((log n)^2)` or `O((log n)^3)`. It grows faster than `O(log n)` but much slower than linear time.

* * * * *

### 6.7 Sublinear / Fractional Power Time --- `O(n^c)` where `0 < c < 1`

This is slower than linear time and faster than logarithmic time. The Wikipedia table lists examples such as `O(√n)` and `O(n^(2/3))`. These appear in more specialized algorithms.

* * * * *

### 6.8 Linear Time --- `O(n)`

The work grows in direct proportion to the input size. Scanning an array once is the classic example.

```
int sum = 0;

for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
```

This is `O(n)` because each element is processed once.

* * * * *

### 6.9 `n log* n` Time --- `O(n log* n)`

This is a very small growth class that is slightly above linear time. It appears in some advanced geometry and divide-and-conquer style algorithms.

* * * * *

### 6.10 Linearithmic Time --- `O(n log n)`

This is a very important practical class. It often appears in efficient comparison-based sorting algorithms and divide-and-conquer methods. Many high-quality general-purpose sorts fall here.

```
void mergeSort(int[] arr, int left, int right) {
    if (left >= right) return;

    int mid = left + (right - left) / 2;

    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);

    merge(arr, left, mid, right);
}
```

Merge sort is typically `O(n log n)` because it splits the array and then merges across levels.

* * * * *

### 6.11 Quasilinear Time --- `O(n polylog n)`

This means `n` multiplied by a polylogarithmic factor, such as `n log^2 n`. It is close to linearithmic growth and appears in more advanced algorithms.

* * * * *

### 6.12 Quadratic Time --- `O(n²)`

The work grows with the square of input size. Nested loops over the same input are the most common reason. Bubble sort and insertion sort are classic examples in the worst case.

```
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // constant work
    }
}
```

This is `O(n²)` because each element is paired with many others.

* * * * *

### 6.13 Cubic Time --- `O(n³)`

The work grows with the cube of the input size. This often comes from three nested loops. Naive matrix multiplication is a common example.

```
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            // constant work
        }
    }
}
```

This is `O(n³)` because the inner work is repeated across three dimensions.

* * * * *

### 6.14 Polynomial Time --- `O(n^k)`

This is any fixed power of `n`, such as `O(n²)`, `O(n³)`, or `O(n¹⁰)`. In complexity theory, polynomial time is an important broad category because many problems solvable efficiently in theory fall here.

* * * * *

### 6.15 Quasi-Polynomial Time

This is slower than polynomial time but faster than exponential time. Wikipedia lists forms such as `2^(poly(log n))` and `n^(log log n)`. These are mostly theoretical and arise in certain hard problems and approximation algorithms.

* * * * *

### 6.16 Sub-Exponential Time

This grows faster than any polynomial, but still slower than standard exponential time. The Wikipedia page gives two common formal definitions, including `O(2^(n^ε))` for every `ε > 0`, and `2^o(n)`.

* * * * *

### 6.17 Exponential Time --- `O(2^n)`

The work doubles with each extra unit of input. This becomes expensive very quickly and is common in brute-force search over subsets or combinations.

```
void subsets(int[] nums, int index, List<Integer> current) {
    if (index == nums.length) {
        return;
    }

    subsets(nums, index + 1, current);      // skip

    current.add(nums[index]);
    subsets(nums, index + 1, current);      // take

    current.remove(current.size() - 1);
}
```

This style of subset generation explores two choices per element, which leads to exponential growth.

* * * * *

### 6.18 Factorial Time --- `O(n!)`

This grows even faster than exponential time. It appears when generating all permutations. It is usually impractical except for very small inputs.

```
void permute(int[] nums, boolean[] used, List<Integer> current) {
    if (current.size() == nums.length) {
        return;
    }

    for (int i = 0; i < nums.length; i++) {
        if (used[i]) continue;

        used[i] = true;
        current.add(nums[i]);

        permute(nums, used, current);

        current.remove(current.size() - 1);
        used[i] = false;
    }
}
```

Generating all permutations leads to factorial growth.

* * * * *

### 6.19 Double Exponential Time --- `O(2^(2^n))`

This is an extremely fast-growing class that is usually only discussed in theory, not normal programming practice. It is far beyond typical brute-force exponential algorithms.

* * * * *

7\. Reading Time Complexity Correctly
-------------------------------------

A few quick rules make time complexity easier to read:

-   A single loop over `n` items is usually `O(n)`.
-   Nested loops over `n` and `n` are usually `O(n²)`.
-   Splitting the work in half repeatedly often gives `O(log n)`.
-   Recursive branching often leads to exponential or factorial growth.

* * * * *

8\. Common Misunderstandings
----------------------------

### Time complexity is not the same as actual runtime

Two programs with the same Big-O can run at very different speeds on real machines because of hardware, compiler behavior, cache effects, and constant factors. Time complexity ignores those details on purpose.

### Smaller Big-O is not always faster for tiny inputs

A more complicated algorithm with a better growth rate can still lose on small inputs because of overhead and constants. The advantage usually appears when the input gets large.

### Big-O is not the full story

Time complexity tells you about growth, but not memory use, readability, implementation cost, or real-world system behavior. It is one important lens, not the only one.

* * * * *

9\. Practical Takeaway
----------------------

Time complexity is mainly about scalability. It helps you understand how the number of operations grows as the input grows, which is why it matters so much when data gets large. For many real programs, the gap between `O(n)` and `O(n²)` becomes huge as input scales.

* * * * *

10\. Quick Summary
------------------

-   `O(1)` is constant.
-   `O(log n)` is very slow growth.
-   `O(n)` grows once per item.
-   `O(n log n)` is common in efficient sorting.
-   `O(n²)` and above get expensive quickly.
-   `O(2^n)` and `O(n!)` are usually only usable for small inputs.

* * * * *

References
----------

-   [Time complexity --- Wikipedia](https://en.wikipedia.org/wiki/Time_complexity?utm_source=chatgpt.com)
-   [Understanding Time Complexity with Simple Examples --- GeeksforGeeks](https://www.geeksforgeeks.org/dsa/understanding-time-complexity-simple-examples/?utm_source=chatgpt.com)
-   [Big O Cheat Sheet -- Time Complexity Chart --- freeCodeCamp](https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/?utm_source=chatgpt.com)
-   [What is the point of learning time complexity? --- Reddit discussion](https://www.reddit.com/r/learnprogramming/comments/xsy52e/what_is_the_point_of_learning_time_complexity/?utm_source=chatgpt.com)