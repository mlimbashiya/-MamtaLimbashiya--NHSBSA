package NHSBSA;

import PageObject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    //object for class
    HomePage homePage = new HomePage();
    CountryLiveSelectionPage countryLiveSelectionPage = new CountryLiveSelectionPage();
    GPPracticeSelectionPage gpPracticeSelectionPage = new GPPracticeSelectionPage();
    CountryOfDentalPractice countryOfDentalPractice = new CountryOfDentalPractice();
    DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
    ResultOfAgeUnder16 resultOfAgeUnder16 = new ResultOfAgeUnder16();
    FullTimeEducationPage fullTimeEducationPage = new FullTimeEducationPage();
    ResultOfAge16ToUnder19 resultOfAge16ToUnder19 = new ResultOfAge16ToUnder19();
    LiveWithPartnerPage liveWithPartnerPage = new LiveWithPartnerPage();
    BenefitsPage benefitsPage = new BenefitsPage();
    UniversalCreditPage universalCreditPage = new UniversalCreditPage();
    JointUniversalCreditPage jointUniversalCreditPage = new JointUniversalCreditPage();
    UniversalCreditTakeHomePage universalCreditTakeHomePage = new UniversalCreditTakeHomePage();
    ResultOfAge19To100 resultOfAge19To100 = new ResultOfAge19To100();
    @Given("user is on NHS Cost Checker tool")
    public void user_is_on_nhs_cost_checker_tool() {
     homePage.verifyURL();
    }

    @When("user click on start button")
    public void user_click_on_start_button() {
        homePage.clickOnStartNowButton();
    }

    @When("user select Wales country")
    public void user_select_wales_country() {
        countryLiveSelectionPage.clickOnRadioButton();
    }

    @When("user click on next button")
    public void user_click_on_next_button() {
        countryLiveSelectionPage.clickOnNextButton();
    }

    @When("user answer their GP practice is in Scotland or Wales")
    public void user_answer_their_gp_practice_is_in_scotland_or_wales() {
        gpPracticeSelectionPage.clickOnYesRadioButton();
        //gpPracticeSelectionPage.clickOnNextButton();
    }


    @When("user select Wales as their dental practice in")
    public void user_select_wales_as_their_dental_practice_in() {
        countryOfDentalPractice.clickOnWalesAsDentalPracticeIn();
    }

    @When("click on next button")
    public void click_on_next_button() {
        countryOfDentalPractice.clickOnNextButton();
    }

    @When("user enter date of birth")
    public void user_enter_date_of_birth() {
        //dateOfBirthPage.dateOfBirth();
    }

    @Then("user should be able to see message from NHS about help with treatment")
    public void user_should_be_able_to_see_message_from_nhs_about_help_with_treatment() {
        resultOfAgeUnder16.resultPageWithInformation();
    }
    @When("user select Yes in full time education")
    public void user_select_yes_in_full_time_education() {
        fullTimeEducationPage.fullTimeEducation();
    }

    @Then("user should be able to see message from NHS for help with treatment")
    public void user_should_be_able_to_see_message_from_nhs_for_help_with_treatment() {
        resultOfAge16ToUnder19.resultOfInformation();
    }
    @When("user select yes in Do you live with a partner?")
    public void user_select_yes_in_do_you_live_with_a_partner() {
        liveWithPartnerPage.liveWithAPartner();
    }

    @When("user select yes in Do you or your partner claim any benefits or tax credits?")
    public void user_select_yes_in_do_you_or_your_partner_claim_any_benefits_or_tax_credits() {
        benefitsPage.BenefitsOrTaxCredits();
    }

    @When("user select yes in Do you or your partner get paid Universal Credit?")
    public void user_select_yes_in_do_you_or_your_partner_get_paid_universal_credit() {
        universalCreditPage.universalCreditPaidSelection();
    }

    @When("user select yes in As part of your joint Universal Credit, do you have any of these?")
    public void user_select_yes_in_as_part_of_your_joint_universal_credit_do_you_have_any_of_these() {
        jointUniversalCreditPage.universalCreditClaimSelection();
    }

    @When("user select yes in Did you and your partner have a combined take-home pay of amount or less in your last Universal Credit period?")
    public void user_select_yes_in_did_you_and_your_partner_have_a_combined_take_home_pay_of_amount_or_less_in_your_last_universal_credit_period() {
        universalCreditTakeHomePage.takeHomeUniversalCreditPay();
    }


    @Then("user should be able to see message from NHS about help for treatment")
    public void user_should_be_able_to_see_message_from_nhs_about_help_for_treatment() {
        resultOfAge19To100.resultWithRelevantInformation();
    }

    @And("user enter date of birth {string}")
    public void userEnterDateOfBirth(String dateOfBirth) {
        dateOfBirthPage.dateOfBirth(dateOfBirth);
    }
}
