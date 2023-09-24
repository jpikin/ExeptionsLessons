package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String str = scanner.nextLine();
        try {
            testInput(str);
        } catch (EmptyStringExeption ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void testInput(String str) {
        if (str.isEmpty()){
            throw new EmptyStringExeption("Пустую строку вводить нельзя!");
        }
    }
}
