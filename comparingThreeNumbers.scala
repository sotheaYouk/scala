object compareThreeNumbers{

    def usingThreeVars(): Unit=
    {
        var num1= 32;
        var num2 = 26;
        var num3=88;

        println("Print the three numbers in ascending order: ");
        if(num1>num2)
        {
            if(num1>num3 && num2>num3)
                println(num1 + " " + num2 + " " + num3);
            else if(num1>num3 && num2<num3)
                println(num1 + " " + num3 + " " + num2);
            else if(num1<num3)
                println(num3 + " " + num1 + " " + num2)
        }
        else
        {
            if(num2>num3 && num3>num1)
                println(num2 + " " + num3 + " " + num1)
            else if(num2>num3 && num3<num1)
                println(num2 + " " + num1 + " " + num3)
        }
    }

    def usingArray(): Unit={
        var num = Array(32, 26,88);
        for(x <- 0 to 2)
        {
            if(num(x)>num(x+1))
            {
                num(x)=num(x+1);                
            }
            else
            {
                num(x)=num(x);
            }
            
        }
        println(num);
            
    }
    def main(args: Array[String])
    {
        usingThreeVars();
        usingArray();
    }
}