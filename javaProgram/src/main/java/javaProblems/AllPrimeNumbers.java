package javaProblems;

public class AllPrimeNumbers {

    int n;

    public AllPrimeNumbers(int n) {
        this.n = n;
    }

    public void findPrimeNumbers() {
        System.out.print("Prime numbers from 1 to n are: ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
    }

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

