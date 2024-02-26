import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int year = 2024;
        countingLeapYear(year);
        int os = 0;
        int clientDeviceYear = 2024;
        findOutTheYear(os, clientDeviceYear);
        int distance = 95;
        int deliveryDays = calculatingTheDeleveryTime(distance);
        if (deliveryDays != -1){
            System.out.println("Количество дней доставки: " + deliveryDays);
        }else{
            System.out.println("Доставки нет!");
        }
    }

    public static void countingLeapYear(int yearToCheck) {
        if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)) {
            System.out.println("Год " + yearToCheck + " високосный");
        } else {
            System.out.println("Год " + yearToCheck + " невисокосный");
        }
    }

    public static void findOutTheYear(int os, int clientDeviceYear) {
        int current = LocalDate.now().getYear();
        if (os == 1 && clientDeviceYear < current) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && clientDeviceYear >= current) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (os == 0 && clientDeviceYear < current) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear >= current) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static int calculatingTheDeleveryTime(int distance) {
        if (distance < 0 || distance > 100){
            return -1;
        }
        int deliveryDays = 1;
        if (distance <= 20){
            deliveryDays++;
        }
        if (distance >= 60){
            deliveryDays++;
        }
        return deliveryDays;
    }
}