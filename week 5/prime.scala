import scala.math
object primeCheck {
  def main(args : Array[String])={
    val x:Int=scala.io.StdIn.readInt();
    if(isPrime(x))
      println(x+" is prime.");
    else
      println(x+" is not prime.");
  }
  
  def isPrime(x:Int):Boolean={
		  for(i<-2 to math.sqrt(x).asInstanceOf[Int])
		    if(x%i==0)
		      return false;
		  return true;
  }
}