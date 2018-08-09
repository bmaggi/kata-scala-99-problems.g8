import org.scalatest.{FunSpec, Matchers}

class Problem101 extends FunSpec with Matchers {

  /*
  1.01 (*) Find the last element of a list.
  */
  def lastElement[T](list: List[T]): T = {
    throw new NotImplementedError()
  }

  it("should find last element") {
    val last = lastElement(List("a", "b", "c", "d"))
    last should be("d")
  }

  it("should find the unique element") {
    val last = lastElement(List("a"))
    last should be("a")
  }
}