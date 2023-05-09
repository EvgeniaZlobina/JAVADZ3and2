public class BmiService {
    public int calculate(double h, double m) {
        double index;
        index = m / (h * h);
        return (int) index;

    }
}
