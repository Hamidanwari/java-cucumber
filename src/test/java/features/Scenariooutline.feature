Feature: Cricket Match Score

  @ScenarioOutline
  Scenario Outline: The Batsman Is Bating
    Given I am a batsman
    And The batsman score<NameOfBatsman>
    And the balls  <Score> 
    Then The averge of batsman <Balls>

    Examples: 
      | NameOfBatsman | Score | Balls |
      | Hamed anwari  |   30  |    29 |            
      | Hameed anwari |   56  |   25  |
      | Tamim Habibi  |   16  |   7   |
 