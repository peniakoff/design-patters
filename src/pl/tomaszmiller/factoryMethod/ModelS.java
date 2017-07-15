package pl.tomaszmiller.factoryMethod;

/**
 * Created by Peniakoff on 15.07.2017.
 */
public class ModelS extends Tesla {

    public ModelS() {
        type = TeslaType.MODEL_S;
    }

    protected void addBatteries() {
        System.out.println("More batteries added.");
    }

    @Override
    public Tesla getTesla() {
        addBatteries();
        return this;
    }

}
