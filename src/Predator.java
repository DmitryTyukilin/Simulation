public class Predator extends Creature{
    @Override
    public void makeMove() {
        System.out.println("Ищу травоядное и атакую его");
    }
    public int attack() {
        return 5;
    }
}
