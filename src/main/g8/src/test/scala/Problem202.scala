import org.scalatest.{FunSpec, Matchers}

class Problem202 extends FunSpec with Matchers {

  /*
2.02 (**) Determine the prime factors of a given positive integer.
Construct a flat list containing the prime factors in ascending order.
  */
  def primeDecomposition(number: Int): List[Int] = {
    throw new NotImplementedError()
  }

  it("should determine [3,3,5,7] for 315 decomposition") {
    primeDecomposition(315) should be (List(3,3,5,7))
  }

  it("should determine [3] for 3 decomposition") {
    primeDecomposition(3) should be (List(3))
  }

  it("should determine [2,3] for 6 decomposition") {
    primeDecomposition(6) should be (List(2,3))
  }  
}