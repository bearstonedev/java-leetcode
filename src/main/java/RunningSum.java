public class RunningSum {
    public int[] runningSum(int[] input) {
        if (input.length == 1) {
            return input;
        }

        int[] result = new int[input.length];
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            result[i] = sum;
        }

        return result;
    }
}
