import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "I would like to have a dog";
        int vowelLetter =0;
        for (char c : sentence.toCharArray()) {
            if (c == 'a'|| c=='e' || c== 'i' || c=='o' || c=='u') {
                vowelLetter++;
            }
        }
        System.out.println("Vowel letters in this sentence:" + vowelLetter);

        String [] words = sentence.split(" ");
        System.out.println("Words:" + Arrays.toString(words));

        String secondWord = words[1];
        String firstThreeChars = secondWord.substring(0,Math.min(secondWord.length(),3));
        System.out.println("First three letters of second word is: " + firstThreeChars);

        String replaced = sentence.replaceAll ("dog", "cat");
        System.out.println("Replaced 'Dog to 'cat'" + replaced);
    }

}