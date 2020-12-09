import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.util.Scanner;

public class solution{
    public static void main(String[] args) {
        int month = 0, day = 0, year = 0;
        try {
            File file = new File("input");
            Scanner input = new Scanner(file);
            month = Integer.parseInt(input.nextLine()) - 1;
            day = Integer.parseInt(input.nextLine())-1;
            year = Integer.parseInt(input.nextLine());
            input.close();
        }catch(Exception e){
            System.out.println("Error reading file");
        }
        Date now = new Date(year, month, day);
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        System.out.println(simpleDateformat.format(now));
    }
}

