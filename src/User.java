import java.util.Objects;

public class User {
    private String name;
    private Integer age;
    private Integer year;

    public User(String name, Integer age, Integer year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(age, user.age) && Objects.equals(year, user.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, year);
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
