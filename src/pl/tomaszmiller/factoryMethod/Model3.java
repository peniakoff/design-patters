package pl.tomaszmiller.factoryMethod;

/**
 * Created by Peniakoff on 15.07.2017.
 */
public class Model3 extends Tesla {

    public Model3() {
        type = TeslaType.MODEL_3;
    }

    protected void makeForThePeople() {
        System.out.println("It is made for the people.");
    }

    @Override
    public Tesla getTesla() {
        makeForThePeople();
        return this;
    }

}
