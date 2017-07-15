package pl.tomaszmiller;

import pl.tomaszmiller.factoryMethod.FremontFactory;
import pl.tomaszmiller.factoryMethod.Tesla;
import pl.tomaszmiller.factoryMethod.TeslaFactory;
import pl.tomaszmiller.factoryMethod.TeslaType;

public class Main {

    public static void main(String[] args) {

//        FactoryMethod
        TeslaFactory factory = new FremontFactory();
        Tesla model3 = factory.produceTesla(TeslaType.MODEL_3);
        Tesla modelS = factory.produceTesla(TeslaType.MODEL_S);
        Tesla modelX = factory.produceTesla(TeslaType.MODEL_X);

        model3.getTesla();
        modelS.getTesla();
        modelX.getTesla();

//        Adapter


    }
}
