

object rangeFoobar{
    def main(args: Array[String]): Unit=
    {
        var j=1;
        var numArr = Range(0, 100)
        for(i <- numArr)
        {
          
                //     println(i)
            if(i%15==0)
                println(s"$j foobar");
            else if(i%5==0)
                println(s"$j bar")
            else if(i%3==0)
                println(s"$j foo");
            else 
                println)(i)

            
       }
    }
}