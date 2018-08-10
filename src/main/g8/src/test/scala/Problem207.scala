import org.scalatest.{FunSpec, Matchers}

class Problem207 extends FunSpec with Matchers {

  /*
2.07 (**) Determine the greatest common divisor of two positive integer numbers.
Use Euclid's algorithm.
Example:
?- gcd(36, 63, G).
G = 9

Define gcd as an arithmetic function; so you can use it like this:
?- G is gcd(36,63).
G = 9
   */
  def gcd(n1: Int, n2: Int): Int = {
    throw new NotImplementedError()
  }

  it("should determine Goldbach of 28") {
    gcd(36,63) should be (9)
  }

}