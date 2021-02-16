import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistanceBetweenBusStopsTest {
    DistanceBetweenBusStops sut;

    @BeforeEach
    public void init() {
        sut = new DistanceBetweenBusStops();
    }

    @Test
    void shouldGetZeroIfStartAndDestinationMatch() {
        int expected = 0;
        int actual = sut.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 1, 1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinimumDistanceClockwiseBetweenTwoStops() {
        int expected = 1;
        int actual = sut.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinimumDistanceClockwiseBetweenThreeStops() {
        int expected = 3;
        int actual = sut.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinimumDistanceCounterclockwiseBetweenTwoStops() {
        int expected = 4;
        int actual = sut.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinimumDistanceCounterclockwiseBetweenThreeStops() {
        int expected = 3;
        int actual = sut.distanceBetweenBusStops(new int[]{4, 3, 2, 1}, 0, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinimumDistanceWithNonzeroStart() {
        int expected = 5;
        int actual = sut.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 1, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotTimeout() {
        int expected = 234;
        int actual = sut.distanceBetweenBusStops(new int[]{6,47,48,31,10,27,46,33,52,33,38,25,32,45,36,3,0,33,22,53,8,13,18,1,44,41,14,5,38,25,48}, 22, 0);
        Assertions.assertEquals(expected, actual);
    }
}
