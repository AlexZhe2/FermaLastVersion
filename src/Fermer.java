public class Fermer extends Ferma  implements FermerInterface {


    protected int totalResource = 50;
    protected int wastedResource = 2;
    protected boolean isDead;
    protected boolean luck;


    public int getTotalResource() {
        return totalResource;
    }

    public void setTotalResource(int totalResource) {
        this.totalResource = totalResource;
    }

    public int getWastedResource() {
        return wastedResource;
    }

    public void setWastedResource(int wastedResource) {
        this.wastedResource = wastedResource;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        this.isDead = dead;
    }

    @Override
    public void mineResource() {
        haveResAnimals();
        if (varHaveResAnimals==true) {
            System.out.print("Фермер собрал ресурсы с домашних животных");
            if (!checkHomeAnimals()) {
                for (int i = 0; i < arrHomeAnimals.length; i++) {
                    if (arrHomeAnimals[i] != null) {
                        totalResource += arrHomeAnimals[i].getResource();
                    }
                }
                System.out.println(", всего ресурсов: " + totalResource);
            }
        }
    }

    @Override
    public void feedAnimals() {
        if (!checkHomeAnimals()) {
            System.out.println("Фермер покормил всех домашних животных");
            for (int i = 0; i < arrHomeAnimals.length; i++) {
                if (arrHomeAnimals[i] != null && arrHomeAnimals[i].getMaxHealth() > arrHomeAnimals[i].getHealth()) {
                    arrHomeAnimals[i].setHealth(arrHomeAnimals[i].getHealth() + 1);
                }
            }
        }
    }

    @Override
    public void eatingHomeAnimals() {
        if (varHaveResAnimals==false) {
            System.out.println("На ферме не с кого взять ресурсы. Фермер хочет кого нибудь съесть!");

            if (!haveAnimalsForEat()) {
                System.out.println("..но на ферме некого съесть");
            } else {
                moveArrayHome();
                selectHomeAnimal();

                if (arrHomeAnimals[randomNum2].isForEat() == true) {
                    System.out.println("Фермер съел - " + arrHomeAnimals[randomNum2]);
                    totalResource += arrHomeAnimals[randomNum2].getHealth();
                    System.out.println("Фермер получил ресурсы от поедания домашнего животного, всего ресурсов: " + totalResource);
                    arrHomeAnimals[randomNum2] = null;
                    moveArrayHome();
                } else {
                    System.out.println("...жертва несъедобная");
                    for (int i = 0; i < arrHomeAnimals.length; i++) {
                        if (arrHomeAnimals[i] != null && arrHomeAnimals[i].isForEat()) {
                            System.out.println("Выбрана новая жертва - " + arrHomeAnimals[i]);
                            System.out.println("Фермер съел - " + arrHomeAnimals[i]);
                            totalResource += arrHomeAnimals[i].getHealth();
                            System.out.println("Фермер получил ресурсы от поедания домашнего животного, всего ресурсов: " + totalResource);
                            arrHomeAnimals[i] = null;
                            moveArrayHome();
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean kickOutWildAnimal() {
        int a;
        a = (int) (Math.random() * 2); // случайное число от о до 1 [0;1]
        if (a == 1) {
            luck=true;
            System.out.println("Фермер прогнал дикое животное");
        } else {
            luck=false;
            System.out.println("Фермер НЕ смог прогнать дикое животное");

        }
        return luck;
    }


    @Override
    public void dailyWastedOfResource() {
        totalResource -= wastedResource;
        if (totalResource < 0) {
            totalResource = 0;
        }
        System.out.println("Фермер потратил ресурсы, всего ресурсов осталось: " + totalResource);
    }

    @Override
    public boolean die() {
        if (totalResource <= 0) {
            System.out.println("Фермер мертв!!!!!");
            isDead = true;
        }
        return isDead;
    }

    public void huntingOnHomeAnimals() {
        if (!checkHomeAnimals()) {


            selectWildAnimal();
            selectHomeAnimal();

            System.out.println("Дикое животное " + arrWildAnimals[randomNum] + " нападает на " + arrHomeAnimals[randomNum2]);

            if (kickOutWildAnimal()) {
                arrWildAnimals[randomNum].setLose(arrWildAnimals[randomNum].getLose() + 1);
            } else atack();
            if (arrWildAnimals[randomNum].getLose() >= 3) {
                System.out.println(arrWildAnimals[randomNum] + " НАВСЕГДА ушел с фермы ");
                arrWildAnimals[randomNum] = null;
                moveArrayWild();
            }
        }else {
            System.out.println("На ферму пришло дикое животное, но охота не состоялась!!! На ферме нет домашних животных.");
        }
    }

}
