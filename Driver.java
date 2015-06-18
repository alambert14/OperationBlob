import java.util.*;
import java.text.*;
/**
 * Write a description of class Driver here.
 * 
 * @author Abby Lambert 
 * @version 1.0.0
 */
public class Driver
{
    public static void main(String[] args)
    {
        //     private Blob aBlob;
        //     private Player aPlayer;
        //     private Event e;

        //     public Driver()
        //     {
        System.out.println("Name your Blob:");
        Scanner scanName = new Scanner(System.in);
        String n = scanName.nextLine();
        //        boolean noName = false;
        //         if(n == null)
        //         {
        //             aBlob = new Blob();
        //         }      
        //         else
        //         {      

        System.out.println("What color is your Blob?");
        Scanner scanColor = new Scanner(System.in);
        String c = "";
        while(!c.trim().toLowerCase().
equals("red")
        && !c.trim().
toLowerCase().
equals("orange")
        && !c.trim().
toLowerCase().
equals("yellow")
        && !c.trim().
toLowerCase().
equals("green")
        && !c.trim().
toLowerCase().
equals("blue")
        && !c.trim().
toLowerCase().
equals("purple")
        && !c.trim().
toLowerCase().
equals("pink")
        && !c.trim().
toLowerCase().
equals("black")
        && !c.trim().
toLowerCase().
equals("white")
        && !c.trim().
toLowerCase().
equals("magenta"))
        {
            c = scanColor.nextLine();
            if(c.trim().toLowerCase().equals("red")
            || c.trim().toLowerCase().equals("orange")
            || c.trim().toLowerCase().equals("yellow")
            || c.trim().toLowerCase().equals("green")
            || c.trim().toLowerCase().equals("blue")
            || c.trim().toLowerCase().equals("purple")
            || c.trim().toLowerCase().equals("pink")
            || c.trim().toLowerCase().equals("black")
            || c.trim().toLowerCase().equals("white")
            || c.trim().toLowerCase().equals("magenta"))
            {
                LoadImageApp image = new LoadImageApp(c.trim().toLowerCase());
                image.viewImage(c.trim().toLowerCase(), n);
            }

            else
            {
                System.out.println("Not an acceptable color. Try again?");
            }
        }
        Blob aBlob = new Blob(n, c);
        Player aPlayer = new Player();
        Event e = new Event();

        System.out.println("Your Blobs name is: " + aBlob.getName());
        System.out.println("Your Blobs color is: " + aBlob.getColor());
        System.out.println("---------------------");
        System.out.println("Now you can start taking care of your Blob!");

        Scanner scanInput = new Scanner (System.in);
        String command = scanInput.nextLine();
        int numSick = 0;

        while (!command.toLowerCase().equals("close") && aPlayer.getMoney() >= 0 && aBlob.getPower() >= 0)
        {
            aPlayer.doAction(command, aBlob);
            e.normalChange(aBlob);
            e.bDay(aBlob);

            if(aPlayer.getNumBlobs() > 1)
            {
                aBlob.setHappy(aBlob.getHappy() + (aPlayer.getNumBlobs()*5));
            }
            if(aBlob.getFoodCounter() > 4)
            {
                aBlob.setHappy(aBlob.getHappy() - 5);
            }
            if(aBlob.getHunger() >= aBlob.getMaxHunger())
            { 
                aBlob.setHunger(100);
            }
            if(aBlob.getHunger() <= 0)
            {
                aBlob.setHunger(0);
            }
            if(aBlob.getClean() >= aBlob.getMaxClean())
            {
                aBlob.setClean(100);
            }
            if(aBlob.getClean() <= 0)
            {
                aBlob.setClean(0);
            }
            if(aBlob.getHappy() >= aBlob.getMaxHappy())
            {
                aBlob.setHappy(100);
            }
            if(aBlob.getHappy() <= 0)
            {
                aBlob.setHappy(0);
            }
            e.rare(aBlob, aPlayer);

            if(e.getSick() == true)
            {
                numSick++;
                if(numSick == 5)
                {
                    numSick = 0;
                }
                aBlob.setPower(aBlob.getAge() + aBlob.getHunger() + aBlob.getClean() + aBlob.getHappy()-50);           
            }
            else
            {
                aBlob.setPower(aBlob.getAge() + aBlob.getHunger() + aBlob.getClean() + aBlob.getHappy());
            }
            aPlayer.setTimePlayed(aPlayer.getTimePlayed() + 1);
            System.out.println("---------------------");
            
            if(!command.toLowerCase().equals("close") && aPlayer.getMoney() >= 0 && aBlob.getPower() >= 0)
            {
                command = scanInput.nextLine();
            }
            if(command.toLowerCase().equals("close"))
            {
                System.out.println("Bye!");
            }
            else if(aPlayer.getMoney() <= 0)
            {
                System.out.println("Sorry, you ran out of money.  Game over!");
            }
            else if(aBlob.getPower() <= 0)
            {
                System.out.println("Your poor blob died! Game over!");
            }
        }
    }
}
