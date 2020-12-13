package ISTB_19_2_Pervykh.menu;

public class Menu_graphics {

    //Рисует меню команд
    public static void commands (){
        System.out.println("        КОМАНДЫ");
        System.out.println("new - добавить сотрудника");
        System.out.println("delete - удалить сотрудника");
        System.out.println("search - найти сотрудника");
        System.out.println("info - показать информацию о сотруднике");
        System.out.println("work - заставить сотрудника работать");
        System.out.println("exit - завершение программы");
    }

    //Оформленный вывод сообщения об ошибке
    public static void error (String text) {
        line("*");
        centralText("*", text);
        line("*");
    }

    //Вывод текста при вводе
    public static void inputText (String text) {
        System.out.printf("%s ", text);
    }

    //Вывод оформленного текста в центр
    public static void centralText(String symbol, String text) {
        System.out.print(symbol);
        for (int i = 0; i < 98-text.length(); i++) {
            System.out.print(" ");
            if (i == 49-text.length()/2)
                System.out.print(text);
        }
        System.out.println(symbol);
    }

    //Вывод оформленного текста
    public static void text (String symbol, String text) {
        System.out.printf("%s %s", symbol, text);
        for (int i = 0; i < 97-text.length(); i++) {
            System.out.print(" ");
        }
        System.out.println(symbol);
    }

    //Вывод оформительной линии
    public static void line(String symbol) {
        for (int i = 0; i < 100; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

}
