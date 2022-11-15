package ba.unsa.etf.rpr;

import java.util.List;

public class MathUtils {
    public static Double min(List<Double> numbers) {
        double min = Double.MAX_VALUE;
        for (Double n : numbers) {
            if (n.doubleValue() < min) {
                min = n.doubleValue();
            }
        }
        return min;
    }

    public static Double max(List<Double> numbers) {
        double max = Double.MIN_VALUE;
        for(Double n : numbers){
            if(n.doubleValue() > max){
                max = n.doubleValue();
            }
        }
        return max;
    }

    public static Double mean(List<Double> numbers){
        double sum = 0;
        for(Double n : numbers){
            sum += n.doubleValue();
        }
        return sum/numbers.size();
    }

    public static Double stdev(List<Double> numbers){
        Double mean = MathUtils.mean(numbers);
        float standardDeviation = 0;
        for(Double n : numbers){
            standardDeviation += Math.pow(n - mean, 2);
        }
        return Math.sqrt(standardDeviation/numbers.size());
    }
}
