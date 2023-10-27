package lectures

object Evaluation {

  // Expressions evaluation

  val evaluatedWhenDefined = println("Only once")

  lazy val evaluatedWhenFirstAccessed = println("Only once, but in a lazy way.")

  // A method is evaluated every time is called
  def myMethod = ???

  // Parameters evaluation

  // Normal (by-value) --> immediate evaluation
  def otherMethod(a: Int): Unit = ???

  // By-name --> evaluated every time they are  accessed
  def otherMethod2(number: () => Int): Unit = ???
  def otherMethod3(number: => Int): Unit = ???

}
