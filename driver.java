import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class driver
{
    public static void main(String[] args)
    {
        SolarSystem system = new SolarSystem(500,500); //inside main method, create instance of SolarSystem class
        Planets planet1 = new Planets();

        //draw the sun
        system.drawSolarObject(75, 180, 100, "YELLOW"); 

        //draw a planet orbiting around the sun 
        system.drawSolarObjectAbout(10, 90, 25, "GREEN", 250, 45); 
        //make planet move
        //planet1.rotatePlanet();
        
        system.finishedDrawing(); //updates the window to show the sun 
    }
}