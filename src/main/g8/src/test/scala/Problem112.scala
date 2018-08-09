import org.scalatest.{FunSpec, Matchers}

class Problem112 extends FunSpec with Matchers {

  /*
1.12 (**) Decode a run-length encoded list.
Given a run-length code list generated as specified in problem 1.11.
 Construct its uncompressed version.
  */
  def decodeLengthEncoding[T](list: List[T]): List[(Int, T)] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val decoded = decodeLengthEncoding(List((4,'a'), 'b',(2,'c'), 'd', (4,'e')))
    decoded should be(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e'))
  }


}