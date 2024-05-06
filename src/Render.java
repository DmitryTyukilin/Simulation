import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Render {


    public static void render(MapEntity mapEntity) {
        int size = mapEntity.getSize();
        Set<Coordinates> keyCoordinates = mapEntity.getMap().keySet();
        HashMap<Coordinates, Entity> entity = mapEntity.getMap();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (Coordinates a : keyCoordinates) {
                    if (i == a.getX() && j == a.getY()) {
                        System.out.print(entity.get(a));
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }

}



