/*Name: Anureet Kaur
  Class: CSC 20- 01
  Description: This is the parent class that has instance variables called name, salary, and number. It holds the topmost position in the 
  hierarchy. It has all the basic methods of a regular class. The equals method uses the instanceof keyword to check the object. 
  Date: 6/6/18
*/
public class Player
{
   //instance variables
   private String name;
   private double salary;
   private int number;
   
   //constructor, has to be the same name as the class, initalizes values for instance variables, makes an object
   public Player(String name, double salary, int number)
   {
      this.name = name;
      this.salary = salary;
      this.number = number;
   }
   
   //setter methods, re-intializes the values of instance variables
   public void setName(String newName)
   {
      name = newName;
   }
   
   public void setSalary(double newSal)
   {
      salary = newSal;
   }
   
   public void setNumber(int newNum)
   {
      number = newNum;
   }
   
   //getter methods, returns the instance variables 
   public String getName()
   {
      return name;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public int getNumber()
   {
      return number;
   }
   
   //equals method, compares two objects and returns true/false
   public boolean equals(Object other)
   {
      Player p;
      if (other instanceof Player)
      {
         p = (Player) other;
         return this.name.equals(p.name) && this.salary == p.salary && this.number == p.number;
      }
      else 
         return false;
   }
   //toString method, prints out all the values 
   public String toString()
   {
      return "Player Name: " + name + "\nSalary: $" + salary + "\nNumber: " + number;
   }
}