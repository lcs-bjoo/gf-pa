import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int score = 0;
    
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
       moveFast();
       String a = Integer.toString(score);
       getWorld().showText(a,160,20);
       getWorld().showText("score:",70, 20);
       if (isTouching (Grass.class))
       {
           
           getWorld().showText("Don't drive on the grass!", 200, 100);
        }
    }    
    public void changeScore(int by)
   {
       this.score = this.score + by;
       
   }
   private void move()
   {
       if (Greenfoot.isKeyDown("left")){
            move(-5);
        }
       if (Greenfoot.isKeyDown("right")){
            move(5);
        }
       if (Greenfoot.isKeyDown("up")){
           turn(90);
           move(-5);
           turn(-90);
        }
       if (Greenfoot.isKeyDown("down")){
           turn(90);
           move(5);
           turn(-90);
        }
    }
    private void moveFast()
    {
        if (Greenfoot.isKeyDown("a")){
            move(-12);
        }
       if (Greenfoot.isKeyDown("d")){
            move(12);
        }
    }
}
