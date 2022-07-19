// import java.util.Scanner;
class ABexercise {

    public static void main(String[] args) {
        // int i = 1;
        // while (i < 10) {

        //     System.out.println(i);
        //     System.out.println(i + 10);
        //     i ++;



        // }
        // int stored_i = 1;
        // while (i < 10) {
            
        //     System.out.println(i + "  2^i: " + (stored_i *= 2));
        //     i++;
        // }

        // for (int i= 1; i < 10; i++) {
        //     System.out.println(i + 10);

        // }
    //     int stored_i = 1;
    //     for (int i =1; i<10; i++) {
    //     System.out.println(i + " 2^1: " +  (stored_i *= 2));
    
    // }
    // System.out.println("I prefer using the for loop as the code looks more cleaner.");
    // int day;
    // try (Scanner input = new Scanner(System.in)) {
    //     System.out.println("What is the number of days that has gone through the week?");
    //     day = input.nextInt();
    // }
    // if (day <= 5) {
    //     System.out.println("It is a weekday");

    // }
    // else if(5 < day && day <= 7) {
    //     System.out.println("It is a weekend");

    // }
    // switch(day) {
    //     case 1:
    //     System.out.println("It is a weekday.");
    //     break;
    //     case 2:
    //     System.out.println("It is a weekday.");
    //     break;
    //     case 3:
    //     System.out.println("It is a weekday.");
    //     break;
    //     case 4:
    //     System.out.println("It is a weekday.");
    //     break;
    //     case 5:
    //     System.out.println("It is a weekday.");
    //     break;
    //     case 6:
    //     System.out.println("It is a weekend.");
    //     break;
    //     case 7:
    //     System.out.println("It is a weekend.");
    //     break;
    // }

    int day = 1;
    while (day <= 7) {
        if (day <= 5) {
            System.out.println(day + " It is a weekday");
        }
        else {
            System.out.println(day + " It is a weekend");

        }

        day ++;
    }










        
    }
    
}