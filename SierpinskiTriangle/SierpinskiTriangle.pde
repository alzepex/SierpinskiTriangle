public void setup()
{
  background(0);  
  size(500,500);
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