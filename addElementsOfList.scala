object addEleOfList{
    def main(args: Array[String]){
        // var l = List(12, 14, 16,19)
        // var sum =0;
        // l.foreach(c => (sum = sum + c))
        // println("sum of all elements is " + sum)

    //var f: Float=0.0f
    var sum: Int = 0; 
    var str = ""
    var fl: Float= 0
        var t = ("Sothea", "Wann", 102, 89, "Dane", 67, "Chhay", 8.9f, 5859.90f)
         t.productIterator.foreach{
             case i: Int => sum = sum +i;
             case s: String=> str = str + s
             case f: Float => fl = fl +f
         }
         println("integer: " +sum + " string: " +str + " float: " + fl)

        
    }
}