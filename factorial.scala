
    object demo{
        def fac(a: Int): Int=
    {
        if(a==0)
            1;
        else
          (a*fac(a-1));
        
    }
    def main(args: Array[String])
    {
        println(fac(5));
    }
    }
    
