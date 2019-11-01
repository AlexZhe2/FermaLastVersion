package Animals;

public class Cow extends HomeAnimal {

    public Cow(String name, int weight, int resource, int health, int speed, boolean forEat, boolean haveResource, int maxHealth) {
        super(name, weight, resource, health, speed, forEat, haveResource, maxHealth);
    }

    @Override
    public String toString() {
        return "Cow" ;
    }
}
