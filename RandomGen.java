import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class RandomGen {

    ArrayList<Square> objects = new ArrayList<Square>();

    public RandomGen() {
        int width = 800;
        int height = 800;
        JFrame frame = new JFrame("randomGen");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        Canvas canvas = new Canvas();
        canvas.setSize(width, height);
        canvas.setBackground(Color.BLACK);
        canvas.setVisible(true);
        canvas.setFocusable(false);

        frame.add(canvas);

        createSquares();

        //running
        canvas.createBufferStrategy(3);
        boolean running = true;

        BufferStrategy bufferStrategy;
        Graphics graphics;

        while (running) {
            bufferStrategy = canvas.getBufferStrategy();
            graphics = bufferStrategy.getDrawGraphics();
            paint(graphics);
            bufferStrategy.show();
            graphics.dispose();
        }
    }

    public void paint(Graphics g) {
        for(int i = 0; i < objects.size(); i++)
            objects.get(i).paint(g);
    }

    private void createSquares() {
        Square test = new Square(0,0,20,"green");
        objects.add(test);
    }

    public static void main (String args []) {
        new RandomGen();
    }
}
