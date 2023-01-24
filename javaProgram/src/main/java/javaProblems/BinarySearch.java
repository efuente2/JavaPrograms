package javaProblems;

public class BinarySearch {

    private int[] array;
    private int key;

    public BinarySearch(int key, int[] arr){
        int result = binarySearch(arr, key);
        if(result == -1){
            System.out.println("Element not present");
        }else{
            System.out.println("Element found at index " + result);
        }
    }


    private int binarySearch(int[] arr, int x){
        int l = 0, r = arr.length - 1;
        while (l <= r){
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
