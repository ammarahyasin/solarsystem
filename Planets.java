
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

//write a new class implementing the SolarSystem2 interface
// this class is going to make it prettier to rotate the planets, so we can just stick it in driver 
public class Planets
{
    int rotationSpeed;
    int sizeOfPlanet;
    Object planet;
    int centreOfRotationAngle; 
    //SolarObject planet; 
    //int planetAngle; 

    public int rotatePlanet(int centreOfRotationAngle) //method to make planet rotate around sun
    {
        for(centreOfRotationAngle =0; centreOfRotationAngle <360;)
        {
            centreOfRotationAngle++; //increment angle 

            //drawSolarObjectAbout(10, 90, 25, "GREEN", 250, centreOfRotationAngle);
            
        
        }
        return centreOfRotationAngle;
    }
}

