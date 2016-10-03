package abstract_factory;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {

        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
