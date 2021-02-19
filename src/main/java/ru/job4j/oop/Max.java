package ru.job4j.oop;

public class Max {

    public static int max(int num1, int num2) {
        boolean condition = num1 > num2;
        return condition ? num1 : num2;
    }

    public static int max(int num1, int num2, int num3) {
        return max(
                    num1,
                    max(
                        num2,
                        num3)
      );
    }

    public static int max(int num1, int num2, int num3,int num4) {
        return max(
                num1,
                max(
                        num2,
                        max(
                                num3,
                                num4)
                )
        );
    }


    public static void main(String[] args) {
        int rst1 = Max.max(3, 100);
        int rst2 = Max.max(1, 8, 3);
        int rst3 = Max.max(11, 7, 9, 10);

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
    }
}
