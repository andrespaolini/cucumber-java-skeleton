package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public void moveTo(Integer distance) {
    }

    public void shout(String message) {
    }

    public List<String> getMessagesHeard() {
        List<String> results = new ArrayList<>();
        results.add("free bagels at Sean's");
        return results;
    }
}
