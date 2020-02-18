import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisScoreCalculatorShould {

    private TennisScoreCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new TennisScoreCalculator();
    }
    
    @Test
    public void loveLoveWhenNoPointsAreScored() {
        assertEquals("love:love", calculator.score(0,0));
    }

    @Test
    public void loveFifteenWhen0and1Scored() {
        assertEquals("love:fifteen", calculator.score(0,1));
    }

    @Test
    public void fifteenFifteenWhen1and1Scored() {
        assertEquals("fifteen:fifteen", calculator.score(1,1));
    }

    @Test
    public void fifteenThirtyWhen1and2Scored(){
        assertEquals("fifteen:thirty", calculator.score(1, 2));
    }

    @Test
    public void thirtyFifteenWhen2and1Scored() {
        assertEquals("thirty:fifteen", calculator.score(2, 1));
    }

    @Test
    public void deuceWhen2and2Scored() {
        assertEquals("deuce", calculator.score(2,2));
    }

    @Test
    public void deuceWhen3and3Scored() {
        assertEquals("deuce", calculator.score(3,3));
    }

    @Test
    public void deuceWhen4and4Scored() {
        assertEquals("deuce", calculator.score(4, 4));
    }

    @Test
    public void advantagePLayer1When4and3Scored() {
        assertEquals("advantagePlayer1", calculator.score(4,3));
    }

    @Test
    public void advantagePlayer2When3and4Scored() {
        assertEquals("advantagePlayer2", calculator.score(3, 4));
    }

    @Test
    public void fortyFifteenWhen4and1Scored() {
        assertEquals("forty:fifteen", calculator.score(4, 1));
    }

    @Test
    public void fifteenFortyWhen1and4Scored() {
        assertEquals("fifteen:forty", calculator.score(1, 4));
    }

    @Test
    public void loveFortyWhen0and4Scored() {
        assertEquals("love:forty", calculator.score(0,4));
    }

    @Test
    public void fortyLoveWhen4and0Scored() {
        assertEquals("forty:love", calculator.score(4, 0));
    }
}
