import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    public boolean isAtEdge;
    private boolean isRemoved;
    /**
     * Act - do whatever the baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      moveDown();
      if (isRemoved == false)
      {
          checkForRemoval();
      }
    }    
    private void moveDown()
    {
        setLocation(Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(50));
    }
    private void checkForRemoval()
    {
    if (isAtEdge)
    {
      getWorld().removeObject(this);
    }
}
}


