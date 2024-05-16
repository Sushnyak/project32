public class BmiService {

    public int calculate(double heihgtMeters, int weight) {

        double bmiIndex = weight / Math.pow(heihgtMeters, 2);
        return (int) bmiIndex;


    }

}
