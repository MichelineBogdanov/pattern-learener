package org.pattern_learener.behavioral.chain_of_responsibility;

public abstract class Checker {

    protected Server server;
    protected Checker next;

    public Checker() {
    }

    public void setNext(Checker next) {
        this.next = next;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    protected boolean checkerNext(Request request) {
        if (next == null) {
            return true;
        }
        return next.check(request);
    }

    public abstract boolean check(Request request);

}
