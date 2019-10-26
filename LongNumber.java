/*Name: Anureet Kaur
  Class: CSC20- 01
  Date: 6/11/18
  Description: This class has three instance variables called front which is the front of the link list, and two arrayList of type integer.
               The front object is of type Node. Implements all the methods in the interface List using the node front*/
import java.util.*;
public class LongNumber implements List1
{
   //instance variables
   private Node front; 
   private ArrayList<Integer> num1;
   private ArrayList<Integer> num2;
   
   public LongNumber(int num)
   {
      front = new Node(num);
   }
    
      
   //this method adds the digit to the least significant position
   public void addMostSignificant(int digit)
   {
      Node n = new Node(digit);
      Node current = front;
      n.setNext(current);
      front = n;
   }
   
   //this method addds the digit to the least significant position in the list
   public void addLeastSignificant(int digit)
   {
      Node n = new Node(digit);
      Node current = front;
      while (current.getNext() != null)
      {
         current = current.getNext();
      }
      current.setNext(n);
   }

 
   //this method inserts the digit to the given position
   public void insert(int position, int digit)
   {
      Node n = new Node(digit);
      Node previous = front;
      Node current = previous;
      int count = 0;
      
      //makes sure that previous is not the last node and position is position - 1
      while (previous != null && count < position - 1)
      {
         current = previous;
         previous = previous.getNext();
         count++;
      }
      current.setNext(n);
      n.setNext(previous);
   }
  
   //this method finds the sum of the longNumber this and num, returns the result as a string
   public String add(LongNumber num)
   {
      //initializing two array lists
      num1 = new ArrayList<Integer>();
      num2 = new ArrayList<Integer>();
      
      //storing the linked list in the arraylists num1 and num2
      Node first1= this.front;
      Node first2 = num.front;
      
      //for this num
      while (first1.getNext() != null)
      {
         num1.add(first1.getDigit());
         first1 = first1.getNext();
      }
      num1.add(first1.getDigit());
      
      //for other num
      while (first2.getNext() != null)
      {
         num2.add(first2.getDigit());
         first2 = first2.getNext();
      }
      num2.add(first2.getDigit());
      
      /*a new set of arraylists to identify the sizes of the longNumbers to make the code robust and work even if the 
      first longNumber is smaller than the second longNumber*/
      ArrayList<Integer> larger = new ArrayList<Integer>();
      ArrayList<Integer> smaller = new ArrayList<Integer>();
      if (num1.size() >= num2.size())
      {
         larger = num1;
         smaller = num2;
      }
      else
      { 
         larger = num2;
         smaller = num1;
      }
      int difference = larger.size() - smaller.size();
      int carry = 0, place = 0;
      String s = "";
      for (int i = larger.size() - 1; i >= 0; i--)
      {
         //to override the out of bounds error if size is small
         if (i - difference < 0)
         {
            place = larger.get(i) + carry;
            carry = place / 10;
            place %= 10;
         }
         //when sum + carry > 9
         else if(larger.get(i) + smaller.get(i - difference) + carry > 9)
         {
            place = larger.get(i) + smaller.get(i - difference) + carry;
            carry = place / 10;
            place %= 10;
         }
         //when sum + carry < 9, then there is nothing to add to the next place
         else if(larger.get(i) + smaller.get(i - difference) + carry < 10)
         {
            place = larger.get(i) + smaller.get(i - difference) + carry;
            carry = 0;
         }
         s += place;
      }
      
      //prints results
      String sum = "";
      //decrementing
      for (int i = larger.size() - 1; i >= 0; i--)
         sum += s.charAt(i);
      return this.toString() + " + " + num.toString() + " = " + sum;
   }

   //this method deletes the digit at the given position
   public void delete(int position)
   {
      Node current = front;
      int count = 1;
      if (position == 1)
      {
         front = current.getNext();
         count--;
      }
      else 
      {
         for (int i = 1; i <= count; i++)
         {
            if (i == position - 1)
            {
               Node pHolder = current.getNext();
               pHolder = pHolder.getNext();
               current.setNext(pHolder);
               break;
            }
            current = current.getNext();
         }
         count--;
      }
   }
   
   //toString method
   public String toString()
   {
      Node current = front;
      String s = "";
      while (current != null)
      {
         s += current.getDigit();
         current = current.getNext();
      }
      return s;
   }
}