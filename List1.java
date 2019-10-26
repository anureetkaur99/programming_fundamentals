/*Name: Anureet Kaur
  Class: CSC20- 01
  Date: 6/11/18
  Description: This interface specifies all the method that must be implemented for a list*/
public interface List1
{
   //this method addds the digit to the most significant position in the list
   public void addMostSignificant(int digit);
   
   //this method adds the digit to the least significant position
   public void addLeastSignificant(int digit);
 
   //this method inserts the digit to the given position
   public void insert(int position, int digit);
  
   //this method finds the sum of the longNumber this and num, returns the result as a string
   public String add(LongNumber num);
   
   //this method deletes the digit at the given position
   public void delete(int position);
 
}