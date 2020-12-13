package ISTB_19_2_Pervykh.people;

import ISTB_19_2_Pervykh.menu.Menu_graphics;

abstract public class Staff {

    private String name;
    private int age;
    private String profession;

    public Staff(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public abstract void work ();

    public void getInfo () {
        System.out.printf("Имя: %s%n", name);
        System.out.printf("Возраст: %d%n", age);
        System.out.printf("Профессия: %s%n", profession);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
