object demo{
    def main(args: Array[String]){
        var l = List("Alex", "Aloha", "Hola", "Bob");
        for(i <- l)
        {
            if((i.charAt(0)=='A') || (i.charAt(0)=='a'))
                println(i);
        } 

        for(i <- l)
        {
            if((i.startAt == 'A') || (i.startAt == 'a'))
                println(i);
        }
         
    }
}