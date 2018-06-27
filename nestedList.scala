object vowelAndConsonant{
    def main(args: Array[String])
    {
  
        var lineList= List[Int](90, 57, 35,49);
        var pageList= List(lineList, 1,2,3,4)
        var bookList= List(pageList, "13rw", "Green", "Blue");
        var categoryList = List(bookList,"comedy", "angsty", "high school");
        var library= List(categoryList, "KIT", "ACE", "Yale");

        println("Line: " + lineList(2));
        println("Library: "+library(1) + " category: " + categoryList(1) + " book: " + bookList(1) + " page: " + pageList(3) + " 3line: " + lineList(3));
        
    }
}
