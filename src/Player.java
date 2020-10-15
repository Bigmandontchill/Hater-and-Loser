import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Player extends Gameobject {
    private List<Shot> Shots=new ArrayList<>();
    public void update()throws SlickException {
            move(12);
            ShotsUpdate();
			//
    }

    public Player(int x, int y,String string  ) throws SlickException {
        super(x, y);
       this.image=new Image(string);
       this.hitbox=new Rectangle(x-image.getWidth()/2,y-image.getHeight()/2,image.getWidth(),image.getHeight());

    }

    private void move (int speed)throws SlickException{
        if(Right()){
         this.x+=speed;
         this.hitbox.setX(x-image.getWidth()/2);
        }
       else  if(Left()){
             this.x-=speed;
            this.hitbox.setX(x-image.getWidth()/2);
        }
       else if(Game.game.getInput().isKeyPressed(Input.KEY_SPACE)) {
            Shots.add(new Shot(this.x, this.y - 60));
        }


    }

    private void ShotsUpdate(){
        for(int i=0;i<Shots.size();i++){
            Shots.get(i).update();
            if(Shots.get(i).y<0){
                Shots.remove(i);
            }
        }
    }

    public void ShotsRender(){
        for(int i=0;i<Shots.size();i++){
            Shots.get(i).draw();
            Shots.get(i).render();
        }
    }



    private boolean Left(){
      return Game.game.getInput().isKeyDown(Input.KEY_LEFT);
    }

    private boolean Right(){
        return Game.game.getInput().isKeyDown(Input.KEY_RIGHT);
    }






}
