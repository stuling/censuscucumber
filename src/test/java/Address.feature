Feature: Address Equality

  The Address class describes a basic address:
  Street, City, State
  It does simple text cleanup around spaces, case, and punctuation
  in order to evaluate equality

  # The base case, happy path
  Scenario: Identical Address objects should evaluate equal
    Given two identical Address object
    Then they should evaluate as equal

  # Check for stripping end spaces
  Scenario: Identical Addresses with extra end spaces should evaluate equal
    Given two identical Addresses but extra end spaces
    Then they should evaluate as equal

  # Check for stripping front spaces
  Scenario: Identical Addresses with extra front spaces should evaluate equal
    Given two identical Addresses but extra front spaces
    Then they should evaluate as equal

  # Check for stripping middle spaces - a bug in cleanupStreet(), issue #1
  Scenario: Identical Addresses with extra middle spaces should evaluate equal
    Given two identical Addresses but extra middle spaces
    Then they should evaluate as equal

  # Check for different punctuation
  Scenario: Identical Addresses but different punctuation should evaluate equal
    Given two identical Addresses but different punctuation
    Then they should evaluate as equal

  # Check for normalizing case
  Scenario: Identical Address with different case should evaluate equal
    Given two identical Addresses with different case
    Then they should evaluate as equal

  # Check for evaluating City equality
  Scenario: Identical Address but different city should evaluate not equal
    Given two identical Addresses with different city
    Then they should evaluate as not equal

  # Check for evaluating State equality
  Scenario: Identical Address but different state should evaluate not equal
    Given two identical Addresses with different state
    Then they should evaluate as not equal