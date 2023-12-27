import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserMusuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserMusuh extends Actor
{
   private int nyawa;
    
    public void gerak()
    {
        setLocation(getX(),getY()+5);
        if(getY()>590){
            getWorld().removeObject(this);
        }else{
            cek_kena();
        }
    }
    
    public void cek_kena(){
        if (isTouching(Hero.class))
        {
            getWorld().addObject(new Ledakan2(),getX(),getY());
            Latar w= (Latar)getWorld();
            w.updatenyawa(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("meledak.mp3");
        }
    }
    
    public void act() 
    {
        gerak();
    }    
}
