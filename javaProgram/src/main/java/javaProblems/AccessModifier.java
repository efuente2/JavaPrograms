package javaProblems;

public class AccessModifier {
    public AccessModifier(){

    }

    public void publicMethod(){
        System.out.println("This is a public method");
        protectedMethod();
        privateMethod();
        defaultMethod();
    }

    private void privateMethod(){
        System.out.println("This is a private method");
    }

    protected void protectedMethod(){
        System.out.println("This is a protected method");
    }

    void defaultMethod(){
        System.out.println("This is a default method");
    }
}
