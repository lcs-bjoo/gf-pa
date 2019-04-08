import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    private int score;
    private boolean isRemoved;
    /**
     * Act - do whatever the baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bee()
    {
        
    }
    public void act() 
    {
      moveDown();
      checkCarCrash();
      
      if (isRemoved == false) 
       {
           checkForRemoval();
       }
       
    }    
    private void moveDown()
    {
        turn(90);
        move(1);
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
            getWorld().showText("#SaveTheBees", 200, 200);
            getWorld().showText("Game Over, You Monster", 200, 100);
           Greenfoot.stop();
            this.isRemoved = true;
            getWorld().removeObject(this);
            
            
        }
    }
    
    
}


