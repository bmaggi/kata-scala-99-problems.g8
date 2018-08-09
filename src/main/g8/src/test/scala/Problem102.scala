package tests

import org.scalatest.{FunSpec, Matchers}

class Problem102 extends FunSpec with Matchers {

  /*
  1.02 (*) Find the last but one element of a list.
  */
  def lastElement[T](list: List[T]): T = {
    throw new NotImplementedError()
  }

  it("should find last but one element") {
    val last : String = lastElement(List("a", "b", "c", "d"))
    last should be("c")
  }

  it("should find the firt element") {
    val last = lastElement(List("a","b"))
    last should be("a")
  }

}