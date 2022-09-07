//Задание 1 и 2
public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println(" Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println(" установите облегченную версию приложения для Android по ссылке.");
        }
  // Задание 3
    int year = 2021;
    int year4 = year % 4;
    int year100 = year % 100;
    int year400 = year % 400;
        if ((year100 == 0 || year4 != 0) && year400 != 0) {
            System.out.println(year + " год не високосный");
        } else {
            System.out.println(year + " год високосный");
        }


        // задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зиминий Месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("такого месяца не существует");
        }


        // задание 4

        int deliveryDays = 1;
        int deliveryDays2 = 2;
        int deliveryDays3 = 3;
        int deliveryDistance = 95;
    if (deliveryDistance < 20) {
        System.out.println("Потребуется дней " + deliveryDays );
    } else {
        if (deliveryDistance >=20 && deliveryDistance <=60) {
            System.out.println("потребуется дней " + deliveryDays2);
        } else {
            if (deliveryDistance >= 60 && deliveryDistance <=100) {
                    System.out.println("Потребуется дней " + deliveryDays3);
                }
            }

        }
    }

    }


