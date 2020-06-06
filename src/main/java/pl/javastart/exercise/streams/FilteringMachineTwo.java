package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        return ppl.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<String> nicknames = List.of("Tomek_2", "Ania_18", "Konrad_44", "Janusz_52", "Sebastian_16");
        return IntStream.range(0, nicknames.size())
                .mapToObj(i -> new User(people.get(i).getName(), people.get(i).getAge(), nicknames.get(i)))
                .collect(Collectors.toList());
    }
}

