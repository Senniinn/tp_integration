package epsi.i1.tp_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.math3.distribution.NormalDistribution;

@SpringBootApplication
public class TpIntegrationApplication {


    public static void main(String[] args) {

        COVIDLib app = new COVIDLib();

        NormalDistribution normalDistribution = new NormalDistribution(15, 7);

        System.out.println("Covid 7 jours : "+app.covidChanceEnMoyenne(normalDistribution, 15));
        System.out.println("Covid entre 8 et 22 jours : "+app.covidChanceDurree(normalDistribution, 8, 22));
        System.out.println("Covid entre 1 et 29 jours : "+app.covidChanceDurree(normalDistribution, 1, 29));
        System.out.println("Covid entre 0 et 36 jours : "+app.covidChanceDurree(normalDistribution, -6, 29));
        System.out.println("Covid 0 jours : "+app.covidChanceEnMoyenne(normalDistribution, 0));

    }

}
