import org.scalatest.{FunSpec, Matchers}

class Problem103 extends FunSpec with Matchers {

  /*
  1.03 (*) Find the K'th element of a list.
  The first element in the list is number 1.
   */
  def kthElement[T](list: List[T], k: Int): T = {
    throw new NotImplementedError()
  }

  describe("Example: element_at(X,[a,b,c,d,e],3) X = c") {
    it("should find the correct element") {
      kthElement(List.range('a', 'f'), 3) should be('c')
    }
  }

}