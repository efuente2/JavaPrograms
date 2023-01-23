package javaProblems;

public class BinaryToDecimalConversion {

    public BinaryToDecimalConversion(){

    }

    public void binaryToDecimal(int n){
        int decimal = 0;
        int p = 0;
        while(n != 0){
            decimal += ((n % 10) * Math.pow(2, p));
            n = n / 10;
            p++;
        }
        System.out.println("Decimal number is: " + decimal);
    }
}
