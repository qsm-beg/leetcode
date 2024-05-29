import java.util.Scanner;

public class vowelReverser {

    // public static String vowel = "";
    // public static String word = "";

    // check if character is a vowel
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        } else
            return false;
    }
    // System.out.println(vowel);

    public static void main(String[] sya) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string you want to reverse the vowels in:");
        String hell = input.nextLine();

        String vowel = "";
        String word = "";
        for (int i = 0; i < hell.length(); i++) {
            if (vowelReverser.isVowel(hell.charAt(i))) {
                vowel = vowel + hell.charAt(i);
            }
        }
        // System.out.println(vowelReverser.vowelStorer(hell));
        int len = vowel.length();
        // System.out.println(vowel);
        for (int i = 0; i < hell.length(); i++) {
            if (vowelReverser.isVowel(hell.charAt(i))) {
                word = word + vowel.charAt(len - 1);
                len--;
            } else
                word = word + hell.charAt(i);
        }
        System.out.println("String with reversed vowels:\n" + word);
    }

}