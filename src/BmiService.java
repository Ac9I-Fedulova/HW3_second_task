public class BmiService {

    public int calculate(double massInKg, double heightInM) {

        int bmiIndex = (int) (massInKg / (heightInM * heightInM));

        return bmiIndex;
    }
}
