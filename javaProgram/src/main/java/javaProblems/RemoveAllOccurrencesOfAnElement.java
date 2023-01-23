package javaProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveAllOccurrencesOfAnElement {

    int [] arr;
    int element;

    public RemoveAllOccurrencesOfAnElement(int[] arr, int element){
        this.arr = arr;
        this.element = element;
    }

    public void removeElement(){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int j = 0;
        while (j < arr.length){
            if (arr[j] != element){
                arrayList.add(arr[j]);
            }
            j++;
        }

        arr =  arrayList.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Array after removing all occurrences of an element: ");
        arrayList.forEach(System.out::println);
    }
}
