import java.util.ArrayList;
import java.util.Scanner;

class RaceLaMan {
    ArrayList<Auto> laMan = new ArrayList<>();

    public void start() {
        executeCommand();
    }

    public void executeCommand() {
        Scanner console = new Scanner(System.in);
        String command = console.nextLine();
        if (command.equals("Привет")) {
            System.out.println("Время назвать модели авто наших участников!");
            executePrint();
        }
    }

    public void executePrint() {
        laMan.add(new Auto("Цивик"));
    }
}
