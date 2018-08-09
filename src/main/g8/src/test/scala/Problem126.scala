import org.scalatest.{FunSpec, Matchers}

class Problem126 extends FunSpec with Matchers {

  /*
1.26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list
In how many ways can a committee of 3 be chosen from a group of 12 people?
We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficients). For pure mathematicians, this result may be great. But we want to really generate all the possibilities (via backtracking).

Example:
?- combination(3,[a,b,c,d,e,f],L).
L = [a,b,c] ;
L = [a,b,d] ;
L = [a,b,e] ;
  */
  def combination[T](pick:Int, list: List[T]): List[List[T]] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val last = combination(3, List.range('a','l'))
    last should be(List('a', 'b', 'c', 'd', 'e'))
    // TODO: How to test random + huge ?
  }


}