import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class driver
{
    public static void main(String[] args)
    {
        SolarSystem planets = new SolarSystem(500,500); //inside main method, create instance of SolarSystem class
       // sun = new drawSolarObject(5,90,5, "YELLOW"); //create instance of Ball class- change colour + make ball appear somewhere in middle
        
        
        planets.drawSolarObject(75, 180, 100, "YELLOW"); //this is the sun

        planets.drawSolarObjectAbout(10, 90, 25, "GREEN", 250, 45); //this is the planet orbiting around the sun 
        
        planets.finishedDrawing(); //updates the window to show the sun 
    }
}