import com.adventure.YourClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class YourClassTester {

    @Test
    public void testBadGuess() {
        YourClass yc = new YourClass();
        boolean badGuess = yc.check(3, 1, 5);
        assertFalse(badGuess);
    }
}
