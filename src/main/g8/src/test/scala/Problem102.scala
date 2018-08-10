import org.scalatest.{FunSpec, Matchers}

class Problem102 extends FunSpec with Matchers {

  /*
  1.02 (*) Find the last but one element of a list.
  */
  def lastButOne[T](list: List[T]): T = {
    throw new NotImplementedError()
  }

  it("should find last but one element") {
      lastButOne(List.range('a','e')) should be('c')
  }

  it("should find the first element") {
    lastButOne(List.range(1,3)) should be(1)
  }

  it("should throw a NoSuchElementException") {
    val thrown = intercept[Exception] {
      lastButOne(List(1))
    }
    thrown shouldBe a [NoSuchElementException]
  }

}