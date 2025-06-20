package org.pattern_learener.behavioral.chain_of_responsibility;

import java.util.Map;

public class Server {

    private final Map<String, String> db = Map.of("admin@mail.ru", "admin", "user@mail.ru", "user");
    private Checker checker;

    public Server() {
    }

    public boolean answerRequest(Request request) {
        boolean check = checker.check(request);
        if (check) {
            System.out.println("Your request is correct");
        } else {
            System.out.println("Access denied");
        }
        return !check;
    }

    public void linkCheckers(Checker... checkers) {
        for (Checker check : checkers) {
            check.setServer(this);
        }
        this.checker = checkers[0];
    }

    public boolean checkEmailExists(String email) {
        return db.containsKey(email);
    }

    public boolean checkPassword(String email, String password) {
        return db.get(email).equals(password);
    }

    public boolean checkRole(String email) {
        return email.contains("admin");
    }

}
