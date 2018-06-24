object Demo{
  def main(args: Array[String])
  {
    var animals= List("cow", "horse", "rabbit");
    println("print animals "+animals);
    var t= "cat" :: animals;
    println("add cat " +animals);
    println("print t " + t);

    println("print head "+animals.head);
    println("print tail " + animals.tail);

    animals = animals:+ "sheep"
    println("plus sheep " + animals)
    
    var(l,r)=animals.splitAt(3);
    println(l);
    println(r);

  }
}

