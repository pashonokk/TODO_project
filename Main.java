package TODO;

import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            method();
        }
    }

    public static void method() {
        User me = User.getInstatnce();
        System.out.println(User.ANSI_YELLOW + "Можливі функції" + User.ANSI_RESET);
        System.out.println("""
                1.0 Заповнити список завданнями - fillList
                2.0 Подивитись завдання в файлі - showTasksInFile
                3.0 Помітити завдання як виконане(DONE)- makeTaskDone
                4.0 Подивитись виконані завдання - showDoneTasks
                5.0 Подивитись завдання в прогрессі - showTasksInProgress
                6.0 Видалити завдання з файлу - deleteTasksFromFile""");
        System.out.print(User.ANSI_YELLOW + "Введіть номер функції яку хочете використати: " + User.ANSI_RESET);
        String s = scan.next();
        int i;
        try {
            i = Integer.parseInt(s);
        } catch (Exception e) {
            i = -1;
        }
        switch (i) {
            case 1:
                me.fillList();
                break;
            case 2:
                me.showTasksInFile();
                break;
            case 3:
                me.makeTaskDone();
                break;
            case 4:
                me.showDoneTasks();
                break;
            case 5:
                me.showTasksInProgress();
                break;
            case 6:
                me.deleteTasksFromFile();
                break;
            default:
                System.out.print("Incorrect value");
                System.out.println();
                break;
        }
    }
}

