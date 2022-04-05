@AgeUnder16
  Feature: To get the help with NHS treatment in Wales

    Scenario: To verify person age under 16 get the help with NHS treatment
      Given user is on NHS Cost Checker tool
      When user click on start button
      And user select Wales country
      And user click on next button
      And user answer their GP practice is in Scotland or Wales
      And user click on next button
      And user select Wales as their dental practice in
      And user click on next button
      And user enter date of birth "09-03-2008"
      And user click on next button
      Then user should be able to see message from NHS about help with treatment