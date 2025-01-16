import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class RaceLaMan {
    ArrayList<Auto> laMan = new ArrayList<>();
    Scanner console = new Scanner(System.in);

    public void start() {
        System.out.println("Мы рады приветствовать на гонке Ле ман 24!");
        System.out.println("Введите 'Привет'");
        while (true) {
            String command = console.nextLine();
            if (command.equals("ФИНИШ")) {
                System.out.println("Программа завершена! Спасибо, что зашли к нам на гонку!");
                break;
            } else {
                executeCommand(command);
            }

        }
    }

    private void executeCommand(String command) {
        if (command.equals("Привет")) {
            System.out.println("Время назвать автомобили наших участников и их скорости!");
            executeCreate();
        }
    }

    private void executeCreate() {
        while (laMan.size() < 3) {
            System.out.println("Введите авто участника");
            String name = console.nextLine();
            System.out.println("Введите скорость участника");
            while (!console.hasNextDouble()) {
                System.out.println("Недопустимый знак, введите число");
                console.nextLine();
            }
            double speed = console.nextDouble();
            console.nextLine();
            if (speed < 0 || speed > 250) {
                System.out.println("Допустимая скорость участников не должна превышать " +
                        "250 км/ч");
            } else {
                laMan.add(new Auto(name, speed));
                System.out.println("Давайте поприветствуем нашего участника на " + name + ", "
                        + "его скорость равна " + speed + " км/ч");
            }
        }
        System.out.println("Отлично, для начала гонки введите 'СТАРТ'");
        compareDist();
    }

    private void compareDist() {
        String go = console.nextLine();
        if (go.equals("СТАРТ")) {
            System.out.println("ГОНКА НАЧАЛАСЬ \n*** \nПОЗАДИ 24 КИЛОМЕТРА");
            Collections.sort(laMan);
            if ((laMan.get(2).dist == laMan.get(1).dist) && (laMan.get(1).dist ==
                    laMan.get(0).dist)) {
                System.out.println("Победила дружба!\nВсе участники проехали одинаковое " +
                        "расстояние");
            } else if ((laMan.get(2).dist == laMan.get(1).dist) && (laMan.get(1).dist >
                    laMan.get(0).dist)) {
                System.out.println("Победили участники на " + laMan.get(2).name + " и на " +
                        laMan.get(1).name);
            } else {
                System.out.println("Победил участник на " + laMan.get(2).name);
            }
            System.out.println("Спасибо за внимание!!!");
        }
    }
}
