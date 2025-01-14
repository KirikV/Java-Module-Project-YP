public class Auto implements Comparable<Auto> {

    String name;
    int speed;
    int dist;

    public Auto(String autoName, int speed) {
        this.speed = speed;
        this.name = autoName;
        this.dist = (this.speed * 24);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", dist=" + dist +
                '}';
    }

    @Override
    public int compareTo(Auto auto) {
        return this.dist - auto.dist;
    }
}
