import javaProblems.*;
import javaProblems.AbstractClass.ExtendsAbstract;

import java.util.Scanner;

public class javaApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //finds the largest number among three numbers without else statements
        FindLargestAmongThreeNumbers largest = new FindLargestAmongThreeNumbers(1,2,3);
        largest.max();

        //find all prime numbers from 1 to n
        AllPrimeNumbers prime = new AllPrimeNumbers(10);
        prime.findPrimeNumbers();

        //check if a character is a vowel or consonant
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a character: ");

        String userName = myObj.nextLine();
        CheckIfVowelOrConsonant vowel = new CheckIfVowelOrConsonant();
        vowel.isVowelOrConsonant(userName.charAt(0));

        //find the factorial of a number
        FactorialOfANumber factorial = new FactorialOfANumber();
        factorial.factorial(5);

        //create a class and object of the class;
        CreateAClassAndObject classAndObject = new CreateAClassAndObject();

        //Binary to decimal conversion
        BinaryToDecimalConversion binaryToDecimal = new BinaryToDecimalConversion();
        binaryToDecimal.binaryToDecimal(1010);

        //Create Abstract Class
        ExtendsAbstract abstractClass = new ExtendsAbstract();


    }
}
