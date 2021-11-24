object RevList {
  def main(args: Array[String]): Unit = {
    var a=List.fill(10)(51)
    println("Uniform List:");
    for(i<- a)
      println(i);
    
    var b=List.range(2, 10)
    println("Original List:");
    for(i<- b)
      println(i);
    b=b.reverse;
    println("Reversed List:");
    for(i<- b)
      println(i);
  }
}