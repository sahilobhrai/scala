
object Calculator {
  def main(args : Array[String])={
    print("Enter the number1 : ");
    val a:Double = scala.io.StdIn.readDouble();
    print("Enter the number2 : ");
    val b:Double = scala.io.StdIn.readDouble();
    print("Enter the operator : ");
    val c:Char = scala.io.StdIn.readChar();
    print(a + " " + c + " " + b + " = " + calc(a,b,c));
  }
  
  def calc(a:Double,b:Double,c:Char):Double=
  {
	  var add = (x:Double,y:Double) => x+y;
	  var sub = (x:Double,y:Double) => x-y;
	  var mul = (x:Double,y:Double) => x*y;
	  var div = (x:Double,y:Double) => x/y;
	  var d:Double=0;
	  if(c=='+')
	    return add(a,b);
	  else if(c=='-')
	    return sub(a,b);
    else if(c=='*')
		  return mul(a,b);
    else
      return div(a,b);	  
  }
}