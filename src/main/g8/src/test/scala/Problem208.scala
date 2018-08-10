import org.scalatest.{FunSpec, Matchers}

class Problem208 extends FunSpec with Matchers {

  /*
2.08 (*) Determine whether two positive integer numbers are coprime.
Two numbers are coprime if their greatest common divisor equals 1.
Example:
?- coprime(35, 64).
Yes
   */
  def coprime(number1: Int, number2: Int): Boolean = {
    throw new NotImplementedError()
  }

  it("should determine coprime ") {
    coprime(35,64) should be (true)
  }

}