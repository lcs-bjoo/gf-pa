import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tracks extends World
{
    private static int frames = 0;
    public int score = 0;
    private Car theCar;
    private Grass theGrass;
    /**
     * Constructor for objects of class tracks.
     * 
     */
    public Tracks()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(370, 358, 1); 
        theCar = new Car();
        this.addObject(theCar, 190, 320);
        theGrass = new Grass();
        this.addObject(theGrass, 345, 200);
        theGrass = new Grass();
        this.addObject(theGrass, 20, 200);
    }
    public void act()
    {
         if ((frames % 60) == 0)
       {
                String timeElapsed = Integer.toString(frames / 60);
                showText(timeElapsed, 50, 50);
                
                
            }
       
       frames = frames +1;
       
       
       newBaby();
       newBee();
       newBadCar();
       
    }
    private void dropBaby()
    {
        
        addObject(new Baby(),Greenfoot.getRandomNumber(280),0);
            
            
        
    }
    public Car getCar()
    {
        return theCar;
    }
    public Grass getGrass()
    {
        return theGrass;
    }
    private void newBaby()
    {
        if (frames % 25 == 0) 
        {
            int x = Greenfoot.getRandomNumber(270);
            addObject(new Baby(), x + 45,0);
        }
}
   private void newBee(){
     if (frames % 120 == 0) 
        {
            int x = Greenfoot.getRandomNumber(270);
            addObject(new Bee(), x + 45,0);
        }
    }
    private void newBadCar(){
     if (frames % 300 == 0) 
        {
            int x = Greenfoot.getRandomNumber(270);
            addObject(new BadCar(), x + 45,358);
        }
    }
}
