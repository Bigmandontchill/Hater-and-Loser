import org.newdawn.slick.*;

public class Game extends BasicGame {
    public static AppGameContainer game;
    Player player;
    Shot shot;
    public Game() throws SlickException {
        super("jesus");
    }
    void start(){
        try {
           game = new AppGameContainer(this);
            game.setDisplayMode(800, 800, false); /* static display mode. */
            game.setTargetFrameRate(60);
            game.setVSync(true);
            game.setShowFPS(true);
            game.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
  player=new Player(400,750,"img/photo.png");
  shot=new Shot(400,400);

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        player.update();


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        player.render();
        player.ShotsRender();
    }
}
