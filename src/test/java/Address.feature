Feature: Address Equality

  The Address class describes a basic address:
  Street, City, State
  It does simple text cleanup around spaces, case, and punctuation
  in order to evaluate equality

  # The base case, happy path
  Scenario: Identical Address objects should evaluate equal
    Given two identical Address object
    Then they should evaluate as equal

  Scenario: Addresses with spaces and extra punctuation should evaluate equal
    Given two Addresses with extra spaces and punctuation
    Then they should evaluate as equal

  Scenario: Identical Address with different case should evaluate equal
    Given two identical Addresses with different case
    Then they should evaluate as equal

  Scenario: Identical Address but different city should evaluate not equal
    Given two identical Addresses with different city
    Then they should evaluate as not equal