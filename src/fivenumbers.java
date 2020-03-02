import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
public class fivenumbers {
    public static void main(String[] args) throws IOException {
        File infile = new File("numbers.txt");
        Scanner fileinput = new Scanner(infile);
        double[] nums = new double[5];
        int i = 0;
        while (i < 5) {
            double number = fileinput.nextDouble();
            nums[i] = number;
            System.out.println(number);
            i++;
        }
        fileinput.close();
        double total=0;
        for (int x = 0; x < 5; x++) {
            total=total+nums[x];
            System.out.println(nums[x]);
        }
        double avg=total/nums.length;
        System.out.println("AVG: ");
    }
}