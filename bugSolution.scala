```scala
class MyClass {
  private val myVar: Int = 0

  def myMethod(x: Int): Int = {
    myVar + x 
  }

  // Solution: Explicitly use a new variable to handle additions
  def myMethodSafe(x: Int): Int = {
     val result = myVar + x
     result
  }
}
```