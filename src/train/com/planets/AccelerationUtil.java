package train.com.planets;

public class AccelerationUtil {

    public static double freeFallAcceleration(double G, double m, double r) {
        return G * m / (r * r);
    }
}
