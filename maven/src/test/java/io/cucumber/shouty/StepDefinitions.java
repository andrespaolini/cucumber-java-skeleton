package io.cucumber.shouty;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private Person lucy;
    private Person sean;
    private String messageFromSean;
    private Network network;
    private HashMap<String, Person> people;

    @Before
    public void createNetwork(){
        network = new Network();
        people = new HashMap<>();
    }

    @Given("the range is {int}")
    public void the_range_is(Integer int1) {
        System.out.println("Range is " + int1);
    }

   /* @Given("{person} is found/located {int} metre(s) from Sean")
    public void lucy_is_located_metres_from_sean(Person person, Integer distance) {
        network = new Network();
        lucy = new Person("Lucy");
        sean = new Person("Sean");
        lucy.moveTo(distance);
    }*/

    @Given("a person named {word}")
    public void a_person_named(String name) {
        people.put(name, new Person(network));
    }

    /*@Given("a person named sean")
    public void a_person_named_sean() {
       sean = new Person(network);
    }*/

    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        people.get("Sean").shout(message);
        messageFromSean = message;
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        assertEquals(asList(messageFromSean), people.get("Lucy").getMessagesHeard());
    }

    @Given("a person named {word} is at {int}")
    public void a_person_named_lucy_is_at(String name, Integer int1) {
        System.out.println(name + " " + int1);
    }

    @Given("a person named {word} is located at {int}")
    public void a_person_named_sean_is_located_at(String name, Integer int1) {
        System.out.println(name + " " + int1);
    }

    @Given("people are located at")
    public void people_are_located_at(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("Lucy's location at: " + dataTable.cell(2, 1));
    }
    @Then("Larry should not hear Sean's message")
    public void larry_should_not_hear_sean_s_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
