package ba.unsa.etf.rpr;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();

        while(true){
            System.out.print("Unesi broj ili zaustavi sa rijeci stop:");
            String line = scanner.nextLine();
            if("stop".equalsIgnoreCase(line.trim())) break;
            try {
                Double number = Double.parseDouble(line);
                numbers.add(number);
            }catch (Exception e){
                System.out.println("Nije broj");
                continue;
            }
        }
        System.out.println("Rezultati: ");
        System.out.println("min:" + MathUtils.min(numbers));
        System.out.println("max: " + MathUtils.max(numbers));
        System.out.println("mean: " + MathUtils.mean(numbers));
        System.out.println("stdev: " + MathUtils.stdev(numbers));
    }
}
