import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    private int score;
    private boolean isRemoved;
    /**
     * Act - do whatever the baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Baby()
    {
        score = 5;
        
    }
    public void act() 
    {
      moveDown();
      checkCarCrash();
      //checkGrass();
      if (isRemoved == false) 
       {
           checkForRemoval();
       }
      
    }    
    private void moveDown()
    {
        turn(90);
        move(3);
        turn(-90);
    }

private void checkForRemoval()
    {
        if (isAtEdge())
        {
            Tracks world = (Tracks) getWorld();
            world.removeObject(this);
        }
    }
   private void checkCarCrash()
    {
        if (isTouching(Car.class))
        {
            Tracks world = (Tracks) getWorld();
            world.getCar().changeScore(this.score);
            this.isRemoved = true;
            getWorld().removeObject(this);
            
        }
    }
    private void checkGrass()
    {
        if (isTouching(Grass.class))
        {
            Tracks world = (Tracks) getWorld();
            world.getGrass();
            this.isRemoved = true;
            getWorld().removeObject(this);
        }
    }
    public int getScore()
    {
        return score;
    }
    
}


