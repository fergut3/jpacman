package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private final PlayerFactory pf = new PlayerFactory(SPRITE_STORE);
    private final Player ThePlayer = pf.createPacMan();

    @Test
    void isAlive(){
            assert(ThePlayer.isAlive());
//        assert(ThePlayer.isAlive().isEqualTo(true));
    }
}
