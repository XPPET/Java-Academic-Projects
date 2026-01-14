import becker.robots.*;

/** Run a chorus line of dancing robots. 
 *
 * @author Byron Weber Becker */
public class DanceHall
{
   public static void main(String[] args)
   {  City stage = new City();
      LeftDancer[] chorusline = new LeftDancer[2];
      RightDancer[] chorusline2 = new RightDancer[2];
      
      // initialize the array
      chorusline[0] = new LeftDancer(stage, 1, 0, Direction.EAST);
      chorusline[1] = new LeftDancer(stage, 3, 0, Direction.EAST);
      chorusline2[0] = new RightDancer(stage, 2, 0, Direction.EAST);
      chorusline2[1] = new RightDancer(stage, 4, 0, Direction.EAST);

      for (int i = 0; i < chorusline.length; i++)
      {  chorusline[i].move();
      }
      
      for (int i = 0; i < chorusline2.length; i++)
      {  chorusline2[i].move();
      }

   }
}

