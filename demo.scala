object demo{
  def main(args: Array[String]): Unit={
    println("input your age");
    var age=scala.io.StdIn.readInt();
    for(i <- 0 to age, )
    {
      if(i%4!=0)
      {
        println(i);
      }

    }
  }

}

