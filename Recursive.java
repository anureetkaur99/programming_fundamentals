/*Name: Anureet Kaur
  Class: CSC20-01
  Description: This program returns data recurrsively. This program has three methods where the first one returns the number of times a specific 
  character occurs in the word, the second one returns the sum of the number sent, and the third one finds the maximum in the array and returns it.
  Date: 6/18/18
*/
public class Recursive
{
   //main method
   public static void main(String[] args)
   {
      //for the first method
      String word = "Mississippi";
      int num = count(word, 's');
      System.out.println("The letter s occurrs " + num + " times in the string " + word);
      
      //for the second method
      int longNum = 123456789;
      int num1 = sum(123456789);
      System.out.println("The sum of numbers in " + longNum  + ": " + num1);
      
      //for the third method
      int[] array = {4, -1, 56, 12, 10, 89};
      int index = 1;
      int max = 4;
      int num2 = maxValue(array, index, max);
      System.out.print("The max value in the array is: " + num2);
   }
   
   //gets a string and a character and returns the number of the times the character appears in the string. 
   public static int count(String s, char a)
   {
      int place = 0;
      //base case is when length of the string is 0
      if(s.length() == 0)
         return place;
      //if the character a and and character at 0 of s is same, then increment place
      if(s.charAt(0) == a)
      {
         place++;
      }
      //updating the s recursively so it sends one less character than the original
      s = s.substring(1);
      return place + count(s,a);
   }
   
   //accepts an integer as its parameter and returns the sum of the digits in the integer, 
   public static int sum(int num)
   {
      int sum = 0;
      //base case is when num is 0
      if (num == 0)
         return sum;
      //add the num to sum and updating it recursively so the number is one less position that the original
      else 
      {
         sum += num % 10;
         num /= 10;
         return sum + sum(num);
      }
   }
   
   //accepts an array of integer, an int index and an int called max, returns the max value in the array.  
   public static int maxValue(int[] num, int index, int max)
   {
      //base case is when index and length of num are the same
      if (index == num.length)
         return max;
      //if num at given index is bigger than max then intialize max to that value
      else if (max < num[index])
      {
         //updating the max recursively
         max = num[index];
         return maxValue(num, index + 1, max);
      }
      else
         return maxValue(num, index + 1, max);
   }
}