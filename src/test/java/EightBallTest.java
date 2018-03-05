import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {
    private EightBall myAnswers;

    @Before
    public void before(){
        ArrayList<String> testAnswers = new ArrayList<>();
        testAnswers.add("Yes definitely");
        testAnswers.add("Ask again later");
        testAnswers.add("Very doubtful");
        this.myAnswers = new EightBall(testAnswers);
    }

    @Test
    public void canGetFirstAnswer(){
        assertEquals("Yes definitely", myAnswers.getAnswerAtIndex(0));
    }

    @Test
    public void canGetRandom(){
        ArrayList<String> copy = myAnswers.getAnswers();
        int randomAnswer = myAnswers.getRandomAnswer();
        assertTrue(copy.contains(randomAnswer));
    }


}
