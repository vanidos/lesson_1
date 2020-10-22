public class Main {
    public static void main(String[] args) {

//      2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte var1 = 127;
        short var2 = 32767;
        int var3 = 2147483647;
        long var4 = 121545445445454L;

        float var5 = 4445454.64554F;
        double var6 = 4545444545455.454545;

        boolean check = true;

        String name = "Some name";

//      3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        System.out.println("Task 3 result is: :" + returnNumber(5, 5, 5, 5));

//      4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println("Task 4 result is: :" + checkNumber(5, 5));

//      5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        checkPositive(-1);
        checkPositive(5);
        checkPositive(0);

//      6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        System.out.println(checkNegative(-1));

//      7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        showName("Trooper");

//      8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        checkLeapYear(2024);
    }

    private static int returnNumber(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return result;
    }

    private static boolean checkNumber(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else return false;
    }

    private static void checkPositive(int a) {
        if (a < 0)
            System.out.println("Number " + a + " is below zero");
        else System.out.println("Number " + a + " is above zero or equals zero");
    }

    private static boolean checkNegative(int a) {
        if (a < 0)
            return true;
        else
            return false;
    }

    private static void showName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    private static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Year is leap");
        } else System.out.println("Year is Std");
    }
}

