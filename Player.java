/**
 * Write a description of class Player here.
 * 
 * @author Abby Lambert 
 * @version 1.0.0
 */
public class Player
{
    private int money;
    private int numBlobs;
    private int timePlayed;
    public Player()
    {
        money = 200;
        numBlobs = 1;
    }
    public Player(int n)
    {
        numBlobs = n;
        money = 200;
    }
    
    public String toString()
    {
        String info = "Number of Blobs: " + this.numBlobs + " Money: $" + this.money + this.timePlayed;
        return info;
    }
    
    public int getMoney()
    {
        return this.money;
    }
    public int getNumBlobs()
    {
        return this.numBlobs;
    }
    public int getTimePlayed()
    {
        return this.timePlayed;
    }
    public void setMoney(int m)
    {
        this.money = m;
    }
    public void setNumBlobs(int n)
    {
        this.numBlobs = n;
    }
    public void setTimePlayed(int t)
    {
        this.timePlayed = t;
    }
      
    public void doAction(String c, Blob b)
    {
        if(c.toLowerCase().equals("info"))
        {
            System.out.println(b.toString());
            b.setCounter(b.getCounter() + 1);
        }
        else if(c.toLowerCase().indexOf("feed") != -1)
        { 
            b.feed((c.substring(c.trim().toLowerCase().indexOf("feed")+4)), this);
        }  
        else if(c.toLowerCase().equals("play"))
        {
            b.playWith();
        }
        else if(c.toLowerCase().equals("walk"))
        {
            b.walk();
        }
        else if(c.toLowerCase().equals("bathe"))
        {
            b.bathe();
        }
        else if(c.toLowerCase().equals("monies"))
        {
            System.out.println("You have " + this.money + " monies!");
            b.setCounter(b.getCounter() + 1);
        }
        else if(c.toLowerCase().equals("compete"))
        {
            this.compete(b);
        }
        else if(c.toLowerCase().equals("buy blob"))
        {
            if(this.getMoney() > 1000)
            {
                this.setMoney(this.getMoney() - 1000);
                this.setNumBlobs(this.getNumBlobs() + 1);
                b.setHappy(100);
                new Blob();
                System.out.println("You bought your Blob a friend!");
                System.out.println("+100 Happiness!");
                System.out.println("-1000 monies");
            }
            else
            {
                System.out.println("You do not have enough money to buy a new Blob");
            }
        }
        else
        {
            System.out.println("Not an acceptable command.");
        }
    }
  
    public void compete(Blob b)
    {
        int randNum = (int)(Math.random()*(b.getMaxHunger()+b.getMaxClean()+b.getMaxHappy()));
        boolean win = false;
        System.out.println("Let the competition begin!");
        for(int i = 0; i < 10; i++)
        {
           System.out.println("*");
        }

        if(b.getPower() >= randNum)
        {
            System.out.println("You win! You earned 100 monies!");
            this.setMoney(this.getMoney() + 100);            
        }
        else
        {
            System.out.println("Oh no! You lost! Better luck next time...");
            this.setMoney(this.getMoney() - 50);
            b.setHappy(b.getHappy() - 20);
        }
        b.setCounter(b.getCounter() + 1);
    }
}
