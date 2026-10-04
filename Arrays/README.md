# Core Java Arrays

Each `.java` file is a standalone example with its own `main` method. Compile
and run one example at a time from this folder:

```text
javac ArrayBasics.java
java ArrayBasics
```

Topics covered:

- `ArrayBasics.java` — declaration, creation, initialization, default values,
  zero-based indexes and `length`
- `ArrayTraversal.java` — indexed and enhanced loops, sum, average, minimum
  and maximum
- `ArrayOperations.java` — linear search, counting, reversing and swapping
- `ArrayCopy.java` — references, cloning, `Arrays.copyOf` and
  `System.arraycopy`
- `ArraysUtility.java` — sorting, binary search, filling, comparisons and
  range copies with `java.util.Arrays`
- `TwoDimensionalArray.java` — rectangular two-dimensional arrays
- `JaggedArray.java` — rows with different lengths
- `ObjectArray.java` — arrays of object references
- `Varargs.java` — variable arguments and their relationship to arrays

Important facts:

- Arrays have a fixed length after creation.
- Indexes start at `0`; the last valid index is `length - 1`.
- Primitive arrays receive primitive defaults (`0`, `false`, and so on).
- Reference arrays receive `null` for each element initially.
- Assigning an array variable to another variable copies its reference. Use a
  copy method when you need a separate array.
- `Arrays.binarySearch` expects sorted input.
