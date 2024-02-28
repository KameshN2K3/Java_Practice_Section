import java.util.Scanner;
public class SmallestOfThree{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1 = scan.nextInt();
        System.out.println("Enter the Second number: ");
        int number2 = scan.nextInt();
        System.out.println("Enter the Third number: ");
        int number3 = scan.nextInt();
        int smallest = number1;
        if (number2 < smallest){
            smallest = number2;
        }
        if (number3 < smallest){
            smallest = number3;
        }
        System.out.println("The Smallest number is: " + smallest);
    }
}