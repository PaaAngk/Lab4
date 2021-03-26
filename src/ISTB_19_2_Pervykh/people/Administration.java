package ISTB_19_2_Pervykh.people;

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
    public String work () {
        int workType = random.nextInt(3);
        switch (workType) {
            case 0:
                return (getProfession() + " " + getName() +" устраивает планёрку");
            case 1:
                return (getProfession() + " " + getName() +" раздаёт задания");
            default:
                return (getProfession() + " " + getName() +" придумывает стратегию развития");
        }
    }

}
