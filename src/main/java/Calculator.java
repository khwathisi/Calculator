import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    public static Scanner in = new Scanner(System.in);

    public static String add(){

        System.out.println("How many numbers you want to work with?");
        List<Integer> list = new ArrayList<Integer>();
        while (!in.hasNextInt()){
            System.out.println("enter a number!");
            in.next();
        }
        int numbersWork = in.nextInt();

        for(int i = 0; i < numbersWork; i++){
            int seq = i + 1;
            System.out.println("enter number " + seq);
            while (!in.hasNextInt()){
                System.out.println("enter a number for " + seq + " !");
                in.next();
            }
            list.add(in.nextInt());
        }

        int sum = 0;
        for(int j = 0; j < list.size(); j++){
            sum = sum + list.get(j);
        }

        System.out.println("The sum is " + sum);
        return "";
    }

    public static String multiply(){

        System.out.println("How many numbers you want to work with?");
        List<Integer> list = new ArrayList<Integer>();
        while (!in.hasNextInt()){
            System.out.println("enter a number!");
            in.next();
        }
        int numbersWork = in.nextInt();

        for(int i = 0; i < numbersWork; i++){
            int seq = i + 1;
            System.out.println("enter number " + seq);
            while (!in.hasNextInt()){
                System.out.println("enter a number for " + seq + " !");
                in.next();
            }
            list.add(in.nextInt());
        }

        int pro = list.get(list.size()-1);
        for(int j = 0; j < list.size()-1; j++){
            pro = pro * list.get(j);
        }

        System.out.println("The product is " + pro);
        return "";
    }
}
