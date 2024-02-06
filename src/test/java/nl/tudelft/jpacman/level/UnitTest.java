package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;


public class UnitTest {
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private final PlayerFactory pf = new PlayerFactory(SPRITE_STORE);
    private final Player ThePlayer = pf.createPacMan();

    @Test
    void DirectionsTest(){
        ThePlayer.setDirection(ThePlayer.getDirection());
    }

    @Test
    void TestSprite(){
        ThePlayer.getSprite();
    }
}

