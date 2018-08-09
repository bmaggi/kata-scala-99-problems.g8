import org.scalatest.{FunSpec, Matchers}

class Problem105 extends FunSpec with Matchers {

  /*
  1.05 (*) Reverse a list.
   */
  def listReverse[T](list: List[T]): List[T] = {
    throw new NotImplementedError()
  }

    it("should reverse the list") {
      val el = listReverse(List('a', 'b', 'c', 'd', 'e'))
      el should be(List('e', 'd', 'c', 'b', 'a'))
    }


}