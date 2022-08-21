import java.util.Scanner;

public class words {
    public static void main(String[] args) {
        char[] vowels = {'E', 'I', 'İ', 'O', 'Ö', 'Ü', 'U', 'A', 'a', 'e', 'ı', 'i', 'u', 'ü', 'o', 'ö'};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give a letter: ");
        char letter = scanner.next().charAt(0);
        boolean k = false;

        for (char vowel : vowels) {
            if (vowel == letter) {
                k = true;
                break;
            }
        }
        if (k) {
            System.out.println(letter + " is a vowel letter");
        } else
            System.out.println(letter + " is not a vowel letter");
    }
}
