import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int[] primeNumbers = new int[end - start + 1];
        int index = 0;

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                primeNumbers[index] = i;
                index++;
            }
        }

        System.out.println("Prime numbers in the range:");
        for (int k = 0; k < index; k++) {
            System.out.print(primeNumbers[k] + " ");
        }

        sc.close();
    }
}
