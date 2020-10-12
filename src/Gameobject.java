import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Shape;

public abstract class Gameobject {
    protected int y;
    protected int x;
    protected Image image;
    protected Shape hitbox;

    public abstract void update()throws SlickException;
    public Gameobject (int x,int y ) {
      this.x=x;
      this.y=y;
    }
    protected void render() {
        if (this.image != null) {
            this.image.drawCentered(x,y);


        }
        if( this.hitbox != null){
            Game.game.getGraphics().setColor(Color.red);
            Game.game.getGraphics().draw(this.hitbox);
        }
    }



}
