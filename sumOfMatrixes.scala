object sumOfMatrices{
    def main(args: Array[String])
    {
    
        var  a1 = Array.ofDim[Int](2, 2)
        var  a2 = Array.ofDim[Int](2, 2)
        var  a3 = Array.ofDim[Int](2, 2)

        var j=0;       
        for(i <- 0 to 1)
        {
            for(j <-0 to 1)
            {
                println(s"input element $i$j of matrix one")
                a1(i)(j)= scala.io.StdIn.readInt()   
                    
            }
                
        }

        for(i <- 0 to 1)
        {
            for(j <-0 to 1)
            {
                println(s"input element $i$j of matrix two")
                a2(i)(j)= scala.io.StdIn.readInt()  
            }
                     
        }

        println("sum of 2 matrixes is ")
        for(i<- 0 to 1)
        {
             for(j<- 0 to 1)
            {
                 a3(i)(j)= a1(i)(j) + a2(i)(j)
                 println(a3(i)(j))
            }   
        }
              
    }
}
