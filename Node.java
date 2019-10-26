/*Name: Anureet Kaur
  Class: CSC20- 01
  Date: 6/11/18
  Description: This is the Node class that has the basic methods and is used by the LongNumber class
*/
public class Node
{   
   //instance variable
   private int digit;//every node has data part and the "next" (reference for next node). You can replace "int" with any other type
   private Node next; //data structure next of type node, that is going to point to a node
   
   //constructor
   public Node(int digit)
   {
      this.digit = digit;
      this.next = null;
   }
   
   //set method
   public void setNext(Node n)
   {
      this.next = n;
   }
   
   //get methods
   public Node getNext()
   {
      return this.next;
   }
   
   public int getDigit()
   {
      return digit;
   }
}