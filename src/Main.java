import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> personList = new ArrayList<>(Arrays.asList(
                new User("Joe Louis", 15, 2008),
                new User("Evander Holyfield", 12, 2010),
                new User("Vladimir Klichko", 32, 1990),
                new User("Tyson Fury", 11, 2011),
                new User("Oleksandr Usyk", 30, 1992),
                new User("Mike Tyson", 27, 1995),
                new User(" Muhammad Ali", 29, 1993)
        ) );

        for (User user : personList) {
            System.out.println(user);
        }
        System.out.println("Вывод отсортированной коллекции по возрастанию: ");

        System.out.println("Вывод отсортированной коллекции по убыванию: ");

        System.out.println("Фильтрация коллекции по полю AGE: ");

        System.out.println("Сортировка коллекции по полю YEAR и группировка по этому полю . ");

        System.out.println("Минимальный объект коллекции: ");

        System.out.println("Максимальный объект коллекции: ");

        System.out.println("Использование AllMath :");

        System.out.println("Использование AnyMath :");

        System.out.println("Использование NoneMath :");

    }
}
