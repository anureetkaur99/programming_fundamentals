public class IntList
{
   private Node front;
   public IntList(int num)
   {
      front = new Node(num);
   }
   
   public void add(int num)
   { 
      Node n = new Node(num);
      //adding nodes to the end of the line
      Node current = front;
      while(current.next != null)
      {
         current = current.next;
      }
      current = n;
   }
   
   public static void main(String[] args)
   {
      IntList myList = new IntList(3); //this creates just one node of link list
      //myList.add(7); When you want to add 7 to 3. You cannot just do this because this just creates a node of different location. It doesn't create node of myList. 
                       //What you need to do is to add the reference of node 7 to node 3, to link them together
      // myList.front.next = new Node(7); this is not how we do it, as it will be very long if there were a lot of nodes to be added. Each individually would take a lot of time.
      
      //you need to write an insert() method in here. OR do changes in the add method
      myList.add(8);
      System.out.println(myList);
   }
   
   //when you want to move in the list, then you need to make a copy of the first node and then 
   public String toString()
   {
      Node current = front;
      String s = "";
      while (current != null)
      {
         s = current.data + " ";
         current = current.next;
      }
      return s;
   }
}