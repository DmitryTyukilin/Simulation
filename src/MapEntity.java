import java.util.HashMap;

public class MapEntity {
   private int size;

   private HashMap<Coordinates,Entity> map = new HashMap<>();

   public MapEntity(int size) {
      this.size = size;
   }

   public HashMap<Coordinates, Entity> getMap() {
      return map;
   }
   public void putEntity(Coordinates coordinates, Entity entity) {
      map.put(coordinates, entity);
   }

   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }

   @Override
   public String toString() {
      return "Map{" +
              "map=" + map +
              '}';
   }
}
