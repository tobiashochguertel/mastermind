import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * CombinationTest
 * <p>
 * Created on 09.11.17
 * <p>
 */
@RunWith(JUnit4ClassRunner.class)
public class CombinationTest {

    @Test
    public void oneColorMatched() {
        assertThat(new Secret().evaluate(new Guess()), is(1));
    }

}