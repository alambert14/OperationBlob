public class Event
{
    boolean sick;
    int numEvents;
    int randNum;
    public Event()
    {
        sick = false;
        numEvents = 0;
        randNum = (int)(Math.random());
    }
    public Event(boolean s)
    {
        sick = s;
        numEvents = 0;
        randNum = (int)(Math.random());
    }
    
    public String toString()
    {
        String info = "Info: " + this.numEvents + this.randNum;
        return info;
    }
    public boolean getSick()
    {
        return sick;
    }

    public int getNumEvents()
    {
        return numEvents;
    }
    
    public int getRandNum()
    {
        return randNum;
    }

    public void setSick(boolean s)
    {
        sick = s;
    }

    public void setNumEvents(int n)
    {
        numEvents = n;
    }
    
    public void setRandNum(int r)
    {
        randNum = r;
    }

    public void normalChange(Blob b)
    {
        int randNum = (int)(Math.random()*10);

        if(randNum == 0 || randNum == 1 || randNum == 3)
        {
            b.setHunger(b.getHunger() - 10);
        }
        else if(randNum == 4 || randNum == 5)
        {
            b.setClean(b.getClean() - 25);
        }
        else if(randNum == 6 || randNum == 7 || randNum == 8)
        {
            b.setHappy(b.getHappy() - 10);
        }
        this.setNumEvents(this.getNumEvents() + 1);
    }

    public void bDay(Blob b)
    {
        if(b.getCounter() % 10 == 0 && b.getCounter() != 0)
        {
            b.setAge(b.getAge() + 1);
            System.out.println(b.getName() + " had a birthday!");
        }
        
    }

    public void rare(Blob b, Player p)
    {
        int randNum = (int)(Math.random()*5);
        if(b.getCounter() % 5 == 0 && b.getCounter() != 0)
        {
            if(randNum == 1 || randNum == 2)
            {
                b.setPower(b.getPower() - 50);
                System.out.println("Oh no! " + b.getName() + " got sick!");
                System.out.println("-50 Strength");
                sick = true;
            }
            else if(randNum == 3)
            {
                p.setMoney(p.getMoney() - 100);
                System.out.println("Oh no! You dropped 100 monies!");
            }
            else if(randNum == 4)
            {
                p.setMoney(p.getMoney() + 100);
                System.out.println("Hurray! You found 100 monies on the ground!");
            }
        }
        this.setNumEvents(this.getNumEvents() + 1);
    }
}
