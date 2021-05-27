package ru.gb.hw.hw2;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(withinNo(16, 7));
        posOrNeg( 1);
        System.out.println(Neg( -1));
        printThis( "Text",  5);
    }
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean withinNo(final int a, final int b) {
        int sum = a+ b;
        return ((sum >= 10) && (sum <= 20));
    }
    /**
     * 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */
    public static void posOrNeg(final int a) {
        if (a >= 0) {
            System.out.println( "Положительное" );
        } else {
            System.out.println( "Отрицательное" );
        }
    }
    /**
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static boolean Neg(final int a) {
        return ( a < 0 );
    }
    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void printThis(final String data, final int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(data);
        }
    }

}
