package javaProblems;

public class HandleTheUncheckedExceptions {

    public HandleTheUncheckedExceptions(){

    }

    public void handleUnchecked(){
        try{
            int a[] = {1,2,3,4,5};
            System.out.println("Element at 6th position: " + a[6]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Exception: " + e + " index 6 is out of bounds for length 5");
        }
    }
}
