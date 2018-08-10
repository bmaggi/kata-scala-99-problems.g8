import org.scalatest.{FunSpec, Matchers}

class Problem201 extends FunSpec with Matchers {

  /*
2.01 (**) Determine whether a given integer number is prime.
Example:
?- is_prime(7).
Yes
  */
  def isPrime(number: Int): Boolean = {
    throw new NotImplementedError()
  }

  it("should determine 1 as not prime") {
    isPrime(1) should be (false)
  }

  it("should determine 2 as prime") {
    isPrime(2) should be (true)
  }

  it("should determine 4 as not prime") {
    isPrime(4) should be (false)
  }

  it("should determine 7 as prime") {
    isPrime(7) should be (true)
  }

  it("should determine 9973 as prime") {
    isPrime(9973) should be (true)
  }


}