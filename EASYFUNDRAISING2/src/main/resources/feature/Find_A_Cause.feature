Feature: Find a cause

  Scenario: Three character search on Find a cause feature
    Given user is able to navigate to  https://www.easyfundraising.org.uk/
    And user clicks on Find a cause
    When user enters three characters letter in the search box,and selects third cause from list
    And clicks search
    Then confirm with a message if the cause exists
