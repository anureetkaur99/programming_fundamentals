/*Name: Anureet Kaur
  Class: CSC20- 01
  Date: 6/11/18
  Description: This is the driver of LongNumber class. It reads from a text file and makes objects of LongNumber type
               to call the methods in the class. It converts from character to integer before storing it in num1 and num2.
*/
import java.util.*;
import java.io.*;
public class LongNumberDriver
{
   //this is the main method that calls the create method
   public static void main (String[] args) throws IOException
   {
      create();
   }
   
   //this method reads a file to create long numbers
   public static void create() throws IOException
   {
      //create a LongNumber object 
      File f = new File("Long Number.txt");
      Scanner input = new Scanner(f);
      while(input.hasNextLine())
      {
         String line = input.nextLine();
         Scanner token = new Scanner(line);
         
         //for the first string in the line, conversion to int and making num2 object of LongNumber type
         String a = token.next();
         char b = a.charAt(0);
         String c = "";
         c += b;
         int value = Integer.parseInt(c);
         LongNumber num1 = new LongNumber(value);
         c = "";
         for (int i = 1; i < a.length(); i++)
         {
            b = a.charAt(i);
            c += b;
            value = Integer.parseInt(c);
            num1.addLeastSignificant(value);
            c = "";
         }
         
         //for the second string in the line, conversion to int and making num2 object of LongNumber type
         String d = token.next();
         char e = d.charAt(0);
         String ff = "";
         ff += e;
         int value1 = Integer.parseInt(ff);
         LongNumber num2 = new LongNumber(value1);
         ff = "";
         for (int i = 1; i < d.length(); i++)
         {
            e = d.charAt(i);
            ff += e;
            value1 = Integer.parseInt(ff);
            num2.addLeastSignificant(value1);
            ff = "";
         }
         
         //all the printing takes place below
         System.out.println(num1.add(num2)); 
         System.out.println("inserting the digit 9 at position 3 to num1\ninserting the digit 7 at position 4 to num2");
         num1.insert(3, 9);
         num2.insert(4, 7);
         System.out.println(num1.add(num2)); 
         System.out.println("Adding a digit to the least significant position to num1 and num2");
         num1.addLeastSignificant(9);
         num2.addLeastSignificant(3);
         System.out.println(num1.add(num2));
         num1.delete(2);
         num2.delete(1);
         System.out.println("Deleting a digit at position 2 in num1 and deleting a digit at position 1 in num2");
         System.out.println(num1.add(num2));
         System.out.println("\n\n"); 
      }
   }
}