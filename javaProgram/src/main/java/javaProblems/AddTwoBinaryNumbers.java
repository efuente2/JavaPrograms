package javaProblems;

public class AddTwoBinaryNumbers {

    private int num1;
    private int num2;

    public AddTwoBinaryNumbers( int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addBinary(){
        int sum, carry;
        while (num2 != 0) {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        System.out.println("Sum of two binary numbers: " + num1);

    }
}
