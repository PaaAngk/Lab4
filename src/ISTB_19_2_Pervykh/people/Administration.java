package ISTB_19_2_Pervykh.people;

import ISTB_19_2_Pervykh.menu.Menu_graphics;

import java.util.Random;

public class Administration extends Staff {

    Random random = new Random();

    public Administration () {
        super("Костик",18,"Администратор");
    }

    public Administration (String name, int age) {
        super( name, age, "Администратор");
    }

    @Override
    public void work () {
        int workType = random.nextInt(3);
        switch (workType) {
            case 0:
                System.out.printf("%s %s устраивает планёрку%n", getProfession(), getName());
                break;
            case 1:
                System.out.printf("%s %s раздаёт задания%n", getProfession(), getName());
                break;
            case 2:
                System.out.printf("%s %s придумывает стратегию развития%n", getProfession(), getName());
                break;
        }
    }

}
