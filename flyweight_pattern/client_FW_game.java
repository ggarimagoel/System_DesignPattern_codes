package flyweight_pattern;


//Finally, in our game code, we can use the Flyweight pattern to create and
// draw multiple characters.
public class client_FW_game {
    public static void main(String[] args) {

        gameObjFactory gameFactory = new gameObjFactory();

        // create and draw new object/characters

        flyweight_gameObj char1 = gameFactory.getCharacter("hero" , "hero.png");
        char1.draw(50, 100);
        flyweight_gameObj char2 = gameFactory.getCharacter("hero" , "hero.png");
        char2.draw(100, 100);
        flyweight_gameObj char3 = gameFactory.getCharacter("shooter" , "shooter.png");
        char3.draw(50, 50);
        flyweight_gameObj char4 = gameFactory.getCharacter("friend" , "friend.png");
        char4.draw(100, 50);
        flyweight_gameObj char5 = gameFactory.getCharacter("monster" , "monster.png");
        char5.draw(50, 10);

    }
}
