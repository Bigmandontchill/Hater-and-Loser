import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
public class Main {


    public static void main(String[] arguments)
    {
         Game game;
        try {
            game = new Game();
            game.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}




