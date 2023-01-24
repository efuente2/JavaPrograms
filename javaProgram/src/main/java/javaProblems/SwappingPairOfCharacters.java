package javaProblems;

public class SwappingPairOfCharacters {

        public SwappingPairOfCharacters(){

        }

        public void swap(String str){
            char[] charArray = str.toCharArray();
            for(int i = 0; i < charArray.length-1; i++){
                if(i % 2 == 0){
                    char temp = charArray[i];
                    charArray[i] = charArray[i+1];
                    charArray[i+1] = temp;
                }
            }
            System.out.println(charArray);
        }
}
