/*Name: Anureet Kaur
  Class: CSC 20: 01
  Description: This program tracks the number of times the alphabet letter occurs in the given data field. This program takes in a string and 
  then calculates how many of each letter are in that string. It ignores the case structure of letters and does not take in non-alphabetic characters
  Date: 6/1/18*/
public class LetterInventory
{
   //instance variables 
   private int size;
   private int[] array;
   public static final int TOTAL_LETTERS = 26;
   
   //constructs an inventory of the alphabets in the given string, ignores case and non-alphabets
   public LetterInventory(String data)
   { 
      array = new int[TOTAL_LETTERS];
      data = data.toLowerCase();
      for (int i = 0; i < data.length(); i++)
      {
         //looks at one letter from the string
         int place = data.charAt(i);
         //tallies that one letter in the array, will not tally if non-alphabetic
         if (place >= 97)
         {
            array[place-97]++;
            //keeps count of the size of the data
            size++;
         }
      } 
   }

   //returns the sum of all of the counts in this inventory and is fast
   public int size()
   {
      return size;
   }
  
   //returns true if this inventory is empty by looking at the size variable
   public boolean isEmpty()
   {
      if (size == 0)
         return true;
      else 
         return false;
   }

   //returns a count of how many times of this letter is in the inventory and throws illegalArgumentException when it is non-alphabetic
   public int get(char letter)
   {
      //makes sure to lowercase all letters
      int nonAlpha = Character.toLowerCase(letter);
      if (nonAlpha < 97 || nonAlpha > 122)//97 is the ASCII code of 'a' and 122 is the ASCII code of 'z'
         throw new IllegalArgumentException();
      else 
         return array[nonAlpha-97];
   }
   
   //returns a String representation fo the inventory with the letters while making sure that all letters are lowercase and sorted
   public String toString()
   {
      String s = "[";
      //this for loop stores the sorted letters in the variable called s and then s is returned
      for (int i = 0; i < TOTAL_LETTERS; i++)
      {
         for (int j = 0; j < array[i]; j++)
         {
            s += (char) (i + 'a');
         }
      }
      return s + "]";
   }
   
   //this method sets the count for the given letter to the specified value and throws IllegalArgumentException for non-alphabetic
   public void set(char letter, int value)
   {
      int n = Character.toLowerCase(letter);
      if (value < 0 || n < 97 || n > 122)
         throw new IllegalArgumentException();
      else
         array[n - 97] = value;
   }
   
   //sum of this letter inventory and other letter inventory, it counts each letter and adds them together
   public LetterInventory add(LetterInventory other)
   {
      LetterInventory sum = new LetterInventory("");
      for (int i = 0; i < array.length; i++)
      {
         sum.array[i] = this.array[i] + other.array[i];
         sum.size += sum.array[i];
      }
      return sum;
   }
   
   //subtaction of this letter inventory and other letter inventory, returns null if the count is negative
   public LetterInventory subtract(LetterInventory other)
   {
      LetterInventory sum = new LetterInventory("");
      for (int i = 0; i < array.length; i++)
      {
         sum.array[i] = this.array[i] - other.array[i];
         if (sum.array[i] < 0)
            return null;
         sum.size += sum.array[i];
      }
      return sum;
   }
}