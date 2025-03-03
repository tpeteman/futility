package futility;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BrainTest {
    RCSSServer server;
    Client client;
    Trainer trainer;
    
    public BrainTest() {
        
    }
    
    @Before
    public void setUp() {
        this.server = new RCSSServer();
        this.server.start();
        String[] args = {};
        this.client = new Client(args);
        this.client.init();
    }
    
    @After
    public void tearDown() {
        this.server.stop();
        this.client.quit();
    }
    
    /**
     * Tests that the player with the brain correctly updates its beliefs about the player's
     * direction when sending turn commands.
     */
    @Test
    public void testTurnCommandsUpdateBeliefs() {
        this.client.player.brain.overrideStrategy(Brain.Strategy.TEST_TURNS);
        this.client.player.brain.parseMessage(this.client.receiveMessage());
        int time = this.client.player.brain.time;
        // TODO
        assertEquals(true, true);
    }
}
