package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final List<String> messagesHeard = new ArrayList<>();
    private final Network network;

    public Integer getLocation() {
        return location;
    }

    private Integer location;

    public Person(Network network) {
        this.network = network;
        network.subscribe(this);
    }
    public Person(Network network, Integer location) {
        this.network = network;
        network.subscribe(this);
        this.location = location;
    }

    public void shout(String message) {
        network.broadcast(message);
    }

    public void hear(String message){
        messagesHeard.add(message);
    }

    public List<String> getMessagesHeard() {
        return messagesHeard;
    }
}
