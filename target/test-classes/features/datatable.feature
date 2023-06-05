# pipe | data tables 
Feature: Data Tables

  @ListStrings
  Scenario : Bill Amount Generation
    Given I placed an order for the following items
      | Cucumber Sandwich | 2 | 20 |
    When I generate the bill
    Then A billl for $40 should be generated

     #@ListofListofString
  #Scenario: Bill Amount Generation
    #Given I placed an order for the following items
      #| Cucumber Sandwich | 2 | 20 |
      #|Cucumber Salad|1|15|
    #When I generate the bill
    #Then A billl for $40 should be generated
    