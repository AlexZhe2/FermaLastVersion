package Animals;

public class Fox extends WildAnimal {



    public Fox(int weight, int force, int speed,int lose) {
        super(weight, force, speed, lose);
    }


    @Override
    public String toString() {
        return "Fox" ;
    }
}
