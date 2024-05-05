import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Render {


    public static void render(MapEntity mapEntity) {
        int size = mapEntity.getSize();
        Set<Coordinates> keyCoordinates = mapEntity.getMap().keySet();
        HashMap<Coordinates,Entity> entity = mapEntity.getMap();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    System.out.print('-');
                }
                System.out.print('|');
                for(Coordinates a : keyCoordinates){
                    if (j == a.getX()){
                        System.out.print(entity.get(a.getCoordinates()));
                        }
                    }
                }
            System.out.println();

            }

        }
    }
