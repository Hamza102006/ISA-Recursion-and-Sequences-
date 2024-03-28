import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


/*
 * Author; Hamza Khan
 * Date; December 2023
 * Description; This code allows the user to print a large oval and display a smaller and smaller ovals within in
 * 
 * <METHODS>
 * 
 * public class Oval_Recursion extends JFrame { - class which extends JFrame
 * 
 * public void drawOvals(Graphics g, int makeSmaller, int width, int height, int x, int y, int colorIndex) {n- drawOvals mathod 
 * 
 * public void paint(Graphics g) { - paint method 
 * 
 * public static void main(String[] args) { - main method
 * 
 * 
 * 
 * NEW THINGS ADDED BECASUE I WAS BORED AND HAD ADDTIONAL TIME ON MY HANDS:
 * 
 * Cycling through the red and blue colors for each ovals using a modulus operator
 * this was just done because I had more time on my hands and wanted the ovals to look better the links i used
 * to add this addition are below. Pretty much the modulus was used to select the random color. I also made it 
 * festive theme for fun.
 * 
 * 
 * LINKS;
 * https://stackoverflow.com/questions/14924285/cycle-through-an-int-array-and-the-use-of-modulo-within-it
 * https://blog.mattclemente.com/2019/07/12/modulus-operator-modulo-operation/
 */




public class Oval_Recursion extends JFrame {

	//variables and colours array 
    int makeSmaller;
    Color[] colors = {Color.RED, Color.GREEN};

    //frame and frame details below
    public Oval_Recursion(int width, int height, int makeSmaller) {
        super("Recursive Ovals");

        this.makeSmaller = makeSmaller;
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void drawOvals(Graphics g, int makeSmaller, int width, int height, int x, int y, int colorIndex) {
       
    	//setting the colors of the oval based on the colors array
    	g.setColor(colors[colorIndex]); 
    	
    	//drawing the outline of the oval 
        g.drawOval(x, y, width, height); 
        
        //this if statement is responsible for making sure that that the oval keeps getting smaller
        //if the width and height are both smaller than the makeSmaller variable then the program will keep displaying smaller
        //ovals, however if the width and height become larger than the makeSmaller variable the program will stop displaying the ovals 
        if (!(width < makeSmaller && height < makeSmaller)) {
        	
            int nextColorIndex = (colorIndex + 1) % colors.length; // Cycling through colors which are red and blue 
            
            //calling the recursive method again
            drawOvals(g, makeSmaller, (width - makeSmaller * 4), height - makeSmaller * 3, x + (makeSmaller - 1), y + (makeSmaller - 4), nextColorIndex);
        }
    }

    public void paint(Graphics g) {
        //painting 
    	super.paint(g);
    	
    	//calling the drawOvals method again to paint  
        drawOvals(g, this.makeSmaller, this.getWidth(), this.getHeight(), 0, 0, 0);
    }

    public static void main(String[] args) {
    	//size of the frame to allow the ovals to be printed 
        new Oval_Recursion(700, 600, 15);
    }
}
