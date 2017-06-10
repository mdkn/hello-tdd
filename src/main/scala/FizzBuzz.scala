/**
  * Created by madokan on 6/10/17.
  */
class FizzBuzz {
  def convert(i: Int): String = {
    if(i % 15 == 0) "FizzBuzz"
    else if(i % 3 == 0) "Fizz"
    else if(i % 5 == 0) "Buzz"
    else String.valueOf(i)
  }
}
