import org.scalatest.{FunSpec, Matchers}

class Problem117 extends FunSpec with Matchers {

  /*
1.17 (*) Split a list into two parts; the length of the first part is given.
Do not use any predefined predicates.

Example:
?- split([a,b,c,d,e,f,g,h,i,k],3,L1,L2).
L1 = [a,b,c]
L2 = [d,e,f,g,h,i,k]
  */
  def listSplit[T](list: List[T]): List[(Int, T)] = {
    throw new NotImplementedError()
  }

  it("should split the list ") {
    val last = listSplit( List.range('a', 'l'))
    last should be(List.range('a', 'e'), List.range('d', 'l'))
  }


}