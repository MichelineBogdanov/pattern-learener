package org.pattern_learener.behavioral.chain_of_responsibility;

public class EmailChecker extends Checker {

    public EmailChecker() {
    }

    @Override
    public boolean check(Request request) {
        if (!server.checkEmailExists(request.email())){
            System.out.println("Email not exists");
            return false;
        }
        return checkerNext(request);
    }
}
