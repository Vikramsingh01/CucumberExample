$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/login.feature");
formatter.feature({
  "name": "Testing Filter feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "Launch neo tr url and enter username and password",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open Browser and launch URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.open_Browser_and_launch_URL()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat net.serenitybdd.core.pages.PageObject.openPageAtUrl(PageObject.java:860)\r\n\tat net.serenitybdd.core.pages.PageObject.open(PageObject.java:761)\r\n\tat net.serenitybdd.core.pages.PageObject.open(PageObject.java:749)\r\n\tat com.megannexus.pages.LoginPage.navigateTo_LoginPage(LoginPage.java:32)\r\n\tat com.meganexus.StepDefs.LoginStepDefs.open_Browser_and_launch_URL(LoginStepDefs.java:33)\r\n\tat ✽.Open Browser and launch URL(src/main/resources/features/login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Team service user filter testing after Successful Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Navigate to crc service users",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_Navigate_to_crc_service_users()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on filter",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.click_on_filter()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter first name and last name",
  "rows": [
    {
      "cells": [
        "First name",
        "Family name"
      ]
    },
    {
      "cells": [
        "vikram",
        "testthreeB"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.enter_first_name_and_last_name(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});