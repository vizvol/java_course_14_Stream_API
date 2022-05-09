public class User {
    String name;
    int age;
    int year;

    public User(String name, int age, int year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", year=" + year +
                '}';
    }
}
