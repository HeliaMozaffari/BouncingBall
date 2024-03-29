package ballPanel;

// Exercise 26.8 Solution: BouncingBall.java
// Program bounces a ball around a JPanel.
import javax.swing.JFrame;

public class BouncingBall extends JFrame
{
   private final BallPanel ballCanvas; // JPanel in which ball bounces

   public BouncingBall()
   {
      ballCanvas = new BallPanel( this ); // create new BallPanel
      add( ballCanvas ); // add BallPanel to JFrame

      pack(); // make window just large enough for its GUI
      setVisible( true ); // show window
   } // end BouncingBall constructor

   public static void main( String args[] )
   {
      BouncingBall application = new BouncingBall();
      application.setDefaultCloseOperation( EXIT_ON_CLOSE );
   } // end main
} // end class BouncingBall