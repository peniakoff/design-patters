package pl.tomaszmiller.factoryMethod;

/**
 * Created by Peniakoff on 15.07.2017.
 */
public class ModelX extends Tesla {

    public ModelX() {
        type = TeslaType.MODEL_X;
    }

    protected void addSeats() {
        System.out.println("More seats added.");
    }

    @Override
    public Tesla getTesla() {
        addSeats();
        return this;
    }

}
