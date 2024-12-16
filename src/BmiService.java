public class BmiService {

    public double calculate(double massInKg, double heightInM) {

        return massInKg / (heightInM * heightInM);
    }
}
