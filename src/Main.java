public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double myIndex = service.calculate(77.54, 1.98);

        System.out.println((int) myIndex);
    }
}