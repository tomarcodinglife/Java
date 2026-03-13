package thirdChalanges;

public class test {
    
    public static void main(String[] args) {
        // i want to array mean and median.

        int[] array = {1, 2, 3, 5, 4, 5};

        // using static inner class
        double mean = ArrayOperations.StatisticsWithStatic.mean(array);
        double median = ArrayOperations.StatisticsWithStatic.median(array);

        System.out.println("Using Static Inner Class:");
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);

        // // using non-static inner class
        // ArrayOperations arrayOperations = new ArrayOperations();

        // ArrayOperations.StatisticsWithNonStatic statisticsWithNonStatic = arrayOperations.new StatisticsWithNonStatic();
        // double meanNonStatic = statisticsWithNonStatic.mean(array);
        


    }

}
