import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<java.lang.Boolean> output = new ArrayList<>(candies.length);

        int highest = 0;
        for (int i = 0; i < candies.length; i++) {
            highest = Integer.max(candies[i], highest);
            candies[i] += extraCandies;
        }

        for (int candy : candies) {
            output.add(candy >= highest);
        }

        return output;
    }
}
