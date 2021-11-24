import scala.math

object predefMethod {
  def main(args: Array[String]): Unit = {
    print("Enter the number : ");
    val x:Double = scala.io.StdIn.readDouble();
    print("Enter the power : ");
    val y:Double = scala.io.StdIn.readDouble();
    
    println(x + " ^ " + y + " = " + math.pow(x, y));
    
  }
}