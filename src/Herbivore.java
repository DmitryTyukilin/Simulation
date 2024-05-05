import java.util.Objects;

// травоядное
public class Herbivore extends Creature{
    private int HP;
    private Coordinates coordinates;
    final String  emoji = "\uD83E\uDD29";

    public Herbivore(int HP, Coordinates coordinates) {
        this.HP = HP;
        this.coordinates = coordinates;
    }

    @Override
    public void makeMove() {
        System.out.println("Делаю шаг, чтобы найти траву");
    }

    public void eatGrass(Grass grass) {
        this.HP += grass.getEnergy();

    }
    public void takeDamage(Predator predator) {
        this.HP -= predator.attack();
    }
    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return emoji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivore herbivore = (Herbivore) o;
        return HP == herbivore.HP && Objects.equals(coordinates, herbivore.coordinates) && Objects.equals(emoji, herbivore.emoji);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HP, coordinates, emoji);
    }
}
