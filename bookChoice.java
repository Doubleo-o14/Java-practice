class books {
    String name;
    String author;
    int price;


}

class bookChoice {
    public static void main(String[] args) {
        books b1 = new books();
        b1.name = "Rich dad poor dad";
        b1.author = "Robert kiyoski";
        b1.price = 10;

        System.out.println(b1.name);
        System.out.println(b1.author);
        System.out.println(b1.price);
    
        
    }

}
