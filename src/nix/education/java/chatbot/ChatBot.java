package nix.education.java.chatbot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String name = "Amogus";
        int year = 2020;
        System.out.println("Hello! My name is " + name + ".\n" +
                "I was created in " + year + ".\n" + "Please, remind me your name.");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        System.out.println("What a great name you have, " + user + "!\nLet me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scan.nextInt();
        int remainder5 = scan.nextInt();
        int remainder7 = scan.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + " that`s a good time to start programming!");
    }
}
