import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        MapEntity map = new MapEntity(5);
        Herbivore zebra = new Herbivore(50,new Coordinates(3,4));
        Herbivore zebra2 = new Herbivore(30,new Coordinates(1,2));
        map.putEntity(zebra.getCoordinates(), zebra);
        map.putEntity(zebra2.getCoordinates(), zebra2);



    Render.render(map);
    }
}
