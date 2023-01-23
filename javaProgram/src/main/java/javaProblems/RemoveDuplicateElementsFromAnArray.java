package javaProblems;

public class RemoveDuplicateElementsFromAnArray {

    private int array[];
    public RemoveDuplicateElementsFromAnArray(int array[]){
        this.array = array;
    }

    public void removeDuplicateElements(){
        int length = array.length;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(array[i] == array[j]){
                    array[j] = array[length - 1];
                    length--;
                    j--;
                }
            }
        }
        int[] newArray = new int[length];
        for(int i = 0; i < length; i++){
            newArray[i] = array[i];
        }
        System.out.print("Array with unique elements: ");
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}
