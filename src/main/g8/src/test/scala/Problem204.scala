import org.scalatest.{FunSpec, Matchers}

class Problem204 extends FunSpec with Matchers {

  /*
2.04 (*) A list of prime numbers.
Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
  */
  def primeList(lowerBound: Int, upperBound: Int): List[Int] = {
    throw new NotImplementedError()
  }

  it("should determine 5 as prime between 4 and 6") {
    primeList(4,6) should be (List(5))
  }

}