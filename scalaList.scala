 import scala.collection.mutable.ListBuffer

object scalaListt{
    def main(args: Array[String])
    {

        //creating a list, Kpop which receives only strings, and input some elements
        var kpop= List[String]("blackpink", "redvelvet", "exo", "bigbang", "bts");
        println("printing 5 added elements: " + kpop)

        //adding an element to the list from the start of the list and assing it to a temporary variable t
        var t= "mamamoo" :: kpop
        println("adding an element from the start: " +t)

        //adding an element to the list ffom the back
        kpop= kpop:+"got7"
        println(kpop)

        //creating a ListBuffer, which has to be imported and add some elements to it
        var fruits = new ListBuffer[String]()
        fruits += "Apple"
        fruits += "Banana"
        fruits += "Orange" 
        println("listbuffer fruits: " +fruits)

        //converting fruits to list but assign to fruit list
        var fruitsList = fruits.toList
        println("fruitsList list: " + fruitsList)


        //using slice function
        println(fruitsList.slice(0,4))

        //using head function to print the first element
        println("head: " + fruitsList.head)

        //using tail function to get all elements except the first element
        println("tail: " + fruitsList.tail)

        //printing the element in reverse order
        println("fruitsList in reverse order: "+fruitsList.reverse)

        //printing the last element 
        println("method 1: last element: " + fruitsList.reverse.head)
        println("method 2: last element: " + fruitsList.last)
        //println("method 3: last element: " + fruitsList.lastOption)

      
        //using splitAt to split the list in to 2 tuples
        var(l,r)= fruits.splitAt(2)
        println("left "+ l);
        println("right  " + r);

        //declaring 2 lists
        var list1 = List[Int](1,2,3,4,5,6,7);
        var list2 = List[Int](8,9,10,11,12,13,14);

        //concatenating 2 lists and storing into list3
        var list3 = list1:::list2;
      
        //reversing the list 
        list3 = list3.reverse;

        //printing only the odd numbers of the reversed list 
        for( i <- 0 to list3.length)
        {
            if(i%2 != 0 )
                println(i);
        }

        //collection of lists inside a list 
        var ultList = List(list1, list2, list3)

        //converting a string list to an integer list 
        println(list1.map(_.toString).map(_.toInt))

        //printing all elements of list 3 except the last one
        // for(i <- 0 to list3.length-1)
        //     println(i)
        println(list3.init)
   
}
}