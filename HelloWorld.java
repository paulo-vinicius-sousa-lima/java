package java;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(getGreeting());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Olá, " + name + "!");

        System.out.println("Quantos anos você tem?");
        int age = scanner.nextInt();
        System.out.println("Você tem " + age + " anos.");

        scanner.close();

    }
    public static String getGreeting() {
        return "Olá, Mundo!";
    }
}