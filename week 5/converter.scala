object converter {
  def main(args: Array[String]): Unit = {
    while(true){
      println("Type :-");
      println("1) to Convert Farhenheit to Celcius degree");
      println("2) to Convert inches to meters");
      println("3) to Convert year to days");
      println("4) to Exit");
      print("Enter the choice : ");
      val ch:Int=scala.io.StdIn.readInt();
      if(ch==4)
        return;
      println("result = "+calc(ch));  
      println();
    }
  }
  
  def calc(ch:Int):Any={
		var res:Any=0; 
    ch match{
		    case 1=>print("Enter the temprature : ");
		            var t:Double=scala.io.StdIn.readDouble();
		            res=(t-32)*5/9;
		    
		    case 2=>print("Enter the length : ");
		            var l:Double=scala.io.StdIn.readDouble();
		            res=l*0.0254;
		            
		    case 3=>print("Enter the year : ");
		            var y:Int=scala.io.StdIn.readInt();
		            if(y%4==0)
		            	res = 366;
		            else 
		              res = 365;
		  }
    return res;
  }
}