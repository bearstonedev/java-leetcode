import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class KidsWithCandiesTest {
    @Test
    void testBasicCase() {
        List<Boolean> expected = Arrays.asList(new Boolean[]{true,true,true,false,true});
        List<Boolean> actual = new KidsWithCandies().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        for (int i = 0; i < actual.size() && i < expected.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i));
        }
    }
}
