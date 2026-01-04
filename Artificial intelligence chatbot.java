import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("🤖 ChatBot: Hello! I am your AI Chatbot.");
        System.out.println("🤖 ChatBot: Type 'exit' to end the chat.");

        while (true) {
            System.out.print("\nYou: ");
            userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("🤖 ChatBot: Goodbye! Have a nice day 😊");
                break;
            }

            System.out.println("🤖 ChatBot: " + getResponse(userInput));
        }

        sc.close();
    }

    // Rule-based NLP response method
    static String getResponse(String input) {

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        } 
        else if (input.contains("how are you")) {
            return "I am fine! Thanks for asking.";
        } 
        else if (input.contains("your name")) {
            return "I am a Java AI Chatbot.";
        } 
        else if (input.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        } 
        else if (input.contains("ai") || input.contains("artificial intelligence")) {
            return "Artificial Intelligence enables machines to think like humans.";
        } 
        else if (input.contains("bye")) {
            return "Goodbye! See you again.";
        } 
        else {
            return "Sorry, I didn't understand that. Can you ask something else?";
        }
    }
}