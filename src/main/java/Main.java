import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce a character to identify: ");

        Scanner scan = new Scanner(System.in);
        boolean smallLetter = false,
                capitalLetter = false,
                vowel = false,
                consonant = false;

        char character = scan.findInLine(".").charAt(0); // how can I limit to 1 character input

        switch (((int) character)) {
            case 65, 69, 73, 79, 85: //vowel capitalLetter
                vowel = true;
                capitalLetter = true;
                break;
            case 97, 101, 105, 111, 117: //vowel smallLetter
                vowel = true;
                smallLetter = true;
                break;
            case 66, 67, 68, 70, 71, 72, 74, 75, 76, 77, 78, 80,
                    81, 82, 83, 84, 86, 87, 88, 89, 90: // Consonant capitalLetter
                consonant = true;
                capitalLetter = true;
                break;
            case 98, 99, 100, 102, 103, 104, 106, 107, 108, 109, 110,
                    112, 113, 114, 115, 116, 118, 119, 120, 121,
                    122: // Consonant smallLetter
                consonant = true;
                smallLetter = true;
                break;
            default: System.out.println("That's not a letter");
                break;
        }


        if (vowel && capitalLetter){
            System.out.println("Your character is vowel and a capital letter");
        }
        else if (vowel && smallLetter) {
            System.out.println("Your character is vowel and a small letter ");
        }
        else if (consonant && capitalLetter) {
            System.out.println("Your character is consonant and a capital letter");
        }
        else if (consonant && smallLetter){
            System.out.println("Your character is consonant and a small letter");
        }
        else {
            System.out.println("That's not a letter x2");
        }
    }
}// later on I'll try to do it using metadata
