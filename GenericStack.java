/*Name: Anureet Kaur
  Class: CSC 20-01
  Date: 6/26/18
  Description: This a generic stack and the type can be replaced at the compile time. It implements the stack class using ArrayList
  It has methods like peek(), pop(), push(), equals(), toString(). 
*/ 
import java.util.ArrayList;
public class GenericStack implements Stack
{
  
   //instance variables
   ArrayList<String> list = new ArrayList<String>();
   
   public GenericStack(String list)
   {
      this.list.add(list);
   }
  
	//returns the size of the stack
	public int size()
	{
		return list.size();
	}
   
   //sends a copy of the object without popping it
	public Object peek()
	{
		return list.get(list.size() - 1);
	}
   
   //gets rid of the first object that is at the top of the stack
	public String pop()
	{
      String p1 = list.get(list.size() - 1);
      list.remove(list.size() - 1);
		return p1;
	}
	public void push(Object o)
	{
      String p1 = (String) o;
      list.add(p1);
  	}
   
   //returns true/false if the stack is empty
	public boolean isEmpty()
	{
		return  list.size() == 0;
	}
	
   //compares two stacks
   public boolean equals(Object other)
   {
      GenericStack g;
      if (other instanceof GenericStack)
      {
         g = (GenericStack) other;
         if (this.list.size() != g.list.size())
            return false;
         else 
         {
            for(int i = 0; i < this.list.size(); i++)
            {
               if(this.list.get(i) != g.list.get(i))
                  return false;
            }
            return true;
         }
      }
      else
         return false;
   }
   
   //a toString method
   public String toString()
   {
      String s = "";
      for (int i = list.size() - 1; i >= 1; i--)
      {
         s += list.get(i) + " ";
      }
      return s;
   }
}				
	