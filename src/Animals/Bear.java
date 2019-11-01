package Animals;

public class Bear extends WildAnimal {

    public Bear(int weight, int force, int speed, int lose) {
        super(weight, force, speed, lose);
    }

    @Override
    public String toString() {
        return "Bear";
    }
}
