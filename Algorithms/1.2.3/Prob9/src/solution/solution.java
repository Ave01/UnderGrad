package solution;
import java.io.*;

public class solution {
	public static void main(String[] args) throws IOException {		
		 File fileName = new File("input");
         String line = null;
         
         try { 	
        	FileReader fileReader = new FileReader("input");
            BufferedReader bufferedReader = new BufferedReader(fileReader);            
           
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
              
           try {     
                int decimal=Integer.parseInt(line, 16);
                System.out.println("Decimal Value: " + decimal);
                System.out.println("Binary: " + Integer.toBinaryString(decimal)+ "\n");
           }
           catch (NumberFormatException e) {                 
            	 System.out.println(" " +e.getMessage() + "\n ERROR: Please enter a valid input \n");
           } 
            }	        
           bufferedReader.close();
         }
        catch(FileNotFoundException ex) {
            System.out.println( "Unable to open file '" + fileName + "' ");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");              
        }
         
	}
}
