import java.util.Scanner;
public class ReversingNumber{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int number, reverse = 0;
      System.out.print("Enter a number to Reverse : ");
      number = scan.nextInt();
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
    System.out.println("Reversed Number is : "+reverse);
    }
}