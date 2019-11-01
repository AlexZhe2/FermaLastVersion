package Animals;

public class Wolf extends WildAnimal {

    public Wolf(int weight, int force, int speed,int lose) {
        super(weight, force, speed, lose);
    }


    @Override
    public String toString() {
        return "Wolf" ;
    }
}
