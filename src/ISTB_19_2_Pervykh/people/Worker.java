package ISTB_19_2_Pervykh.people;

import java.util.Random;

public class Worker extends Staff {

    Random random = new Random();

    public Worker () {
        super("Костик",18,"Рабочий");
    }

    public Worker (String name, int age) {
        super(name,age,"Рабочий");
    }

    @Override
    public String work () {
        int salary = random.nextInt(6);
        if (salary < 3) return "Неудачный день - маленькие деньги";
        else return "Удачный день - большие деньги";
    }

}
