public class Main {
    public static void main(String[] args) {
        int year = 2024;
        countingLeapYear(year);
        int os = 0;
        int clientDeviceYear = 2024;
        findOutTheYear(os, clientDeviceYear);
        int deliveryDistance = 95;
        int time = 1;
        calculatingTheDeleveryTime(time, deliveryDistance);
    }
    public static void countingLeapYear(int yearToCheck){
        if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)) {
            System.out.println("Год " + yearToCheck + " високосный");
        } else {
            System.out.println("Год " + yearToCheck + " невисокосный");
        }
    }
    public static void findOutTheYear(int os, int clientDeviceYear){
    if((os == 1) && (clientDeviceYear < 2015)){
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }else if((os == 1) && (clientDeviceYear >= 2015)){
        System.out.println("Установите версию приложения для Android по ссылке");
    }
   if((os == 0) && (clientDeviceYear < 2015)){
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }else if((os == 0) && (clientDeviceYear >= 2015)){
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
}

    public static void calculatingTheDeleveryTime(int time, int deliveryDistance) {
        if(deliveryDistance < 20){
            System.out.println("Потребуется дней: " + time);
        }else if(deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней: " + time * 2);
        }else if(deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Потребуется дней: " + time * 3);
        }else{
            System.out.println("Доставки нет");
    }

    }


}