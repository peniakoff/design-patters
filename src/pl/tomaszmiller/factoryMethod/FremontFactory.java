package pl.tomaszmiller.factoryMethod;

/**
 * Created by Peniakoff on 15.07.2017.
 */
public class FremontFactory implements TeslaFactory {

    @Override
    public Tesla produceTesla(TeslaType type) {

        Tesla tesla = null;

        switch (type) {
            case MODEL_3: {
                tesla = new Model3();
                break;
            }
            case MODEL_S: {
                tesla = new ModelS();
            }
            case MODEL_X: {
                
            }
        }

    }

}
