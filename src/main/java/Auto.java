import java.util.Objects;

public class Auto {

    String name;
    int speed;

    public Auto(String autoName, int sPeed) {
        speed = sPeed;
        name = autoName;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
