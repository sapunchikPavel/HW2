import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i += 2)
            System.out.print(i + " ");

        System.out.println();

        for (int i = 5; i >= 1; i--)
            System.out.print(i + " ");

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++)
            sum += i;
        System.out.println(sum);

        num = 7;
        while (num <= 98) {
            System.out.print(num + " ");
            num += 7;
        }

        System.out.println();

        num = 0;
        for(int i = 0;i<10;i++){
            System.out.print(num+" ");
            num -= 5;
        }

        System.out.println();

        for(int i = 10;i<=20;i++)
            System.out.print((int)Math.pow(i,2) + " ");

    }

}
