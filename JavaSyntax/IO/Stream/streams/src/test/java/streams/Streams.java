package streams;

import streams.Department;
import streams.Employee;
import streams.Event;
import streams.Position;
import org.junit.Test;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;

public class Streams {
    private List<Employee> emps = List.of(
            new Employee("Michael", "Smith", 243, 43, Position.CHEF),
            new Employee("Jane", "Smith", 523, 40, Position.MANAGER),
            new Employee("Jury", "Gagarin", 6423, 26, Position.MANAGER),
            new Employee("Jack", "London", 5543, 53, Position.WORKER),
            new Employee("Eric", "Jackson", 2534, 22, Position.WORKER),
            new Employee("Andrew", "Bosh", 3456, 44, Position.WORKER),
            new Employee("Joe", "Smith", 723, 30, Position.MANAGER),
            new Employee("Jack", "Gagarin", 7423, 35, Position.MANAGER),
            new Employee("Jane", "London", 7543, 42, Position.WORKER),
            new Employee("Mike", "Jackson", 7534, 31, Position.WORKER),
            new Employee("Jack", "Bosh", 7456, 54, Position.WORKER),
            new Employee("Mark", "Smith", 123, 41, Position.MANAGER),
            new Employee("Jane", "Gagarin", 1423, 28, Position.MANAGER),
            new Employee("Sam", "London", 1543, 52, Position.WORKER),
            new Employee("Jack", "Jackson", 1534, 27, Position.WORKER),
            new Employee("Eric", "Bosh", 1456, 32, Position.WORKER)
    );

    private List<Department> deps = List.of(
            new Department(1, 0, "Head"),
            new Department(2, 1, "West"),
            new Department(3, 1, "East"),
            new Department(4, 2, "Germany"),
            new Department(5, 2, "France"),
            new Department(6, 3, "China"),
            new Department(7, 3, "Japan")
    );

    @Test
    public void creation() throws IOException {
        Stream<String> lines = Files.lines(Paths.get("source.txt"));
//        lines.forEach(System.out::println);
        Stream<Path> list = Files.list(Paths.get("./"));
//        list.forEach(System.out::println);
        Stream<Path> walk = Files.walk(Paths.get("./"), 3);
//        walk.forEach(System.out::println);
//
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        DoubleStream doubleStream = DoubleStream.of(1.2, 3.14);

        IntStream range = IntStream.range(10, 100);// 10 .. 99
        IntStream intStream1 = IntStream.rangeClosed(20, 40); // 20 .. 40
//
        int[] ints = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(ints);

        Stream<String> hello = Stream.of("hello", "java", "world");
        Stream<? extends Serializable> first = Stream.of("first", 1, "second", 2);

        Stream<String> build = Stream.<String>builder()
                .add("Mike")
                .add("James")
                .add("Sally")
                .build();

        Stream<Employee> stream2 = emps.stream();
        Stream<Employee> employeeStream = emps.parallelStream();

        Stream.generate(() ->
                new Event(UUID.randomUUID(), LocalDateTime.now(), "description"));

        Stream<Integer> iterate = Stream.iterate(1950, val -> val + 3);

        Stream<Object> concat = Stream.concat(lines, stream2);
    }

    @Test
    public void terminate() {
        Stream<Employee> stream = emps.stream();
        stream.count();

        emps.stream().forEach(employee -> System.out.println(employee.getAge()));
        emps.forEach(employee -> System.out.println(employee.getPosition()));

        emps.stream().forEachOrdered(employee -> System.out.println(employee.getFirstName()));

        List<Employee> collect = emps.stream().collect(Collectors.toList());

        Object[] objects = emps.stream().toArray();

        Map<Integer, String> IdLastname = emps.stream().collect(Collectors.toMap(Employee::getId, Employee::getLastName));

        Map<Integer, String> IdFullname = emps.stream().collect(Collectors.toMap(
                Employee::getId,
                employee -> String.format("%s %s", employee.getLastName(), employee.getFirstName())
        ));

        IntStream intStream = IntStream.of(100, 200, 300);
        intStream.reduce(((left, right) -> left + right)).orElse(0);

        System.out.println(deps.stream().reduce(this::reducer));

        OptionalDouble average = IntStream.of(100, 200, 300, 400).average();
        OptionalInt max = IntStream.of(100, 200, 300, 400).max();
        OptionalInt min = IntStream.of(100, 200, 300, 400).min();
        int sum = IntStream.of(100, 200, 300, 400).sum();
        IntSummaryStatistics intSummaryStatistics = IntStream.of(100, 200, 300, 400).summaryStatistics();

        Optional<Employee> max1 = emps.stream().max(Comparator.comparingInt(Employee::getAge));

        Optional<Employee> any = emps.stream().findAny();
        Optional<Employee> first = emps.stream().findFirst();

        boolean greaterThanSixty = emps.stream().noneMatch(employee -> employee.getAge() > 60); // true

        boolean isChef = emps.stream().anyMatch(employee -> employee.getPosition() == Position.CHEF); // true

        boolean moreThanEighteen = emps.stream().allMatch(employee -> employee.getAge() > 18); // true
    }

    @Test
    public void transform() {

        LongStream longStream = IntStream.of(100, 200, 300, 400).mapToLong(Long::valueOf);
        Stream<Event> description = IntStream.of(100, 200, 300, 400).mapToObj(value ->
                new Event(UUID.randomUUID(), LocalDateTime.of(value, 12, 1, 12, 0), "description")
        );

        IntStream distinct = IntStream.of(100, 200, 300, 400, 100, 200).distinct();// 100, 200, 300, 400

        Stream<Employee> nonManagerStream = emps.stream()
                .filter(employee -> employee.getPosition() != Position.MANAGER);

        Stream<Employee> limitFive = emps.stream()
                .skip(2)
                .limit(5);

        Stream<String> stringStream = emps.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .peek(employee -> employee.setAge(18))
                .map(employee -> String.format("%s %s", employee.getLastName(), employee.getFirstName()));

        emps.stream()
                .takeWhile(employee -> employee.getAge() > 30)
                .forEach(System.out::println);
        System.out.println();

        emps.stream()
                .dropWhile(employee -> employee.getAge() > 30)
                .forEach(System.out::println);
        System.out.println();

        IntStream.of(100, 200, 300, 400)
                .flatMap(value -> IntStream.of(value - 50, value))
                .forEach(System.out::println);
    }

    @Test
    public void real() {
        Stream<Employee> sorted = emps.stream()
                .filter(employee -> employee.getAge() <= 30 && employee.getPosition() != Position.WORKER
                )
                .sorted(Comparator.comparing(Employee::getLastName));
        print(sorted);

        Stream<Employee> limitedToFourSorted = emps.stream()
                .filter(employee -> employee.getAge() >= 40)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(4);

        IntSummaryStatistics intSummaryStatistics = emps.stream()
                .mapToInt(Employee::getAge)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
    }

    private void print(Stream<Employee> stream) {
        stream
                .map(emp -> String.format(
                        "%4d | %-15s %-10s age %s %s",
                        emp.getId(),
                        emp.getLastName(),
                        emp.getFirstName(),
                        emp.getAge(),
                        emp.getPosition()
                ))
                .forEach(System.out::println);

        System.out.println();
    }

    public Department reducer(Department parent, Department child) {
        if (child.getParent() == parent.getId()) {
            parent.getChild().add(child);
        } else {
            parent.getChild().forEach(subParent -> reducer(subParent, child));
        }
        return parent;
    }
}
