package javaProblems;

public class SuperKeywordImpl extends SuperKeyword {
    public SuperKeywordImpl(){
        super();
        System.out.println("This is the SuperKeywordImpl class");
    }

    public void superMethod(){
        super.superMethod();
        System.out.println("This is an overridden method");
    }
}

