public class Auto implements Comparable<Auto> {

    String name;
    double speed;
    double dist;

    public Auto(String autoName, double speed) {
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
        return (int) (this.dist - auto.dist);
    }
}
