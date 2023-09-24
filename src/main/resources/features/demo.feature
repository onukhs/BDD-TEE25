Feature: ZOO animals

  Scenario: I am feeding a crocodile
    Given I am in front of crocodile`s cage/terrarium
    And I have a chicken nuggets in my pocket
    When I take a chicken nugget from my pocket
    Then Crocodile is coming to me


  Scenario Outline: Animal says ...
    Given I am in ZOO
    When I go to <animal> cage
    And call it by name
    Then <animal> should say <voice>

    Examples:
      | animal | voice  |
      | owl    | whowho |
      | lion   | roar   |
      | frog   | kwaaaa |


  Scenario Outline: Login to a website as different users
    Given I am on the login page as <user>
    When I enter valid <username> and <password>
    And I click a Login button
    Then I should be logged in
    And <user-dashboard> is opened

    Examples:
      | user      | username  | password      | user-dashboard     |
      | customer  | user12345 | password123   | customer-dashboard |
      | admin     | admin1234 | admpass123    | admin-dashboard    |
      | moderator | moder1234 | moderpass     | moder-dashboard    |
      | support   | sup1234   | supppass12345 | support-dashboard  |


  Scenario: Removing skin from potato
    Given I am in the kitchen
    And I have a knife in my hand
    When I take a potato
    And I remove a skin from it
    Then potato should be clean and smooth


  Scenario: Drink coffee
    Given I have coffee in a mug
    When I pick up the cup of coffee
    And have a sip of the cup of coffee
    Then I should feel  better

  Scenario: Connecting to ZOOm meeting
    Given Zoom Application is opened
    When I click on Connect to a meeting button
    Then I should be connected to a conversation
    And see my colleagues

  Scenario : I am texting a hot chick
    Given I am holding my phone
    And messenger application is opened
    When  I type the text message hot chick
    Then  She should receive my message

  Scenario Outline: I am making coffee
    Given I have a coffee machine
    And machine is turned on
    And I have put a cup in a designated place
    When I press the <button> on the machine
    Then <coffee> will be maken

    Examples:
      | button    | coffee    |
      | espresso  | espresso  |
      | latte     | latte     |
      | capuccino | capuccino |


  Scenario: Performing item search
    Given I am on the Shopping website
    When I type blue t-shirt in the search field
    And I click the search button
    Then the page should display a blue T-shirt

  Scenario: I am going to the store
    Given I am sitting at home
    When I go outside
    And start walking to the store direction
    Then I will arrive to the store


  Scenario: I am drawing a picture
    Given Iam sitting in front of my drawing place
    And I have  paper sheet and pencil on my table
    When i take a pencil and do some drawing moves on a paper sheet
    Then there are coming some drawings on paper sheet
















