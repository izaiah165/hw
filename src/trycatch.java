import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
public class trycatch {
    public static void main(String[] args) {
        File infile = null;
        Scanner fileinput = null;
        double[] nums = new double[5];
        try {
        infile = new File("numbers.txt");
          fileinput = new Scanner(infile);

            int i = 0;
            while (i < 5) {
                double number = fileinput.nextDouble();
                nums[i] = number;
                System.out.println(number);
                i++;
            }
        }catch(IOException e){
    System.out.println("File IO error"+e.getMessage());
        }
        finally {
            fileinput.close();
        }
      
        double total=0;
        for (int x = 0; x < 5; x++) {
            total=total+nums[x];
            System.out.println(nums[x]);
        }
        double avg=total/nums.length;
        System.out.println("AVG: ");
    }
}