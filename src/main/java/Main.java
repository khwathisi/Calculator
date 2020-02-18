import java.util.Scanner;

public class Main {
    public static Calculator cal = new Calculator();
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.println("Enter 1 for adding");
        System.out.println("Enter 2 for multiplying");
        while (!in.hasNextInt()){
            System.out.println("enter a number!");
            in.next();
        }
        int response = in.nextInt();

        if(response == 1){
            //adding
            System.out.println(cal.add());
        }else if(response == 2){
            //multiplying
            System.out.println(cal.multiply());
        }else{
            System.out.println("Incorrect option");
        }
    }
}
