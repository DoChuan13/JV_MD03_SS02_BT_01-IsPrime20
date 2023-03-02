package IsPrime;

import java.util.Scanner;

public class IsPrime20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, numbers;
        int n = 2;
        System.out.print("Input count number: ");
        numbers = input.nextInt();
        System.out.print("20 prime numbers is: ");
        while (count < 20) {
            boolean flagCheck = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flagCheck = false;
                    break;
                }
            }
            if (flagCheck) {
                System.out.print(n + ", ");
                count++;
            }
            n++;
        }
    }
}
