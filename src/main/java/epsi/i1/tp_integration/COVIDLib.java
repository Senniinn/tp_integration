package epsi.i1.tp_integration;

import org.apache.commons.math3.distribution.NormalDistribution;

public class COVIDLib {

    double covidChanceEnMoyenne(NormalDistribution n, int m) {
        return n.cumulativeProbability(m);
    }

    double covidChanceDurree(NormalDistribution n , int a, int b) {
        return n.probability(a, b);
    }

    public static int addition(int a, int b) {
        return a + b;
    }

}