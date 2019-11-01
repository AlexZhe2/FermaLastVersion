import Animals.*;

import java.util.Arrays;


public class Ferma {

    boolean win = false;
    boolean emptyFerm = false;
    boolean emptyForest = false;
    boolean varHaveResAnimals = true;
    boolean varHaveAnimalsForEat = true;
    int randomNum = 0;
    int randomNum2 = 0;

    public boolean haveAnimalsForEat() {
        int q = 0;
        for (int i = 0; i < arrHomeAnimals.length; i++) {
            if (arrHomeAnimals[i] != null && arrHomeAnimals[i].isForEat() == true) {
                q++;
            }
        }
        if (q == 0) {
            varHaveAnimalsForEat = false;
        }
        return varHaveAnimalsForEat;
    }


    public boolean haveResAnimals() {
        int z = 0;
        for (int i = 0; i < arrHomeAnimals.length; i++) {
            if (arrHomeAnimals[i] != null && arrHomeAnimals[i].isHaveResource() ==true) {
                z++;
                varHaveResAnimals = true;
            }
        }
        if (z == 0) {
            varHaveResAnimals = false;
        }
        return varHaveAnimalsForEat;
    }


    public boolean checkWin() {

        if (checkWildAnimals()) {
            win = true;
            System.out.println("Фермер прогнал всех диких животных!!!");

        }
        return win;
    }

    public boolean checkHomeAnimals() {
        int y = 0;
        for (int i = 0; i < arrHomeAnimals.length; i++) {
            if (arrHomeAnimals[i] == null) {
                y++;
            }
            if (y == arrHomeAnimals.length) {
                emptyFerm = true;
                //       System.out.println("=======All animals is die========");
            }
        }
        return emptyFerm;
    }

    public boolean checkWildAnimals() {
        int y = 0;
        for (int i = 0; i < arrWildAnimals.length; i++) {
            if (arrWildAnimals[i] == null) {
                y++;
            }
            if (y == arrWildAnimals.length) {
                emptyForest = true;
                //         System.out.println("=======All Wild animals is die========");
            }
        }
        return emptyForest;
    }

    public HomeAnimal[] arrHomeAnimals = new HomeAnimal[10];

    public void addHomeAnimal(HomeAnimal... newAnimals) {

        if (newAnimals.length < 11) {
            for (int i = 0; i < arrHomeAnimals.length; i++) {
                if (this.arrHomeAnimals[i] == null) {
                    System.arraycopy(newAnimals, 0, this.arrHomeAnimals,
                            i, newAnimals.length);
                    break;
                }
            }
        } else System.out.println("Количество добавляемых животных должно быть меньше или равно 10");
    }

    public WildAnimal[] arrWildAnimals = new WildAnimal[10];

    public void addWildAnimal(WildAnimal... newWildAnimals) {

        if (newWildAnimals.length < 11) {
            for (int i = 0; i < arrWildAnimals.length; i++) {
                if (this.arrWildAnimals[i] == null) {
                    System.arraycopy(newWildAnimals, 0, this.arrWildAnimals,
                            i, newWildAnimals.length);
                    break;
                }
            }
        } else System.out.println("Количество добавляемых животных должно быть меньше или равно 10");
    }

    public WildAnimal selectWildAnimal() {
        WildAnimal returnWildAnimal = null;
        int r = 0;
        for (int i = 0; i < arrWildAnimals.length; i++) {
            if (arrWildAnimals[i] != null) {
                r++;
            }
        }
        randomNum = (int) (Math.random() * r);
        returnWildAnimal = arrWildAnimals[randomNum];
        System.out.print("На ферму пришло дикое животное - ");
        System.out.println(arrWildAnimals[randomNum]);
        return returnWildAnimal;
    }

    public HomeAnimal selectHomeAnimal() {
        HomeAnimal returnHomeAnimal = null;
        int r2 = 0;
        for (int i = 0; i < arrHomeAnimals.length; i++) {
            if (this.arrHomeAnimals[i] != null) {
                r2++;
            }
        }
        randomNum2 = (int) (Math.random() * r2);
        returnHomeAnimal = arrHomeAnimals[randomNum2];
        System.out.print("Выбрана жертва это - ");
        System.out.println(arrHomeAnimals[randomNum2]);
        return returnHomeAnimal;
    }

    public void atack() {

        if (!checkHomeAnimals()) {
            if (arrHomeAnimals[randomNum2].getSpeed() < arrWildAnimals[randomNum].getSpeed()) {
                arrHomeAnimals[randomNum2].setHealth(arrHomeAnimals[randomNum2].getHealth() - arrWildAnimals[randomNum].getForce());
                //    System.out.println("Дикое животное охотится");
            } else {
                System.out.println(" ...но домашнее животное смогло убежать и не пострадало!");
            }

            if (arrHomeAnimals[randomNum2].getHealth() <= 0) {
                System.out.println("Дикое животное убило - " + arrHomeAnimals[randomNum2]);
                arrHomeAnimals[randomNum2] = null;
            }
            //       System.out.println(Arrays.toString(arrHomeAnimals));
            moveArrayHome();
            //      System.out.println(Arrays.toString(arrHomeAnimals));
        }
    }

    public void moveArrayHome() {
        for (int k = 0; k <= arrHomeAnimals.length - 2; k++) {
            if (arrHomeAnimals[k] == null && arrHomeAnimals[k + 1] != null) {
                arrHomeAnimals[k] = arrHomeAnimals[k + 1];
                arrHomeAnimals[k + 1] = null;
            }
        }
        for (int k = arrHomeAnimals.length - 1; k >= 1; k--) {
            if (arrHomeAnimals[k] != null && arrHomeAnimals[k - 1] == null) {
                arrHomeAnimals[k - 1] = arrHomeAnimals[k];
                arrHomeAnimals[k] = null;
            }
        }
    }

    public void moveArrayWild() {
        for (int k = 0; k <= arrWildAnimals.length - 2; k++) {
            if (arrWildAnimals[k] == null && arrWildAnimals[k + 1] != null) {
                arrWildAnimals[k] = arrWildAnimals[k + 1];
                arrWildAnimals[k + 1] = null;
            }
        }
        for (int k = arrWildAnimals.length - 1; k >= 1; k--) {
            if (arrWildAnimals[k] != null && arrWildAnimals[k - 1] == null) {
                arrWildAnimals[k - 1] = arrWildAnimals[k];
                arrWildAnimals[k] = null;
            }
        }
    }


}
