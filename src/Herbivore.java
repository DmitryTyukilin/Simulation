public class Herbivore extends Creature{
    private int HP;
    private Coordinates coordinates;

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
}
