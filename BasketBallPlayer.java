/*Name: Anureet Kaur
  Class: CSC 20- 01
  Description: This is the child class that extends the Player class. It uses the variables inside the Player class for certain methods. 
  The equals method uses the instanceof keyword to check the object. It calls the toString() method of the Player class. It has all the basic 
  methods of a regular class. There is a getTotalPoints method that returns the total points made by the player.
  Date: 6/6/18
*/
public class BasketBallPlayer extends Player
{
   //instance variables
   private int threePointer;
   private int turnOvers;
   private int assist;
   private int rebounds;
   private int twoPointers;
   private String teamName;
   
   //constructor
   public BasketBallPlayer(String name, double salary, int number, int threePointer, int turnOvers, int assist, int rebounds, int twoPointers, String teamName)
   {
      //uses the keyword super to use the instance variables from the player class
      super(name, salary, number);
      this.threePointer = threePointer;
      this.turnOvers = turnOvers;
      this.assist = assist;
      this.rebounds = rebounds;
      this.twoPointers = twoPointers;
      this.teamName = teamName;
   }
   
   //setter methods
   public void setThree(int threePoints)
   {
      threePointer = threePoints;
   }
   
   public void setTurn(int tOver)
   {
      turnOvers = tOver;
   }
   
   public void setAssist(int a)
   {
      assist = a;
   }
   
   public void setRebounds(int r)
   {
      rebounds = r;
   }
   
   public void setTPointers(int tPointers)
   {
      twoPointers = tPointers;
   }
   
   public void SetTName(String tName)
   {
      teamName = tName;
   }
   
   //getter methods
   public int getThree()
   {
      return threePointer;
   }
   
   public int getTurn()
   {
      return turnOvers;
   }
   
   public int getAssist()
   {
      return assist;
   }
   
   public int getRebounds()
   {
      return rebounds;
   }
   
   public int getTPointers()
   {
      return twoPointers;
   }
   
   public String getTName()
   {
      return teamName;
   }
   
   //equals method
   public boolean equals(Object other)
   {
      BasketBallPlayer b;
      if (other instanceof BasketBallPlayer)
      {
         b = (BasketBallPlayer) other;
         return this.threePointer == b.threePointer && this.turnOvers == b.turnOvers && this.assist == b.assist && this.rebounds == b.rebounds && this.twoPointers == b.twoPointers && this.teamName.equals(b.teamName);
      }
      else 
         return false;
   }
   
   //toString method
   public String toString()
   {
      return super.toString() + "\nThree Pointer: " + threePointer + "\nTurn Overs: " + turnOvers + "\nAssist: " + assist + "\nRebounds: " + rebounds + "\nTwo Pointers: " + twoPointers + "\nTeam Name:" + teamName;
      
   }
   
   //this method returns the total points made by the player
   public int getTotalPoints()
   {
      return 3 * threePointer + 2 * twoPointers;
   }
}