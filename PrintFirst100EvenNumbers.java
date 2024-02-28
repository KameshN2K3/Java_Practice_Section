public class PrintFirst100EvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;
        while (count < 50) {
            if (number % 2 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
