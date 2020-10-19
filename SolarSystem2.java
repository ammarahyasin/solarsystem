import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

//write a new interface 
interface SolarSystem2
{
    //must have the abstract methods used in the class (?)
    void drawSolarObject(double distance, double angle, double diameter, String col);
    void drawSolarObjectAbout(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle);
    void finishedDrawing();
}
