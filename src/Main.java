public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87;// ввод значений в метрах
        double m = 98.0;// ввод значений в кг
        int bmi = service.calculate(h, m);
        System.out.println("индекс массы тела = " + bmi);
    }
}