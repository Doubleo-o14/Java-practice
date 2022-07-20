class book {
    String name;
    String author;
    int price;


}

class bookChoice {
    public static void main(String[] args) {
        // books b1 = new books();
        // b1.name = "Rich dad poor dad";
        // b1.author = "Robert kiyoski";
        // b1.price = 10;

        // System.out.println(b1.name);
        // System.out.println(b1.author);
        // System.out.println("£"+b1.price);
        book b1 = new book();
        book b2 = new book();
        book b3 = new book();

        b1.name = "Rich dad poor dad";
        b1.author = "Robert kiyoski";
        b1.price = 10;

        b2.name = "mastery";
        b2.author = "robert greene";
        b2.price = 15; 

        b3.name = "The power of letting go";
        b3.author = "robert greene";
        b3.price = 15;

        book[] books = {b1,b2,b3};
        int num =0;

        while (num < 3){
            System.out.println(books[num].name);
            System.out.println(books[num].author);
            System.out.println("£"+books[num].price);

            num ++;

        }
        
        


        
    
        
    }

}
