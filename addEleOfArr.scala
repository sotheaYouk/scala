object addingArray{
    
    def main(args: Array[String])
    {
        var sum = 0
        var arr = new Array[Int](20) 
        var arr2 = new Array[Int](20)
        var arr3 = new Array[Int](20)
        var max=0

        println("enter size of array: ")
        var size = scala.io.StdIn.readInt()

        println("enter each element of the array: ")
        for(i <- 0 to size-1)
        {
            arr(i)=  scala.io.StdIn.readInt();
            println(arr(i));
            sum += arr(i);
        }
        println("sum of all elements is "+sum);

        println("find the biggest number: ")
        max = arr(0)
        for(i <- 1 to size-1)
        {
            if(max>arr(i))
               max = max 
            else 
                max = arr(i) 

        }
        println("the biggest number is " + max)

        println("enter each element of the array2: ")
        for(i <- 0 to size-1)
        {
            arr2(i)=  scala.io.StdIn.readInt();
            println(arr2(i))          
        }


        println("concatenation of the two arrays: ")
        for(i <- 0 to size-1)
        {
            arr3(i) = arr(i) + arr2(i)
            println(arr3(i))
        }
        



    }
}