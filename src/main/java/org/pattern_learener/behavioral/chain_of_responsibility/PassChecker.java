package org.pattern_learener.behavioral.chain_of_responsibility;

public class PassChecker extends Checker {

    public PassChecker() {
    }

    @Override
    public boolean check(Request request) {
        if (!server.checkPassword(request.email(), request.password())) {
            System.out.println("Password check failed");
            return false;
        }
        return checkerNext(request);
    }
}
