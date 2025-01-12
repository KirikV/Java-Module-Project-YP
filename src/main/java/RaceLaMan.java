import java.util.ArrayList;
import java.util.Scanner;

class RaceLaMan {
    ArrayList<Auto> laMan = new ArrayList<>();
    Scanner console = new Scanner(System.in);

    public void start() {
        System.out.println("Мы рады приветствовать на гонке Ле ман 24!");
        System.out.println("Введите 'Привет'");
        while (true) {
            String command = console.nextLine();
            if (command.equals("Завершить")) {
                System.out.println("Программа завершена! Спасибо, что зашли к нам на гонку!");
                break;
            } else {
                executeCommand(command);
            }

        }
    }

    private void executeCommand(String command) {
        if (command.equals("Привет")) {
            System.out.println("Время назвать модели авто наших участников!");
            System.out.println("Введите авто участника и его скорость");
            executeCreate();
        }
    }

    private void executeCreate() {
        while (laMan.size() < 3) {
            String name = console.nextLine();
            int speed = console.nextInt();
            console.nextLine();
            laMan.add(new Auto(name, speed));
            System.out.println("Давайте поприветствуем нашего участника на " + name + ", " +
                    "его скорость равна " + speed + " км/ч");
        }
        System.out.println("Отлично, для начала гонки введите 'СТАРТ'");
        compareSpeed();
    }

    private void compareSpeed() {
        String go = console.nextLine();
        if (go.equals("СТАРТ")) {
            System.out.println("ГОНКА НАЧАЛАСЬ \nУПОРНАЯ БОРЬБА");
        } else if (speed(0) > speed(1),speed(2)){
            System.out.println();

        }
    }
}
