package common_questions.patterns;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Hello! my name is khan";

        reverseWords(sentence);
        reverseWordsStringBuilder(sentence);

    }


    private static void reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println("Reversed Sentence: " + reversed.trim());

    }

    private static void reverseWordsStringBuilder(String sentence) {


        List<String> words = Arrays.asList(sentence.split(" "));
        Collections.reverse(words);
        String reversed = String.join(" ", words);
        System.out.println("Reversed Sentence: " + reversed);
    }

}
