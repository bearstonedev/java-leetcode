import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RunningSumTest {
    RunningSum sut;

    @BeforeEach
    public void initSut() {
        sut = new RunningSum();
    }

    @Test
    void shouldReturnValueOfSingleElement() {
        int[] input = { 1 };
        int[] runningSum = sut.runningSum(input);
        Assertions.assertArrayEquals(input, runningSum);
    }

    @Test
    void shouldReturnRunningSumOfTwoElements() {
        int[] input = { 1, 2 };
        int[] expected = { 1, 3 };
        int[] runningSum = sut.runningSum(input);
        Assertions.assertArrayEquals(expected, runningSum);
    }

    @Test
    void shouldReturnRunningSumOfTenElements() {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] expected = { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55 };
        int[] runningSum = sut.runningSum(input);
        Assertions.assertArrayEquals(expected, runningSum);
    }
}
