import org.scalatest.{FunSpec, Matchers}

class Problem205 extends FunSpec with Matchers {

  /*
  2.05 (**) Goldbach's conjecture.
  Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers.
  Example: 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case.
  It has been numerically confirmed up to very large numbers (much larger than we can go with our Prolog system).
   Write a predicate to find the two prime numbers that sum up to a given even integer.

   */
  def goldbach(number: Int): (Int, Int) = {
    throw new NotImplementedError()
  }

  it("should determine Goldbach of 28") {
    val golbach28 = goldbach(28)
    (golbach28._1 + golbach28._2) should be (28)
    isPrime(golbach28._1) should be (true)
    isPrime(golbach28._2) should be (true)
  }

  def isPrime(n: Int): Boolean = ! ((2 until n-1) exists (n % _ == 0))

}