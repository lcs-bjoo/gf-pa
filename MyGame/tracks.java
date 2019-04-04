import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tracks extends World
{

    /**
     * Constructor for objects of class tracks.
     * 
     */
    public tracks()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(370, 358, 1); 
        
        Car theCar = new Car();
        this.addObject(theCar, 190, 350);
        
        Baby theBaby = new Baby();
        this.addObject(theBaby, 190, 280);
    }
}
