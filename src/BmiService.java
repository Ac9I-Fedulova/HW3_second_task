public class BmiService {

    public double calculate(double massInKg, double heightInM) {

        int bmiIndex = (int) (massInKg / (heightInM * heightInM));

        return bmiIndex;
    }
}
