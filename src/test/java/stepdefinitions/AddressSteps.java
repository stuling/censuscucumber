package stepdefinitions;

import censuscucumber.Address;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;

public class AddressSteps {

    Address address1;
    Address address2;
    @Given("two identical Address object")
    public void two_identical_address_object() {
        address1 = new Address("123 main st.","seattle","wa");
        address2 = new Address("123 main st.","seattle","wa");
    }
    @Then("they should evaluate as equal")
    public void they_should_evaluate_as_equal() {
        assertTrue(address1.equals(address2));
    }

    @Given("two identical Addresses but extra end spaces")
    public void two_identical_addresses_but_extra_end_spaces() {
        //an Address with extra spaces
        address1 = new Address("234 2nd Ave.  ","Tacoma","WA");
        //an Address with comma
        address2 = new Address("234 2nd Ave.","Tacoma","WA");
    }

    @Given("two identical Addresses but extra front spaces")
    public void two_identical_addresses_but_extra_front_spaces() {
        //an Address with extra spaces
        address1 = new Address("        234 2nd Ave.","Tacoma","WA");
        //an Address with comma
        address2 = new Address("234 2nd Ave.","Tacoma","WA");
    }

    @Given("two identical Addresses but extra middle spaces")
    public void two_identical_addresses_but_extra_middle_spaces() {
        //an Address with extra spaces
        address1 = new Address("234  2nd Ave.","Tacoma","WA");
        //an Address with comma
        address2 = new Address("234 2nd Ave.","Tacoma","WA");
    }

    @Given("two identical Addresses but different punctuation")
    public void two_identical_addresses_but_different_punctuation() {
        //an Address with extra spaces
        address1 = new Address("234 2nd Ave,","Tacoma","WA");
        //an Address with comma
        address2 = new Address("234 2nd Ave.","Tacoma","WA");
    }

    @Given("two identical Addresses with different case")
    public void twoIdenticalAddressesWithDifferentCase() {
        address1 = new Address("123 main st.","seattle","wa");
        //an Address with camel case
        address2 = new Address("123 Main St.","Seattle","Wa");
    }

    @Then("they should evaluate as not equal")
    public void theyShouldEvaluateAsNotEqual() {
        assertNotEquals(address1,address2);
    }

    @Given("two identical Addresses with different city")
    public void twoIdenticalAddressesWithDifferentCity() {
        address1 = new Address("123 Foo Blvd.","Seattle","wa");
        //Foo Address with different city
        address2 = new Address("123 Foo Blvd.","Tacoma","wa");
    }

    @Given("two identical Addresses with different state")
    public void twoIdenticalAddressesWithDifferentState() {
        address1 = new Address("6235 Center Ave.","Springfield","IL");
        //Foo Address with different city
        address2 = new Address("6235 Center Ave.","Springfield","OR");
    }
}