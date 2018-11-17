import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class World extends JFrame
{
   private int GRAVITY;
   private int TERMINAL_VELOCITY;
   
   public World()
   {
   JFrame frame = new JFrame("FrameDemo");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(500, 500);
   frame.setVisible(true);
   
   GRAVITY = 10;
   TERMINAL_VELOCITY = 100;
   
   Player p = new Player(10, 10);
   p.setColor(Color.red);
   }
}