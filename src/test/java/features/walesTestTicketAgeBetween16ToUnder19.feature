@AgeBetween16ToUnder19
Feature: To get help with NHS Treatment in Wales

  Scenario: To verify person between age 16 to under 19 get help with NHS Treatment

    Given user is on NHS Cost Checker tool
    When user click on start button
    And user select Wales country
    And user click on next button
    And user answer their GP practice is in Scotland or Wales
    And user click on next button
    And user select Wales as their dental practice in
    And user click on next button
    And user enter date of birth "09-03-2004"
    And user click on next button
    And user select Yes in full time education
    And user click on next button
    Then user should be able to see message from NHS for help with treatment