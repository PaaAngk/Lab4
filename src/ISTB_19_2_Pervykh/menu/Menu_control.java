package ISTB_19_2_Pervykh.menu;

import java.util.Scanner;

public class Menu_control {

    //Управление действиями
    public static void menuCommand () {
        while (true) {
            String command = command();
            Menu_logic.menuChanger(command);
        }
    }

    //Ввод команд
    private static String command () {
        String command = "";
        Scanner scan = new Scanner(System.in); //Сканер
        while (true) {
            System.out.printf("Введите команду: ");
            command = scan.nextLine();
            try {
                if (!(command.equals("new") || command.equals("delete")
                        || command.equals("search") || command.equals("info")
                        || command.equals("work") || command.equals("exit"))) throw new Exception();
                return command;
            }
            catch (Exception e) {
                Menu_graphics.error("Некорректный ввод!");
            }
        }
    }

    public static String[] add () {
        String list [] = new String[3];
        Scanner scan = new Scanner(System.in); //Сканер
        boolean cycle = true;
        System.out.println("    Профессия");
        System.out.println("1. Администратор");
        System.out.println("2. Инженер");
        System.out.println("3. Рабочий");
        while (cycle) {
            Menu_graphics.inputText("Тип: ");
            int i = 0;
            try {
                i = scan.nextInt();
            }
            catch (Exception e) {
                Menu_graphics.error("Некорректный ввод");
            }
            switch (i) {
                case 1:
                    list [0] = "Администратор";
                    cycle = false;
                    break;
                case 2:
                    list [0] = "Инженер";
                    cycle = false;
                    break;
                case 3:
                    list [0] = "Рабочий";
                    cycle = false;
                    break;
                default:
                    Menu_graphics.error("Некорректный ввод");
                    break;
            }
        }
        list [1] = staffName();
        list [2] = staffAge();
        return list;
    }

    public static String staffName () {
        Scanner scan = new Scanner(System.in);
        while (true) {
            Menu_graphics.inputText("Имя сотрудника: ");
            String name = scan.nextLine();
            if (!name.equals("")) return name;
            Menu_graphics.error("Некорректный ввод");
        }
    }

    public static String staffAge () {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                Menu_graphics.inputText("Возраст сотрудника: ");
                String age = Integer.toString(scan.nextInt());
                return age;
            }
            catch (Exception e) {
                Menu_graphics.error("Некорректный ввод");
            }
        }
    }

}
