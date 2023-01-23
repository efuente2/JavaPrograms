package javaProblems;

public class SortAString {

    private String str;
    public SortAString(String str) {
        this.str = str;
    }

    public void sort(){
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            for(int j = i + 1; j < charArray.length; j++){
                if(charArray[i] > charArray[j]){
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.print("Sorted string: ");
        for(int i = 0; i < charArray.length; i++){
            System.out.print(charArray[i]);
        }
        System.out.println();

    }
}
