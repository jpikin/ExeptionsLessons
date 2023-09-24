package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число типа float");
        System.out.println((float) askDouble());
    }

    public static float askDouble() {
        Scanner sc = new Scanner(System.in);
        try {
            float f = sc.nextFloat();
            return f;
        } catch (Exception e) {
            System.out.println("Введены данные неправильного типа, отличного от float, попробуйте еще раз");
        }
        return askDouble();
    }
}