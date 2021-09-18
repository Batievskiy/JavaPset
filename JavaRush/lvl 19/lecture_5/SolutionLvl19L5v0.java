// class Account has name field and email field.
// we have to create getEmails(ArrayList<Account>) method
// - to return Stream of emails from the list passed as argument.

// HINT: use method map() of Stream<Account> object.

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class SolutionLvl19L5v0 {
    public static void main(String[] args) {
        ArrayList<Account> accountArrayList = new ArrayList<>();
        Collections.addAll(accountArrayList,
                new Account("Elly", "elly@gmail.com"),
                new Account("Joker", "joker@gmail.com"),
                new Account("Neo", "neo@gmail.com")
        );
        Stream<String> streamEmails = getEmails(accountArrayList);
        streamEmails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        return accounts.stream()
                .map(Account::getEmail);
    }
}

class Account {
    private String name;
    private String email;

    public Account(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}