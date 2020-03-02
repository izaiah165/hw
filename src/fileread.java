import java.io.*;

import java.util.Scanner;

public class fileread {
    public static void main(String[] args) throws IOException{
        File infile= new File("names.txt");
        Scanner fileinput=new Scanner(infile);
        while(fileinput.hasNext()){
            System.out.println(fileinput.next());

        }
        fileinput.close();

    }

}
