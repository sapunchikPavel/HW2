import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int monthNum = scanner.nextInt();
        switch (monthNum) {
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println("Март");
            case 4 -> System.out.println("Апрель");
            case 5 -> System.out.println("Май");
            case 6 -> System.out.println("Июнь");
            case 7 -> System.out.println("Июль");
            case 8 -> System.out.println("Август");
            case 9 -> System.out.println("Сентябрь");
            case 10 -> System.out.println("Октябрь");
            case 11 -> System.out.println("Ноябрь");
            case 12 -> System.out.println("Декабрь");
            default -> System.out.println("Номер месяца введен неверно");
        }

        System.out.print("Пора года: ");
        if ((monthNum > 0 && monthNum < 3) || monthNum == 12)
            System.out.println("Зима");
        if (monthNum > 2 && monthNum < 6)
            System.out.println("Весна");
        if (monthNum > 5 && monthNum < 9)
            System.out.println("Лето");
        if (monthNum > 8 && monthNum < 12)
            System.out.println("Осень");

        System.out.println("Введите целое число");
        int num = scanner.nextInt();
        if (num%2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");

        System.out.println("Введите температуру:");
        int temp = scanner.nextInt();
        if (temp>-5)
            System.out.println("Тепло");
        if(temp<=-5 && temp>-20 )
            System.out.println("Нормально");
        if(temp<=-20)
            System.out.println("Холодно");

    }
}
