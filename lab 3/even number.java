import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int[] evenNumbers = new int[end - start + 1];
        int index = 0;

        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
            i++;
        }

        System.out.println("Even numbers in the range:");
        int j = 0;
        do {
            if (j < index) {
                System.out.print(evenNumbers[j] + " ");
            }
            j++;
        } while (j < index);

        sc.close();
    }
}
