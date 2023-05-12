public class BmiService {
    public int calculate(double h, double m) {
        double index = m / (h * h);// расчет индекса массы тела
        return (int) index;
    }
}
