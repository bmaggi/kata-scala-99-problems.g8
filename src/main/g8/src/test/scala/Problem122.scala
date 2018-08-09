import org.scalatest.{FunSpec, Matchers}

class Problem122 extends FunSpec with Matchers {

  /*
1.22 (*) Create a list containing all integers within a given range.
Example:
?- range(4,9,L).
L = [4,5,6,7,8,9]
  */
  def listRange(start:Int, end:Int): List[Int] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val rangedList = listRange(4,9)
    rangedList should be(List.range(4,9))
  }


}