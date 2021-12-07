
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        boolean programRunning = true;
        while (programRunning) {
            System.out.println("Hello, this is The Caesar Cipher, you can choose to encrypt a text, decrypt a text or exit the program. Enter Encrypt, Decrypt or Exit");
            String navigationChoice = input.next();

            if (navigationChoice.equals("Encrypt")) {

                System.out.println("Enter a text to be encrypted: ");
                String inputText =input.next();

                System.out.println("Thank you, now enter the shift: ");
                Integer inputShift = input.nextInt();

                Caesar inputCaesarEncrypt = new Caesar(inputText, inputShift);
                String cipherText = inputCaesarEncrypt.encrypt(inputText, inputShift);

                System.out.println("Your encrypted text is " + cipherText);

            } else if (navigationChoice.equals("Decrypt")) {

                System.out.println("Enter an encrypted text to be decrypted: ");
                String userEncryptedText = input.next();

                System.out.println("Enter the shift of the encrypted text: ");
                Integer userEncryptedShift = input.nextInt();

                Caesar inputCaesarDecrypt = new Caesar(userEncryptedText, userEncryptedShift);
                String decrypted = inputCaesarDecrypt.decrypt(userEncryptedText, userEncryptedShift);

                System.out.println("Your decrypted text is " + decrypted);
            } else if (navigationChoice.equals("Exit")) {
                programRunning = false;
            } else {
                System.out.println("Sorry, your input can't be recognized, choose from Encrypt, Decrypt or Exit please");
            }

        }
    }
}

