package maths
import maths.Utils._
import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen

object UtilsTest extends Properties("Utils") {

    property("no even number is prime") = forAll(Gen.oneOf(3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199)){ n: Int => {
      if ((n>0) && (n % 2 == 0)) !isPrime(n) else true }
    }

    property("test factorial1") = forAll(Gen.chooseNum(1,5)){ n: Int => {
       if((n)*(n+1) == factorial(n+1)) true else false
      }
    }

    property("test factorial2") = forAll(Gen.chooseNum(4,5), Gen.chooseNum(1,3)){ (n1: Int, n2: Int) => {
        if(factorial(n1) > factorial(n2)) true else false
      }
    }
}

// Add new tests to the tests in 4.1, based on these properties:
//(n)*(n+1) = factorial(n+1), 0 < n < 6
// For all n1 > n2 ; factorial(n1) > factorial(n2), 0 < n1,n2 <6

