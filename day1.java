import java.util.Scanner;

public class FirstLastDigitCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       
        int lastDigit = num % 10;

      
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        
        int firstCube = firstDigit * firstDigit * firstDigit;
        int lastCube = lastDigit * lastDigit * lastDigit;

       
        System.out.println("First digit: " + firstDigit + ", Cube: " + firstCube);
        System.out.println("Last digit: " + lastDigit + ", Cube: " + lastCube);

        sc.close();
    }
}
