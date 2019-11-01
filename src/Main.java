import Animals.*;

public class Main {



    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 3, 0, 5, 6, false, false, 5);
        Cow cow1 = new Cow("Burenka", 300, 5, 40, 5, true, true, 100);
        Cow cow2 = new Cow("Alenka", 300, 5, 40, 5, true, true, 100);
        Chicken chicken1 = new Chicken("chi1", 5, 2, 5, 3, true, true, 5);
        Chicken chicken2 = new Chicken("chi2", 5, 2, 5, 3, true, true, 5);
        Chicken chicken3 = new Chicken("chi3", 5, 2, 5, 3, true, true, 5);
        Chicken chicken4 = new Chicken("chi4", 5, 2, 5, 3, true, true, 5);
        Chicken chicken5 = new Chicken("chi5", 5, 2, 5, 3, true, true, 5);
        Rabbit rabbit1 = new Rabbit("Rab1", 4, 0, 3, 9, true, false, 3);
        Rabbit rabbit2 = new Rabbit("Rab2", 4, 0, 3, 9, true, false, 3);

        Bear bear1 = new Bear(159, 30, 6, 0);
        Bear bear2 = new Bear(159, 30, 6, 0);
        Fox fox1 = new Fox(12, 10, 7, 0);
        Fox fox2 = new Fox(12, 10, 7, 0);
        Fox fox3 = new Fox(12, 10, 7, 0);
        Wolf wolf1 = new Wolf(40, 20, 10, 0);
        Wolf wolf2 = new Wolf(40, 20, 10, 0);

        Play play = new Play();

        play.addHomeAnimal(cat1, cow1, cow2, chicken1, chicken2, chicken3, chicken4, chicken5, rabbit1, rabbit2);
        play.addWildAnimal(bear1, bear2, fox1, fox2, fox3, wolf1, wolf2);
        play.passDay();

    }

}
