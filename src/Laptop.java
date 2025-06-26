
class Processor
{
    private int size;
    private String name;
    private int generation;

    public Processor(String name, int size, int generation) {
        this.size = size;
        this.generation = generation;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", generation=" + generation +
                '}';
    }
}

class Ram
{
    private int size;
    private int speed;

    public Ram(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "size=" + size +
                ", speed=" + speed +
                '}';
    }
}

class HDD
{
    private int size;
    private int type;


}

public class Laptop {
    String logo;
    Processor p1;


}
