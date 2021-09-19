package train.com.planets;

public class Mars extends Planet implements PlanetAcceleration {
    public Mars() {
        r = 3396200;
        m =6.4171*Math.pow(10,23);
    }

    @Override
    public double[] acceleration() {
        double num[] = AccelerationUtil.freeFallAcceleration(G, m,r);
        g = num[0];
        return num;
    }
}
