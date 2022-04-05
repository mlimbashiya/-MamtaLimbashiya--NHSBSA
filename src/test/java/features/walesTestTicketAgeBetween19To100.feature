@Age19to100
Feature: To get help with NHS Treatment in Wales

  Scenario: To verify person between age 19 to 100 get help with NHS Treatment
    Given user is on NHS Cost Checker tool
    When user click on start button
    And user select Wales country
    And user click on next button
    And user answer their GP practice is in Scotland or Wales
    And user click on next button
    And user select Wales as their dental practice in
    And user click on next button
    And user enter date of birth "09-03-1961"
    And user click on next button
    And user select yes in Do you live with a partner?
    And user click on next button
    And user select yes in Do you or your partner claim any benefits or tax credits?
    And user click on next button
    And user select yes in Do you or your partner get paid Universal Credit?
    And user click on next button
    And user select yes in As part of your joint Universal Credit, do you have any of these?
    And user click on next button
    And user select yes in Did you and your partner have a combined take-home pay of amount or less in your last Universal Credit period?
    And user click on next button
    Then user should be able to see message from NHS about help for treatment