import org.scalatest.{FunSpec, Matchers}

class Problem119 extends FunSpec with Matchers {

  /*
1.19 (**) Rotate a list N places to the left.
Examples:
?- rotate([a,b,c,d,e,f,g,h],3,X).
X = [d,e,f,g,h,a,b,c]

?- rotate([a,b,c,d,e,f,g,h],-2,X).
X = [g,h,a,b,c,d,e,f]

Hint: Use the predefined predicates length/2
and append/3, as well as the result of problem 1.17.
  */
  def rotate[T](list: List[T], rotation: Int): List[T] = {
    throw new NotImplementedError()
  }

  it("should rotate the list by 3 ") {
    val rotated = rotate(List.range('a','l'),3)
    rotated should be(List('d','e','f','g','h','a','b','c'))
  }

  it("should rotate the list by -2") {
    val rotated = rotate(List.range('a','l'),-2)
    rotated should be(List('g','h','a','b','c','d','e','f'))
  }

}