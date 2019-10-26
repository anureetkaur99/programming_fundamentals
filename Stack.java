/*Name: Anureet Kaur
  Class: CSC 20-01
  Date: 6/26/18
  Description: This is the interface class called List. It is implemented by the GenericStack class
*/
public interface Stack {
   public int size();
   public boolean isEmpty();
   public String pop(); 
   public void push (Object element); 
   public Object peek();
}