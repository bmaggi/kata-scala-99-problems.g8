import org.scalatest.{FunSpec, Matchers}

class Problem121 extends FunSpec with Matchers {

  /*
1.21 (*) Insert an element at a given position into a list.
Example:
?- insert_at(alfa,[a,b,c,d],2,L).
L = [a,alfa,b,c,d]
  */
  def listInsertion[T](list: List[T], listInsertion:T, position:Int): List[T] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val last = listInsertion(List.range('a','e'),"alpha",2)
    last should be(List('a', "alpha", 'b', 'c', 'd'))
  }


}