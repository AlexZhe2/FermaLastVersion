package Animals;

public class WildAnimal {

    protected int weight;
    protected int force;
    protected int speed;
    protected int lose;

    public WildAnimal(int weight, int force, int speed, int lose) {
        this.weight = weight;
        this.force = force;
        this.speed = speed;
        this.lose = lose;
    }




    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }




}
