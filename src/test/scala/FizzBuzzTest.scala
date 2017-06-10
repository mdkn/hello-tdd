import org.scalatest._

/**
  * Created by madokan on 6/10/17.
  */
class FizzBuzzTest extends FreeSpec with Matchers {

  "Test of FizzBuzz" - {
    "Num" - {
      "1 to String 1" in {
        val fizzbuzz = new FizzBuzz()
        fizzbuzz.convert(1) should be ("1")
      }
    }
    "Fizz" - {
      "3 to Fizz" in {
        val fizzbuzz = new FizzBuzz()
        fizzbuzz.convert(3) should be ("Fizz")
      }
    }
    "Buzz" - {
      "6 to Buzz" in {
        val fizzbuzz = new FizzBuzz()
        fizzbuzz.convert(5) should be("Buzz")
      }
    }
    "FizzBuzz" - {
      "15 to FizzBuzz" in {
        val fizzbuzz = new FizzBuzz()
        fizzbuzz.convert(15) should be("FizzBuzz")
      }
    }
  }
}
