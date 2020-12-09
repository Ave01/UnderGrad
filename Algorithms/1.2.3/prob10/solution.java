import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
 
class solution{
        public static void main(String[] args){
                String filename = "input";
                String input = "";
                try{
                input = new Scanner(new File(filename)).useDelimiter("\\Z").next();
                }catch(IOException e){
                }
                String out = input.replaceAll("(^| )+[a-z][0-9][0-9]( |$)+", " *** ");
                System.out.println(out);
        }
}

