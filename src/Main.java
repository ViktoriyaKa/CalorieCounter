import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printMenu();

        Scanner scanner = new Scanner(System.in);
        int userAction = scanner.nextInt();

        while (userAction!=1 && userAction!=2 && userAction!=3 && userAction!=4){
            System.out.println("Некорректный ввод!");
            printMenu();

            userAction = scanner.nextInt();
        }

        System.out.println("Программа завершена!");
    }

    private static void printMenu(){
        System.out.println("Выберите действие 1-4:\n" +
                "1. Ввести количество шагов за определённый день\n" +
                "2. Напечатать статистику за определённый месяц\n" +
                "3. Изменить цель по количеству шагов в день\n" +
                "4. Выйти из приложения\n");
    }
}