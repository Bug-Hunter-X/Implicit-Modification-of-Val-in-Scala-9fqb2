# Implicit Modification of Val in Scala

This repository demonstrates a common yet subtle error in Scala programming related to immutability.  While `val` variables are designed to be immutable, certain operations can indirectly modify their behavior, potentially leading to unexpected side effects and difficult-to-debug issues.

The `bug.scala` file showcases this issue.  The `bugSolution.scala` offers a correction, illustrating how to avoid such pitfalls.