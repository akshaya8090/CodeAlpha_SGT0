import java.util.Scanner;

public class SimpleChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("🤖 Hi! I am your Chatbot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();

            // Exit condition
            if (userInput.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day 😊");
                break;
            }

            // Rule-based responses
            else if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            } 
            else if (userInput.contains("how are you")) {
                System.out.println("Bot: I’m doing great! Thanks for asking.");
            } 
            else if (userInput.contains("name")) {
                System.out.println("Bot: I’m a simple Java Chatbot 🤖");
            } 
            else if (userInput.contains("help")) {
                System.out.println("Bot: I can answer questions like 'hello', 'your name', 'how are you'.");
            } 
            else {
                System.out.println("Bot: Sorry, I don’t understand. Can you rephrase?");
            }
        }
        scanner.close();
    }
}
