import processing.core.PApplet;

public class FourBallsProc extends PApplet {
    public static final int height = 500;
    public static final int width = 500;
    public static final int ballRadius = 12;
    public static final int parts = 5;
    
    int[] posXAxis = new int[parts];

    public static void main(String[] args) {
        PApplet.main("FourBallsProc", args);
    }

    @Override
    public void settings() {
        size(height, width);
    }

    @Override
    public void draw() {
        for (int i = 0; i < parts-1; i++) {
            posXAxis[i] = createBall(posXAxis[i], height/parts, ballRadius, i+1);
        }
    }

    private int createBall(int x, int y, int r, int speed) {
       ellipse(x, speed * y, r, r);
       x = x + speed;
       return x;
    }

}
