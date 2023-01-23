package javaProblems;

public class LinearSearch {

    private int ElementToSearch;
    private int[] ArrayToSearch;

    public LinearSearch(int ElementToSearch, int[] ArrayToSearch){
        this.ElementToSearch = ElementToSearch;
        this.ArrayToSearch = ArrayToSearch;
    }

    public void search(){
        for(int i = 0; i < ArrayToSearch.length; i++){
            if(ArrayToSearch[i] == ElementToSearch){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }


}
