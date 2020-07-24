package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {

    public EventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[.='Event']") // ?
    public WebElement event;

    @FindBy(id = "pagetitle")
    public WebElement activityStreamTitle;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm_calendar']")
    public WebElement uploadFiles;

    @FindBy(xpath = "(//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main'])")
    public WebElement localDisk;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud'])[3]")
    public WebElement externalDrive;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-link popup-window-button-link-cancel']") //?
    public WebElement cancel;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link'])[3]")
    public WebElement bitrix24;

    @FindBy(xpath = "//span[contains(text(),'Sales and marketing')]")
    public WebElement salesAndMarketing;

    @FindBy(linkText = "Quotes")
    public WebElement quotes;

    @FindBy(xpath = "//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file']")
    public WebElement quotesFile;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement selectDocument;

    @FindBy(xpath = "(//span[contains(text(),'Create using')])[3]")
    public WebElement createUsing;

    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm_calendar']//i")
    public WebElement attachLink;

    @FindBy(xpath = "//input[@placeholder='Link text']")
    public WebElement linkText;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement link;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement saveLink;

    @FindBy(xpath = "//span[@id='bx-b-video-blogPostForm_calendar']//i")
    public WebElement insertVideo;

    @FindBy(xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement videoSource;

    @FindBy(xpath = "(//input[@class='adm-btn-save'])[2]")
    public WebElement saveVideo;

    @FindBy(xpath = "//span[@id='bx-b-quote-blogPostForm_calendar']//i")
    public WebElement quoteText;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[2]")
    public WebElement iframe;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement yellowArea;

    @FindBy(xpath = "(//span[@title='Visual editor'])[2]")
    public WebElement visualEditor;

    @FindBy(xpath = "(//span[@title='Bold'])[2]//i")
    public WebElement bold;

    @FindBy(xpath = "(//span[@title='Italic'])[2]//i")
    public WebElement italic;

    @FindBy(name = "DATE_FROM")
    public WebElement dateFrom;

    @FindBy(linkText = "24")
    public WebElement twentyForth;

    @FindBy(name = "TIME_FROM_")
    public WebElement timeFrom;

    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setTime;

    @FindBy(name = "DATE_TO")
    public WebElement dateTo;

    @FindBy(linkText = "27")
    public WebElement twentySeventh;

    @FindBy(xpath = "//span[@class='feed-ev-tz-open']")
    public WebElement timeZone;

    @FindBy(name = "TZ_FROM")
    public WebElement tz_From;

    @FindBy(name = "TZ_TO")
    public WebElement tz_To;

    @FindBy(name = "EVENT_REMIND_TYPE")
    public WebElement remindType;

    @FindBy(name = "EVENT_LOCATION")
    public WebElement eventLocation;

    @FindBy(xpath = "//a[@id='feed-event-dest-add-link']")
    public WebElement addPeople;

    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//div[@id='BXSocNetLogDestination']//a[5]")
    public WebElement selectingEmployee;

    @FindBy(xpath = "//span[contains(@class,'feed-event-more-link-text')][contains(text(),'More')]")
    public WebElement more;

    @FindBy(name = "EVENT_ACCESSIBILITY")
    public WebElement eventAvailability;

    @FindBy(name = "EVENT_RRULE[FREQ]")
    public WebElement repeat;

    @FindBy(name = "EVENT_SECTION")
    public WebElement calendar;

    @FindBy(name = "EVENT_IMPORTANCE")
    public WebElement importance;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement send;
}
