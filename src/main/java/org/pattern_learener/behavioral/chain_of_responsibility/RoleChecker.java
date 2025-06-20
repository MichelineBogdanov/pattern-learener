package org.pattern_learener.behavioral.chain_of_responsibility;

public class RoleChecker extends Checker {

    @Override
    public boolean check(Request request) {
        boolean result = server.checkRole(request.email());
        if (result) {
            System.out.println("You are admin");
        } else {
            System.out.println("You are user");
        }
        return checkerNext(request);
    }

}
