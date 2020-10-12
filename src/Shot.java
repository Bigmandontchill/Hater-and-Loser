import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Shot extends Gameobject{
   Shape rect;
    @Override
    public void update() {
          move(10);
    }

    public Shot(int x, int y) throws SlickException {
       super(x, y);
       rect=new Rectangle(x,y,15,25);
       hitbox=new Rectangle(x,y,15,25);

    }

    public void draw(){
        Game.game.getGraphics().setColor(Color.yellow);
        Game.game.getGraphics().fill(rect);
    }

    private void move(int speed){
        y-=speed;
        rect.setY(y);
        hitbox.setY(y);
    }




}
