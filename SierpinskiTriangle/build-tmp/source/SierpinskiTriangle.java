import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

public void setup()
{
  background(0);  
  
}
public void draw()
{
  sierpinski(0,height,width);
}
public void sierpinski(int x, int y, int len) 
{
  if (len > 20)
  { 
   fill(200, 0, 0);
   triangle(x, y, x + len / 2, y - len, x + len, y);
   sierpinski(x, y, len / 2);
   sierpinski(x + (len / 2), y, len / 2);
   sierpinski(x + (len / 4), y - (len / 2), len / 2);
  }
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
