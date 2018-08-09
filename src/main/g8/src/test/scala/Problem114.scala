import org.scalatest.{FunSpec, Matchers}

class Problem114 extends FunSpec with Matchers {

  /*
1.14 (*) Duplicate the elements of a list.
Example:
?- dupli([a,b,c,c,d],X).
X = [a,a,b,b,c,c,c,c,d,d]
  */
  def duplicate[T](list: List[T]): List[T] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val duplication = duplicate(List('a', 'b', 'c', 'd', 'e'))
    duplication should be(List('a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'))
  }


}