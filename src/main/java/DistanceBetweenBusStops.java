public class DistanceBetweenBusStops {
    private int[] distance;

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start == destination) {
            return 0;
        }

        this.distance = distance;
        int clockwiseDistance = getDistance(start, destination);
        int counterclockwiseDistance = getDistance(destination, start);
        return Integer.min(clockwiseDistance, counterclockwiseDistance);
    }

    private int getDistance(int start, int destination) {
        int sum = 0;
        int i = start;

        while (i != destination) {
            sum += distance[i];
            i++;
            if (i >= distance.length) {
                i = 0;
            }
        }

        return sum;
    }
}
