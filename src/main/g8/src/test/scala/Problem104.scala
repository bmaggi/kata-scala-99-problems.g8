import org.scalatest.{FunSpec, Matchers}

class Problem104 extends FunSpec with Matchers {

  /*
  1.04 (*) Find the number of elements of a list.
   */
  def listSize[T](list: List[T]): Int = {
    throw new NotImplementedError()
  }

  describe("Example: size([a,b,c,d,e] give 5") {
    it("should find the correct element") {
      val size = listSize(List('a', 'b', 'c', 'd', 'e'))
      size should be(5)
    }

  }

}