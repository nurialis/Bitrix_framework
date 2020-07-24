Feature: Event
  User story: As a user, I should be able to create events by clicking on Event tab under Activity Stream.

  Scenario: Logging in as help desk
    Given User is on the login page
    Then User enters "helpdesk44@cybertekschool.com" for email
    Then User enters "UserUser" for password
    Then User clicks login


  Scenario: Going to Event Page
    Given User is on the Dashboard
    Then User clicks Event and sees Event page

  Scenario: User uploads files
    Given User clicks Upload Files
    Then User clicks upload files and images
    Then User clicks download from external drive
    Then User clicks select document from Bitrix24
    Then User clicks create using Google Docs

  Scenario: User attaches link
    Given User clicks Link
    Then User types the text of the link
    Then User puts the link
    Then User clicks Save for the link

  Scenario: User inserts video
    Given User clicks Insert Video
    Then User puts the URL of the video
    Then User clicks Save for the video

  Scenario: User opens Visual Editor
    Given User clicks Visual Editor
    Then User chooses bold
    Then User chooses italic

  Scenario: User creates a quote
    Given User clicks Quote Text
    Then User types in the yellow area


  Scenario: User chooses event start and end time
    Given User changes event start and end time
    Then User changes start date to July 24th
    Then User changes end date to July 27th
    Then User chooses America Costa_Rica time zone for start

  Scenario: User sets a reminder
    Given User clicks the dropdown for the reminder
    Then User changes minutes to hours

  Scenario: User selects the event location
    Given User clicks the dropdown for the location
    Then User chooses West Meeting Room

  Scenario: User adds the attendees
    Given User clicks Add
    Then User chooses Employees and departments
    Then User chooses an employee

  Scenario: User sees the More option
    Given User clicks More
    Then User changes Availability to Free
    Then User changes Repeat to Monthly
    Then User changes Importance to High

  Scenario: User is done with the event
    Given User completes all the information
    Then User clicks Send