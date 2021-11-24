object forLoop {
  def main(args: Array[String]): Unit = {
    var a=0;
    // for loop execution with a range
    //by using 'to'
    for( a<- 1 to 10)
      println("Value of a : "+a);
    
    //by using 'until'
    for( a<- 1 until 10)
      println("Value of a : "+a);
    
    var b=0
    for(a<-1 to 3;b<-1 until 3){
      println("Value of a : "+a);
      println("Value of b : "+b);
    }
    
    val numList=List(1,2,3,4,5,6);
    
    for(a<-numList)
      println("Value of a : "+a);
    
		val numList2=List(1,2,3,4,5,6,7,8,9,10);
    for(a<-numList2 if a!=3;if a<8)
      println("Value of a : "+a);
		
		var retVal = for{a<-numList2 if a!=3;if a<8}yield a
		for(a<-retVal)
  		println("Value of a : "+a);
  }  
}