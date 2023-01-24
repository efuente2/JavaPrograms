import javaProblems.*;
import javaProblems.AbstractClass.Car;
import javaProblems.AbstractClass.ExtendsAbstract;
import javaProblems.AbstractClass.Toyota;
import javaProblems.Inheritance.Animal;
import javaProblems.Inheritance.Dog;
import javaProblems.Interface.InterfaceImplementation;

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

        //Add two binary numbers
        AddTwoBinaryNumbers addTwoBinaryNumbers = new AddTwoBinaryNumbers(1010, 1010);
        addTwoBinaryNumbers.addBinary();

        //Show Usage of Main() method
        System.out.println("This was printed in the main method");

        //remove duplicate elemnts from an array
        int arr[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        RemoveDuplicateElementsFromAnArray removeDuplicateElementsFromArray = new RemoveDuplicateElementsFromAnArray(arr);
        removeDuplicateElementsFromArray.removeDuplicateElements();

        //Remove all occurrences of an element from an array
        int arr2[] = {1,2,3,4,5,6,7,7,7,7,7,7,7,8,9,7,7,10,11,7};
        int element = 7;

        RemoveAllOccurrencesOfAnElement removeAllOccurrencesOfAnElementFromArray = new RemoveAllOccurrencesOfAnElement(arr2, element);
        removeAllOccurrencesOfAnElementFromArray.removeElement();

        //sort a string
        String str = "Hello World";
        SortAString sortAString = new SortAString(str);
        sortAString.sort();

        //Handle Checked exceptions
        HandleTheCheckedExceptions handleCheckedExceptions = new HandleTheCheckedExceptions();
        handleCheckedExceptions.handleCheckedExceptions();

        //Handle Unchecked exceptions
        HandleTheUncheckedExceptions handleUncheckedExceptions = new HandleTheUncheckedExceptions();
        handleUncheckedExceptions.handleUnchecked();

        //Create a singleton class
        CreateSingletonClass x = CreateSingletonClass.getInstance();
        CreateSingletonClass y = CreateSingletonClass.getInstance();
        CreateSingletonClass z = CreateSingletonClass.getInstance();

        System.out.println("hashcode of x is " + x.hashCode());
        System.out.println("hashcode of y is " + y.hashCode());
        System.out.println("hashcode of z is " + z.hashCode());

        if(x == y && y == z){
            System.out.println("All three objects are the same and point to the same memory location");
        }else{
            System.out.println("All three objects are not the same and do not point to the same memory location");
        }

        //Create an interface
        InterfaceImplementation createAnInterface = new InterfaceImplementation();
        createAnInterface.print();

        //Show Encapsulation in Class
        String encapsulationString = "this is my string";

        ShowEncapsulation encapsulation = new ShowEncapsulation(encapsulationString);
        encapsulation.printString();

        //Show Linear Search
        int[] linearSearchArray = {1,2,3,4,5,6,7,8,9,10};

        LinearSearch linearSearch = new LinearSearch( 5,linearSearchArray);
        linearSearch.search();

        //Show Binary Search
        int[] binarySearchArray = {1,2,3,4,5,6,7,8,9,10};

        BinarySearch binarySearch = new BinarySearch(5, binarySearchArray);

        //Swapping Pair of Characters in a String;
        String swapString = "Hello World";
        SwappingPairOfCharacters swapPairOfCharactersInAString = new SwappingPairOfCharacters();
        swapPairOfCharactersInAString.swap(swapString);

        //Read content from one file and writing it into another file
        ReadContentAndWriteToFile readContentAndWriteToFile = new ReadContentAndWriteToFile();
        readContentAndWriteToFile.readAndWrite();

        //Compare Paths of Two files
        String path1 = "C:\\Users\\User\\Desktop\\javaProgram\\src\\main\\java\\javaProblems\\HandleTheUncheckedExceptions.java";
        String path2 = "C:\\Users\\User\\Desktop\\javaProgram\\src\\main\\java\\javaProblems\\HandleTheCheckedExceptions.java";

        ComparePathsOfTwoFiles comparePathsOfTwoFiles = new ComparePathsOfTwoFiles();
        comparePathsOfTwoFiles.comparePaths(path1, path2);

        //Show Use of Static and Non-static Methods
        StaticAndNonStaticMethods staticAndNonStaticMethods = new StaticAndNonStaticMethods();
        StaticAndNonStaticMethods.staticMethod();//belongs to the class but not the instance of the class
        staticAndNonStaticMethods.nonStaticMethod();//is accessible through an instance of the class

        //Show Usage of Access Modifier
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();//public methods can be accessed from anywhere, this method also call the other methods in the class.
        //accessModifier.protectedMethod();//can be accessed by a subclass
        //accessModifier.defaultMethod();//can be accessed by a class in the same package
        //accessModifier.privateMethod();//can only be accessed within the class

        //how Overloading of Methods in Class
        OverloadingMethods overloadingMethods = new OverloadingMethods();
        overloadingMethods.add(1,2);
        overloadingMethods.add(1,2,3);//overloading methods have the same name but different parameters

        //Overriding of Methods in Classes
        OverridingMethods overridingMethods = new OverridingMethods();
        overridingMethods.toString();//this method is overridden in the subclass

        //Show Use of Super Keyword in Class
        SuperKeywordImpl superKeyword = new SuperKeywordImpl();//this calls the constructor in the superclass
        superKeyword.superMethod();//this calls the super class method

        //Show Use of This Keyword in Class
        ThisKeyword thisKeyword = new ThisKeyword("hello world");
        thisKeyword.getKeyword();

        //Show Usage of Static keyword in Class
        StaticKeyword staticKeyword = new StaticKeyword();
        StaticKeyword.staticMethod();//static methods can be called without creating an instance of the class

        //print Spiral Pattern of Numbers
        SpiralPattern spiralPattern = new SpiralPattern();
        spiralPattern.print();

        //Show Inheritance in Class
        Dog dog = new Dog();
        dog.setName("fiod");
        dog.getName();

        //Show Abstraction in Class
        Car carolla = new Toyota();
        carolla.start();

        //Data Hiding in Class
        DataHiding dataHiding = new DataHiding();
        dataHiding.setAge(20);
        dataHiding.getAge();

        //Polymorphism in Class
        Animal chihuahua = new Dog();
        chihuahua.sound();



    }
}
