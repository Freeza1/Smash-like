import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;

public class Player
{
   private int vertical_speed;
   private int x_position;
   private int y_position;
   private Rectangle location;
   private Color color;
   private double dx;
   private double dy;
   
   
   public Player(int x, int y)
   {
      
      location       = new Rectangle( x, y, 2*x, 2*y );
      dx             = 0;
      dy             = 0;
      color          = Color.blue;
   }
   
   public void setColor( Color newColor )
   {
      color = newColor;
   }

   public void setMotion( double ndx, double ndy )
   {
      dx = ndx;
      dy = ndy;
   }

   public int       radius()    { 
      return location.width / 2; }
   public int       x()         { 
      return location.x + radius(); }
   public int       y()         { 
      return location.y + radius(); }
   public double    xMotion()   { 
      return dx; }
   public double    yMotion()   { 
      return dy; }
   public Rectangle region()    { 
      return location; }

   public void moveTo( int x, int y )
   {
      location.setLocation( x, y );
   }

   public void move()
   {
      location.translate( (int) dx, (int) dy );
   }

   public void paint( Graphics g )
   {
      g.setColor( color );
      g.fillOval( location.x,     location.y,
                  location.width, location.height );
   }
   
}