public class Play extends Fermer {

    public void passDay() {

        int day = 0;

        while (!die()) {

            day++;
            System.out.println();
            System.out.println("day № " + day);

            dailyWastedOfResource();

            if (die()) break;

            huntingOnHomeAnimals();

            if (checkWin()) break;

            feedAnimals();

            mineResource();

            eatingHomeAnimals();

        }
    }
}
