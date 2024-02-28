import java.util.Scanner;
public class GreatestOfThree{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1 = scan.nextInt();
        System.out.println("Enter the Second number: ");
        int number2 = scan.nextInt();
        System.out.println("Enter the Third number: ");
        int number3 = scan.nextInt();
        int greatest = number1;
        if (number2 > greatest){
            greatest = number2;
        }
        if (number3 > greatest){
            greatest = number3;
        }
        System.out.println("The Greatest number is: " + greatest);
    }
}