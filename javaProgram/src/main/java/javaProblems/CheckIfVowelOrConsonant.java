package javaProblems;

import java.util.ArrayList;

public class CheckIfVowelOrConsonant {

    public ArrayList<Character> vowels = new ArrayList<Character>();

    public CheckIfVowelOrConsonant() {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }

    public void isVowelOrConsonant(char c) {
        if (vowels.contains(c)) {
            System.out.println(c + " is a vowel");
        } else {
            System.out.println(c + " is a consonant");
        }
    }
}

