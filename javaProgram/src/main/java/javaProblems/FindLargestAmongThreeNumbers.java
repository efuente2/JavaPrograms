package javaProblems;

import java.util.ArrayList;

public class FindLargestAmongThreeNumbers {

    private int a;
    private int b;
    private int c;

    public FindLargestAmongThreeNumbers(int i, int i1, int i2) {
        this.a = i;
        this.b = i1;
        this.c = i2;
    }

    public void max() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);

        int largest = arrayList.stream().max(Integer::compare).get();

        System.out.println("Largest number is: " + largest);
        }
    }

