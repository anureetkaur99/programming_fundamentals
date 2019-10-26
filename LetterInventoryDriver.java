/*Name: Anureet Kaur
  Class: CSC 20: 01
  Description: This is the driver of the Letter Inventory Class. It checks the functionality of all the methods in the class and utilizes them to give
  different outputs to the user. It then populates the array with reading a text file. It specifically uses the setter method and then performs data validation when the user is asked to change the value of
  one of the letters in the given string.
  Date: 6/1/18*/
import java.util.*;
import java.io.*;
public class LetterInventoryDriver
{
   //main method that prints the information using the methods from the class
   public static void main (String[] args) throws IOException
   {
      Scanner kb = new Scanner(System.in);
      LetterInventory[] r = new LetterInventory[6];
      fillArray(r);
      for (int i = 0; i < r.length; i++)
      {
         System.out.println(r[i].toString() + "\nThe size of this letter inventory is: " + r[i].size() + "\nIs the letter inventory empty? " + r[i].isEmpty() + "\nInventory of letter C is: " + r[i].get('C'));
         //when the loop reaches the last index, then it adds to the first index
         if(i == r.length - 1)
            System.out.print("The sum of the two strings: " + r[i].add(r[0]) + "\nThe difference of the two strings: " + r[i].subtract(r[0]));
         else 
            System.out.print("The sum of the two strings: " + r[i].add(r[i + 1]) + "\nThe difference of the two strings: " + r[i].subtract(r[i + 1]));
      System.out.println("\n");
      }
      //performs data validation when asks the user to change the inventory of letter C
      System.out.print("It seems that there is no inventory of letter C in the sixth phrase.\nHow many C's would you like?  ");
      int num = -1;
      while (num < 0)
      {
         System.out.print("Enter a positive number: ");
         while (!kb.hasNextInt())
         {
            kb.next();
            System.out.print("Wrong choice! Enter a valid integer number: ");
         }
         num = kb.nextInt();
      }
      r[5].set('c', num);
      System.out.print("\nCongratualation, the changes were successfully made as follows!!\n" + r[5].toString() + "\nInventory of letter C is now: " + r[5].get('c'));   
   }
   
   //this method populates the array while reading text file
   public static LetterInventory[] fillArray(LetterInventory[] r1) throws IOException
   {
      File f = new File("data.txt");
      Scanner input = new Scanner(f);
      int index = 0;
      while (input.hasNextLine())
      {
         String line = input.nextLine();
         LetterInventory r2 = new LetterInventory(line);
         r1[index] = r2;
         index++;
      }
      return r1;
   }
}