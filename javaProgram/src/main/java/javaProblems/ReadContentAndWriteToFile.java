package javaProblems;

import java.io.*;

public class ReadContentAndWriteToFile {

    public ReadContentAndWriteToFile(){

    }

    public void readAndWrite(){
        try{
            FileReader fr = new FileReader("C:\\Users\\earne\\Desktop\\WriteAndRead\\read.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("C:\\Users\\earne\\Desktop\\WriteAndRead\\write.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            while(line != null){
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            br.close();
            bw.close();
        }catch(IOException e){
            System.out.println("Exception: " + e);
        }
    }
}
