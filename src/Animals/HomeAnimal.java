package Animals;

public class HomeAnimal {


    protected String name;  // protected доступ внутри класса и у его наследников
    protected int weight;
    protected int resource;
    protected int health;   // (без идентификатора) int доступ ТОЛЬКО внутри папки
    protected int speed;
    protected boolean ForEat;
    protected boolean haveResource;
    protected int maxHealth;

    public HomeAnimal(String name, int weight, int resource, int health, int speed, boolean forEat, boolean haveResource, int maxHealth) {
        this.name = name;
        this.weight = weight;
        this.resource = resource;
        this.health = health;
        this.speed = speed;
        ForEat = forEat;
        this.haveResource = haveResource;
        this.maxHealth = maxHealth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isForEat() {
        return ForEat;
    }

    public void setForEat(boolean forEat) {
        ForEat = forEat;
    }

    public boolean isHaveResource() {
        return haveResource;
    }

    public void setHaveResource(boolean haveResource) {
        this.haveResource = haveResource;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}
