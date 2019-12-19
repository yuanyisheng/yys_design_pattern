package com.yys.pattern.prototype.shallow;

public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone() {
        return this.prototype.clone();
    }

}
