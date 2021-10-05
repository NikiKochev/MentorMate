import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomWords {

    public static void main(String[] args) {

        int letterSizeA = 5;
        int letterSizeB = 20;
        int letterSizeC = 50000;



        Long time = System.currentTimeMillis();


        //Write a function that generates two different,
        //random, N sized case sensitive words in English with no
        //special characters.


        //a) Check the generated words if they contain the letter
        //'g' ignoring case sensitivity and output the result for N
        //= 5.
        boolean sCharContaining = isItContainingG(randomWord(letterSizeA), randomWord(letterSizeA));

        System.out.println(sCharContaining);
        //b) Compare the two words and return the characters that
        //appear in both of тhem for N = 20 honoring case
        //sensitivity.
        List<Character> appearAtBothWords = compareWordsForEqualsLetter(randomWord(letterSizeB), randomWord(letterSizeB));
        appearAtBothWords.forEach(System.out::println);
        //c) Identify the longest matching equal sequence of
        //characters contained in both words regardless of position
        //for N = 50 000 and output it.
        //If there are multiple matching substrings of the same
        //length, order them alphabetically and display the last.

        String word1 = randomWord(letterSizeC);
        String word2 = randomWord(letterSizeC);
         int longestMatching = longestMachingSenquest(word1, word2);
        System.out.println(longestMatching);

         //d) Output the exact start index of the matching substring
        //from c) in both words.

        int startIndex = satrtIndex(word1, word2);
        System.out.println(startIndex);

        System.out.println((System.currentTimeMillis() - time));
    }

    private static int satrtIndex(String word1, String word2) {
        boolean isItNotMach = true;
        int longestMatching = 0;
        int currentMach = 0;
        int startIndex = 0;
        for (int i = 0; i < word1.length(); i++) {
            if(Character.toLowerCase(word1.charAt(i)) == Character.toLowerCase(word2.charAt(i))){
                isItNotMach = false;
                currentMach++;
            }else
            {
                isItNotMach = true;
            }
            if(isItNotMach){
                if(currentMach > longestMatching){
                    longestMatching = currentMach;
                    startIndex = i-longestMatching;
                }
                currentMach = 0;
            }
        }
        return startIndex;

    }

    private static int longestMachingSenquest(String word1, String word2) {
        boolean isItNotMach = true;
        int longestMatching = 0;
        int currentMach = 0;
        for (int i = 0; i < word1.length(); i++) {
            if(Character.toLowerCase(word1.charAt(i)) == Character.toLowerCase(word2.charAt(i))){
                isItNotMach = false;
                currentMach++;
            }else
            {
                isItNotMach = true;
            }
            if(isItNotMach){
                if(currentMach > longestMatching){
                    longestMatching = currentMach;
                }
                currentMach = 0;
            }
        }
        return longestMatching;
    }


    private static List<Character> compareWordsForEqualsLetter(String word1, String word2) {
        List<Character> equals = new ArrayList<>();
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if(Character.toLowerCase(word1.charAt(i)) == Character.toLowerCase(word2.charAt(j))){
                    equals.add(word1.charAt(i));
                    break;
                }
            }
        }
        return equals;
    }

    //a) Check the generated words if they contain the letter
    //'g' ignoring case sensitivity and output the result for N
    //= 5.
    private static boolean isItContainingG(String firsWord, String secondWord) {
        for (int i = 0; i < firsWord.length(); i++) {

            if(firsWord.charAt(i) == 'g'
                    || firsWord.charAt(i) == 'G'
                    || secondWord.charAt(i) == 'G'
                    || secondWord.charAt(i) == 'g' ){
                return true;
            }
        }
        return false;
    }

    private static String randomWord(int size){
        char[] wordLetter = new char[size];
        for (int i = 0; i < size; i++) {
            wordLetter[i] = randomLetter();
        }
        return new String(wordLetter);

    }

    private static char randomLetter() {
        Random r = new Random();
        Boolean upper  = r.nextBoolean();
        if(upper){
            return (char)('A' +r.nextInt(26));
        }
        return (char)('a' +r.nextInt(26));
    }
}
