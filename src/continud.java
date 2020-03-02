import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class continud {
    public static void main(String[] args)throws IOException{
        Scanner input = new Scanner(System.in);
        PrintWriter outfile=new PrintWriter( "names.txt");

        System.out.println("Write name into name.txt");

     int number=0;
        String choice="yes";
        while(choice.equalsIgnoreCase("yes")) {

            String na = input.next();
            outfile.println(na);
          System.out.println("continue?");
          choice=input.next();
        }
        outfile.close();

    }

}