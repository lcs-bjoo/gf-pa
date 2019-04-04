import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tracks extends World
{
    private int frames = 0;
    private int score = 0;
    /**
     * Constructor for objects of class tracks.
     * 
     */
    public Tracks()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(370, 358, 1); 
        
        Car theCar = new Car();
        this.addObject(theCar, 190, 320);
        
        Baby theBaby = new Baby();
        this.addObject(theBaby, 190, 260);
        
        
    }
    public void act()
    {
          if ((frames % 60) == 0)
       {
                String timeElapsed = Integer.toString(frames / 60);
                showText(timeElapsed, 50, 50);
                
                
            }
       if ((frames / 3600) == 1)
        {
            Greenfoot.stop();
        }
        frames = frames +1;
       
       if ((score % 60) == 0)
       {String timeElapsed = Integer.toString(frames / 60);
                showText(timeElapsed, 310, 50);
                
                
         }
       
            
    }
}
