public class Main {
    public static void main(String[] args) {
        //task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("задача 2");
        // task 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("задача 3");
        //task 3
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("задача 4");
        //task 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("задача 5");
        // task 5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        System.out.println("задача 6");
        // task 6
        for (int i = 1; i <= 14; i++) {
            System.out.println(7 * i);
        }
        System.out.println("задача 7");
        // task 7
        for (int i = 0; i <= 9; i++) {
            System.out.println((int) Math.pow(2, i));
        }
        System.out.println("задача 8");
        // task 8
        var god = 29000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц, " + i + " сумма накоплений равна " + god + " рублей");
            god += 29000;
        }
        System.out.println("задача 9");
        // task 9
        god = 29000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц, " + i + " сумма накоплений равна " + god + " рублей");
            god += 29000;
            god *= 1.12;
        }
        // task 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}