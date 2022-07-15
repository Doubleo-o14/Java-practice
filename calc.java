import java.util.Scanner;

class calc {
    public static void main(String[] args) {

        char operator;
        int number1, number2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("choose what operator you want to use");
        operator = input.next().charAt(0);

        System.out.println("enter first number");
        number1 = input.nextInt();

        System.out.println("enter second number");
        number2 = input.nextInt();



        
    }
}