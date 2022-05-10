import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>(Arrays.asList(
                new User("Joe Louis", 15, 2008),
                new User("Evander Holyfield", 12, 2010),
                new User("Vladimir Klichko", 32, 1990),
                new User("Tyson Fury", 11, 2011),
                new User("Oleksandr Usyk", 30, 1992),
                new User("Mike Tyson", 27, 1995),
                new User("Muhammad Ali", 27, 1995)
        ) );
        /*System.out.println("\nКоллекция:");
        for (User user : userList) {
            System.out.println(user);
        }*/
        //Stream<User> stream = personList.stream();
        System.out.println("Коллекция:");
        userList.stream().forEach(System.out::println );

        System.out.println("\nВывод отсортированной коллекции по возрастанию (по полю YEAR и NAME ): ");
        userList.stream().sorted(Comparator.comparing(User::getYear).thenComparing(User::getName)).forEach(System.out::println);

        System.out.println("\nВывод отсортированной коллекции по убыванию: (по полю YEAR) ");
        userList.stream().sorted(Comparator.comparing(User::getYear).reversed() ).forEach(System.out::println);

        System.out.println("\nВывод всех несовершеннолетних пользователей, рожденных с 2010г. (фильтрация коллекции) : ");
        userList.stream().filter(x -> x.getAge() < 18).filter(x -> x.getYear() >= 2010).forEach(System.out::println);

        System.out.println("\nСортировка коллекции по полю YEAR и группировка по этому полю . ");
        Map<String, List<User>> hashMap =
                userList.stream().sorted(Comparator.comparing(User::getYear)).collect(Collectors.groupingBy(x -> x.getYear() < 2000 ? "до 2000" : "c 2000") ) ;
        hashMap.forEach((k, v) -> {
                    System.out.println("год рождения: " + k);
                    for (User user : v) {
                        System.out.println(user);
                    }
                } );

        System.out.println("\nМинимальный объект коллекции по AGE: ");
        userList.stream().min(Comparator.comparing(User::getAge)).ifPresent(System.out::println);

        System.out.println("\nМаксимальный объект коллекции по AGE:  ");
        userList.stream().max(Comparator.comparing(User::getAge)).ifPresent(System.out::println);

        System.out.println("\nИспользование AllMath : ");
        System.out.println("Все пользователи старше 10 лет : " + userList.stream().allMatch(x -> x.getAge() > 10));

        System.out.println("\nИспользование AnyMath :");
        System.out.println("Есть ли кто-то старше 30 лет : " + userList.stream().anyMatch(x -> x.getAge() > 30));

        System.out.println("\nИспользование NoneMath : ");
        System.out.println("Никто не родился раньше 1990 года: " + userList.stream().noneMatch(x -> x.getYear () < 1990));

    }
}
