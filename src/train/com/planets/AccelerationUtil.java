package train.com.planets;

public class AccelerationUtil {

    public static double[] freeFallAcceleration(double G, double m, double r) {
        double num [] = new  double[4];
        num[0] = G * m / (r * r);
        num[1] = G;
        num[2] = m;
        num[3] = r;
        return num;
    }
}
