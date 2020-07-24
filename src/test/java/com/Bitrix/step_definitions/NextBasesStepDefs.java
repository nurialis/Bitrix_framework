package com.Bitrix.step_definitions;

import com.Bitrix.pages.EventPage;
import com.Bitrix.pages.LoginPage;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NextBasesStepDefs {

    LoginPage loginPage = new LoginPage();
    EventPage eventPage = new EventPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://login.nextbasecrm.com/");
        Assert.assertTrue(loginPage.authorizationTitle.isDisplayed());
    }

    @Then("User enters {string} for email")
    public void userEntersForEmail(String arg0) {
        loginPage.usernameInput.sendKeys(arg0);
    }

    @Then("User enters {string} for password")
    public void userEntersForPassword(String arg0) {
        loginPage.passwordInput.sendKeys(arg0);
    }

    @Then("User clicks login")
    public void userClicksLogin() {
        loginPage.loginButton.click();
    }

    @Given("User is on the Dashboard")
    public void user_is_on_the_dashboard() {
        Assert.assertTrue(eventPage.activityStreamTitle.isDisplayed());
    }

    @Then("User clicks Event and sees Event page")
    public void user_clicks_event_and_sees_event_page() {
        eventPage.event.click();
    }

    @Given("User clicks Upload Files")
    public void user_clicks_upload_files() throws InterruptedException {
        Thread.sleep(2000);
        eventPage.uploadFiles.click();
    }

    @Then("User clicks upload files and images")
    public void user_clicks_upload_files_and_images() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15, 100);
        WebElement uploadFileElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[3]")));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].style.left='0'", uploadFileElement);
        uploadFileElement.sendKeys("C:/Users/mfaik/Desktop/peel.jpg");
        Thread.sleep(2000);
    }

    @Then("User clicks download from external drive")
    public void user_clicks_download_from_external_drive() throws InterruptedException {
        System.out.println("Bug");
    }

    @Then("User clicks select document from Bitrix24")
    public void user_clicks_select_document_from_bitrix24() throws InterruptedException {
        eventPage.bitrix24.click();
        Thread.sleep(1000);
        eventPage.salesAndMarketing.click();
        Thread.sleep(1000);
        eventPage.quotes.click();
        Thread.sleep(1000);
        eventPage.quotesFile.click();
        Thread.sleep(1000);
        eventPage.selectDocument.click();
    }

    @Then("User clicks create using Google Docs")
    public void userClicksCreateUsingGoogleDocs() {
        System.out.println("Bug");
    }

    @Given("User clicks Link")
    public void user_clicks_link() throws InterruptedException {
        eventPage.attachLink.click();
        Thread.sleep(2000);
    }

    @Then("User types the text of the link")
    public void user_types_the_text_of_the_link() throws InterruptedException {
        eventPage.linkText.sendKeys("Git");
        Thread.sleep(2000);
    }

    @Then("User puts the link")
    public void user_puts_the_link() throws InterruptedException {
        eventPage.link.sendKeys("https://git-scm.com/");
        Thread.sleep(2000);
    }

    @Then("User clicks Save for the link")
    public void user_clicks_save_for_the_link() throws InterruptedException {
        eventPage.saveLink.click();
        Thread.sleep(1500);
    }

    @Given("User clicks Insert Video")
    public void user_clicks_insert_video() throws InterruptedException {
        eventPage.insertVideo.click();
        Thread.sleep(1000);
    }

    @Then("User puts the URL of the video")
    public void user_puts_the_url_of_the_video() throws InterruptedException {
        eventPage.videoSource.sendKeys("https://www.youtube.com/watch?v=Ft-aZWjeJ6U");
        Thread.sleep(3000);
    }

    @Then("User clicks Save for the video")
    public void user_clicks_save_for_the_video() throws InterruptedException {
        eventPage.saveVideo.click();
        Thread.sleep(1500);
    }

    @Given("User clicks Visual Editor")
    public void user_clicks_visual_editor() {
        eventPage.visualEditor.click();
    }

    @Then("User chooses bold")
    public void user_chooses_bold() throws InterruptedException {
        eventPage.bold.click();
        Thread.sleep(1500);

    }

    @Then("User chooses italic")
    public void user_chooses_italic() throws InterruptedException {
        eventPage.italic.click();
        Thread.sleep(1500);
    }

    @Given("User clicks Quote Text")
    public void user_clicks_quote_text() {
        eventPage.quoteText.click();
    }

    @Then("User types in the yellow area")
    public void user_types_in_the_yellow_area() {
        Driver.getDriver().switchTo().frame(eventPage.iframe);
        eventPage.yellowArea.sendKeys("“Whatever you do in this life, it’s not legendary unless your friends are there to see it.” — Barney Stinson");
        Driver.getDriver().switchTo().parentFrame();
    }


    @Given("User changes event start and end time")
    public void user_changes_event_start_and_end_time() {
        System.out.println();
    }

    @Then("User changes start date to July 24th")
    public void user_changes_start_date_to_july_24th() throws InterruptedException {
        eventPage.dateFrom.click();
        eventPage.twentyForth.click();
        Thread.sleep(1500);
    }

    @Then("User changes end date to July 27th")
    public void user_changes_end_date_to_july_27th() {
        eventPage.dateTo.click();
        eventPage.twentySeventh.click();
    }

    @Then("User chooses America Costa_Rica time zone for start")
    public void user_chooses_america_costa_rica_time_zone_for_start() throws InterruptedException {
        eventPage.timeZone.click();
        Select select = new Select(eventPage.tz_From);
        select.selectByVisibleText("(UTC -06:00) America/Costa_Rica");
        Thread.sleep(1500);
    }

    @Given("User clicks the dropdown for the reminder")
    public void user_clicks_the_dropdown_for_the_reminder() throws InterruptedException {
        Thread.sleep(1500);
    }

    @Then("User changes minutes to hours")
    public void user_changes_minutes_to_hours() throws InterruptedException {
        Select select = new Select(eventPage.remindType);
        select.selectByValue("hour");
        Thread.sleep(1500);
    }

    @Given("User clicks the dropdown for the location")
    public void user_clicks_the_dropdown_for_the_location() throws InterruptedException {
        Thread.sleep(1500);
    }

    @Then("User chooses West Meeting Room")
    public void user_chooses_west_meeting_room() {
        eventPage.eventLocation.sendKeys("West Meeting Room" + Keys.ESCAPE);
    }

    @Given("User clicks Add")
    public void user_clicks_add() throws InterruptedException {
        eventPage.addPeople.click();
        Thread.sleep(1500);
    }

    @Then("User chooses Employees and departments")
    public void user_chooses_employees_and_departments() throws InterruptedException {
        eventPage.employeesAndDepartments.click();
        Thread.sleep(1000);
    }

    @Then("User chooses an employee")
    public void user_chooses_an_employee() throws InterruptedException {
        eventPage.selectingEmployee.click();
        Thread.sleep(1500);
    }

    @Given("User clicks More")
    public void user_clicks_more() throws InterruptedException {
        eventPage.more.click();
        Thread.sleep(1500);
    }

    @Then("User changes Availability to Free")
    public void user_changes_availability_to_free() throws InterruptedException {
        Select select = new Select(eventPage.eventAvailability);
        select.selectByVisibleText("Free");
        Thread.sleep(1500);

    }

    @Then("User changes Repeat to Monthly")
    public void user_changes_repeat_to_monthly() throws InterruptedException {
        Select select = new Select(eventPage.repeat);
        select.selectByIndex(3);
        Thread.sleep(1500);
    }

    @Then("User changes Importance to High")
    public void user_changes_importance_to_high() throws InterruptedException {
        Select select = new Select(eventPage.importance);
        select.selectByVisibleText("High");
        Thread.sleep(1500);
    }

    @Given("User completes all the information")
    public void user_completes_all_the_information() {
        System.out.println();
    }

    @Then("User clicks Send")
    public void user_clicks_send() {
        eventPage.send.click();
    }
}
