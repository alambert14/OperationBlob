import java.util.Scanner;
import java.util.Date;
/**
 * This is the Blob class. It establishes the traits and methods of a Blob.
 * 
 * @author Abby Lambert
 * @version 1.0.0
 */
public class Blob
{
    private String name;
    private int age;
    private int hunger;
    private int clean;
    private boolean bladder;
    private int happy;
    private String color;
    private int foodCounter;
    private int counter;
    private int power;
    private final int MAX_HUNGER, MAX_CLEAN, MAX_HAPPY;
    /**
     * Constructor for objects of class Blob
     */
    public Blob()
    {
        MAX_HUNGER = 100;
        MAX_CLEAN = 100;
        MAX_HAPPY = 100;
        age = 0;
        hunger = 0;
        clean = 100;
        bladder = false;
        happy = 100; 
        foodCounter = 0;
        System.out.println("Name your Blob's friend:");
        Scanner scanName1 = new Scanner(System.in);
        name = scanName1.nextLine();
        System.out.println("Give your Blob's friend a color:");
        Scanner scanColor1 = new Scanner(System.in);
        color = "";
        while(!color.trim().toLowerCase().equals("red")
        && !color.trim().toLowerCase().equals("orange")
        && !color.trim().toLowerCase().equals("yellow")
        && !color.trim().toLowerCase().equals("green")
        && !color.trim().toLowerCase().equals("blue")
        && !color.trim().toLowerCase().equals("purple")
        && !color.trim().toLowerCase().equals("pink")
        && !color.trim().toLowerCase().equals("black")
        && !color.trim().toLowerCase().equals("white")
        && !color.trim().toLowerCase().equals("magenta"))
        {
            color = scanColor1.nextLine();
            if(color.trim().toLowerCase().equals("red")
            || color.trim().toLowerCase().equals("orange")
            || color.trim().toLowerCase().equals("yellow")
            || color.trim().toLowerCase().equals("green")
            || color.trim().toLowerCase().equals("blue")
            || color.trim().toLowerCase().equals("purple")
            || color.trim().toLowerCase().equals("pink")
            || color.trim().toLowerCase().equals("black")
            || color.trim().toLowerCase().equals("white")
            || color.trim().toLowerCase().equals("magenta"))
            {
                LoadImageApp image1 = new LoadImageApp(color.trim().toLowerCase(),1);
                image1.viewImage2(color.trim().toLowerCase(), name);
            }

            else
            {
                System.out.println("Not an acceptable color. Try again?");
            }
        }
        power = age + hunger + clean + happy;
    }

    public Blob(String n, String c)
    {
        age = 0;
        hunger = 0;
        clean = 100;
        bladder = false;
        happy = 100; 
        foodCounter = 0;
        name = n;
        color = c;
        power = age + hunger + clean + happy;
        MAX_HUNGER = 100;
        MAX_CLEAN = 100;
        MAX_HAPPY = 100;
    }

    public String toString()
    {
        String stats = this.name + "'s Info:\nName: " + this.name + "\nColor: " + this.color + "\nAge: " + this.age + "\nHunger:";
        if (this.hunger == 100)
        {
            stats = stats + " Full\n";
        }
        else if (this.hunger >= 75 && this.hunger < 100)
        { 
            stats = stats + " Almost Full\n";
        }
        else if (this.hunger >= 50 && this.hunger < 75)
        {
            stats = stats + " A Little Hungry\n";
        }
        else if (this.hunger >= 25 && this.hunger < 50)
        {
            stats = stats + " Hungry\n";
        }
        else if (this.hunger < 25)
        {
            stats = stats + " Very Hungry\n";
        }
        else
        {
            stats = stats + " Unknown\n";
        }
        stats = stats + "Cleanliness: " + this.clean + "%\n";
        if (this.bladder == true)
        {
            stats = stats + "Bladder is: Full\n";
        }
        else
        {
            stats = stats + "Bladder is: Empty\n";
        }
        stats = stats + "Happiness: " + this.happy + "%\nStrength: " + this.power;
        return stats;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
    //     public int getHealth()
    //     {
    //         return this.health;
    //     }
    public int getHunger()
    {
        return this.hunger;
    }

    public int getClean()
    {
        return this.clean;
    }

    public boolean getBladder()
    {
        return this.bladder;
    }

    public int getHappy()
    {
        return this.happy;
    }

    public String getColor()
    {
        return this.color;
    }

    public int getFoodCounter()
    {
        return this.foodCounter;
    }

    public int getCounter()
    {
        return this.counter;
    }

    public int getPower()
    {
        return this.power;
    }

    public int getMaxHunger()
    {
        return this.MAX_HUNGER;
    }

    public int getMaxClean()
    {
        return this.MAX_CLEAN;
    }

    public int getMaxHappy()
    {
        return this.MAX_HAPPY;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    public void setHunger(int hu)
    {
        this.hunger = hu;
    }

    public void setClean(int c)
    {
        this.clean = c;
    }

    public void setBladder(boolean b)
    {
        this.bladder = b;
    }

    public void setHappy(int ha)
    {
        this.happy = ha;
    }

    public void setColor(String co)
    {
        this.color = co;
    }

    public void setFoodCounter(int f)
    {
        this.foodCounter = f;
    }

    public void setCounter(int c)
    {
        this.counter = c;
    }

    public void setPower(int p)
    {
        this.power = p;
    }

    public void feed(String f, Player p)
    {
        if(f.trim().toLowerCase().equals("meat"))
        {
            this.setHunger(this.getHunger() + 30);
            p.setMoney(p.getMoney() - 30);
            System.out.println("You fed " + this.name + " meat!");
            System.out.println("+10% Happiness");
            this.setHappy(this.getHappy() + 10);
            this.foodCounter++;
            this.counter++;
        }
        else if(f.trim().toLowerCase().equals("fruit"))
        {
            this.setHunger(this.getHunger() + 15);
            p.setMoney(p.getMoney() - 15);
            System.out.println("You fed " + this.name + " fruit!");
            System.out.println("+10% Happiness");
            this.setHappy(this.getHappy() + 10);
            this.foodCounter++;
            this.counter++;
        }
        else if(f.trim().toLowerCase().equals("vegetable"))
        {
            this.setHunger(this.getHunger() + 15);
            p.setMoney(p.getMoney() - 15);
            System.out.println("You fed " + this.name + " a vegetable!");
            System.out.println("+10% Happiness");
            this.setHappy(this.getHappy() + 10);
            this.foodCounter++;
            this.counter++;
        }
        else
        {
            System.out.println("That is not an acceptable food");
        }
        if(this.foodCounter >= 4)
        {
            this.setBladder(true);
            this.setFoodCounter(0);
        }
    }

    public void playWith()
    {
        System.out.println("You played with " + this.name + "!");
        System.out.println("+25% Happiness");
        this.counter++;
        this.setHappy(this.getHappy() + 25);
    }

    public void bathe()
    {
        System.out.println("You bathed " + this.name + "!");
        System.out.println("+10% Happiness");
        this.counter++;
        this.setHappy(this.getHappy() + 10);
        this.setClean(100);
    }

    public void walk()
    {
        System.out.println("You took " + this.name + " on a walk!");
        System.out.println("+10% Happiness");
        this.setBladder(false);
        this.setHappy(this.getHappy() + 10);
    }

}

