object findHigherMarks{
    def main(args: Array[String])
    {
        var irene=Array(5,6,20,35);
        var wendy=Array(10, 6, 15, 44);
        
        
        for(i <- 0 to 3)
            if(irene(i)!=wendy(i))
                println("round" + (i+1) + ": 1" );
        

    }
}