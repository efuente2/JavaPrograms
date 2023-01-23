package javaProblems;

public class HandleTheCheckedExceptions {

    public HandleTheCheckedExceptions(){

    }

    public void handleCheckedExceptions(){
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            if(b == 0){
                throw new ArithmeticException("Cannot divide by zero");
            }
        }catch(ArithmeticException e){
            System.out.println("Exception: " + e);
        }
    }
}
