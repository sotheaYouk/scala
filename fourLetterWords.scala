object forEachCondition{
    def main(args: Array[String]){
        var nameList = List[String]("Alex", "Aloha", "Hola", "Bob")

        nameList.foreach(c => if(c.length == 4) println("yes") else println("no"))

        nameList.foreach(c => if(c.length>3) println("yes") else println("no"))
          
    }
}