package Animals;

public class Chicken extends HomeAnimal {

    public Chicken(String name, int weight, int resource, int health, int speed, boolean forEat, boolean haveResource, int maxHealth) {
        super(name, weight, resource, health, speed, forEat, haveResource, maxHealth);
    }

    @Override
    public String toString() {
        return "Chicken" ;
    }
}
