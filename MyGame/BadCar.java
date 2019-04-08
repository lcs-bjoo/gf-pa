import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadCar extends Actor
{
    private boolean isRemoved;
     private int score;
    /**
     * Act - do whatever the BadCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BadCar()
    {
        score = -12;
    }
    public void act() 
    {
        moveUp();
        
        checkCarCrash();
        if (isRemoved == false) 
       {
           checkForRemoval();
       }
    }    
    private void moveUp()
    {
        turn(90);
        move(-1);
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
            getWorld().showText("ㅇㅁㅇ", Greenfoot.getRandomNumber(300),Greenfoot.getRandomNumber(300));
            getWorld().showText("ㅠㅁㅠ", Greenfoot.getRandomNumber(300),Greenfoot.getRandomNumber(300));
            getWorld().showText("ㅡㅁㅡ", Greenfoot.getRandomNumber(300),Greenfoot.getRandomNumber(300));
            this.isRemoved = true;
            getWorld().removeObject(this);
            world.getCar().changeScore(this.score);
        }
    }
    public int getScore()
    {
        return score;
    }
}
