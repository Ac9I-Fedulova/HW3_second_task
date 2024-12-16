public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int myIndex = (int) service.calculate(77.54, 1.98);

        System.out.println(myIndex);
    }
}