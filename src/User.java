public class User {
    private int id;
    private String name;
    private int age;
    private double weight;

    public User(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public User(int id, String name, int age, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + weight;
    }
}


