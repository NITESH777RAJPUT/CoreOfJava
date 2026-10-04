# Core Java Recursion

Each `.java` file is a standalone example with its own `main` method. Compile
and run one example at a time from this folder:

```text
javac RecursionBasics.java
java RecursionBasics
```

- `RecursionBasics.java` — base case, recursive case and progress toward the
  stopping condition
- `Factorial.java` — factorial using recursion and a loop
- `Fibonacci.java` — Fibonacci sequence and the cost of repeated recursive
  work
- `SumOfDigits.java` — splitting a number into its last digit and remainder
- `ArrayRecursion.java` — recursive array sum and linear search
- `Palindrome.java` — comparing characters from the outside inward
- `RecursiveBinarySearch.java` — divide-and-conquer search in a sorted array
- `RecursionVsIteration.java` — the same summation written both ways

Every recursive path must eventually reach a base case. Each recursive call
should make progress toward it. Calls use the thread's call stack, so extremely
deep recursion can cause `StackOverflowError`; a loop may be a better fit for
simple repetition. Numeric examples can also overflow their Java numeric type
when the input becomes large.
