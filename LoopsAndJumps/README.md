# Core Java Loops and Jump Statements

Each `.java` file is a standalone example with its own `main` method. Compile
and run one example at a time from this folder:

```text
javac ForLoop.java
java ForLoop
```

- `ForLoop.java` — counting `for` loops and enhanced for loops
- `WhileLoops.java` — condition-controlled `while` and `do-while`
- `NestedLoops.java` — loop inside a loop and printed patterns
- `BreakContinue.java` — exiting an iteration or skipping to the next one
- `LabeledBreakContinue.java` — directing `break` and `continue` to an outer
  loop

Keep loop conditions and updates clear. A loop whose condition never becomes
false can run forever. `break` and `continue` without a label affect the
nearest enclosing loop (or, for `break`, a switch statement).
