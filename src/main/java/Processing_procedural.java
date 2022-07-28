import processing.core.PApplet;
public class Processing_procedural extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x1=0;
    int x2=0;
    int x3=0;
    int x4=0;
    public static void main(String[] args) {
        PApplet.main("Processing_procedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        moving_ball1();
        moving_ball2();
        moving_ball3();
        moving_ball4();

    }

    private void moving_ball4() {
        ellipse(x4,HEIGHT*4/5,DIAMETER,DIAMETER);
        x4+=4;
    }

    private void moving_ball3() {
        ellipse(x3,HEIGHT*3/5,DIAMETER,DIAMETER);
        x3+=3;
    }

    private void moving_ball2() {
        ellipse(x2,HEIGHT*2/5,DIAMETER,DIAMETER);
        x2+=2;
    }

    private void moving_ball1() {
        ellipse(x1,HEIGHT/5, DIAMETER,DIAMETER);
        x1+=1;
    }
}
