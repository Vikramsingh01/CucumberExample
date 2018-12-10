$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Testing Filter feature",
  "description": "I want to use this template for my feature file",
  "id": "testing-filter-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "Launch neo tr url and enter username and password",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Open Browser and launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.open_Browser_and_launch_URL()"
});
formatter.result({
  "duration": 192553605630,
  "error_message": "java.lang.IllegalArgumentException: Can not set net.serenitybdd.core.pages.WebElementFacade field com.megannexus.pages.LoginPage.login_Lnk to com.sun.proxy.$Proxy20\r\n\tat sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:167)\r\n\tat sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:171)\r\n\tat sun.reflect.UnsafeObjectFieldAccessorImpl.set(UnsafeObjectFieldAccessorImpl.java:81)\r\n\tat java.lang.reflect.Field.set(Field.java:764)\r\n\tat org.openqa.selenium.support.PageFactory.proxyFields(PageFactory.java:117)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:105)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:92)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:79)\r\n\tat com.megannexus.pages.LoginPage.\u003cinit\u003e(LoginPage.java:27)\r\n\tat com.meganexus.utils.PageObjectManager.getLoginPage(PageObjectManager.java:21)\r\n\tat com.meganexus.StepDefs.LoginStepDefs.open_Browser_and_launch_URL(LoginStepDefs.java:25)\r\n\tat ✽.Given Open Browser and launch URL(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefs.user_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Team service user filter testing after Successful Login",
  "description": "",
  "id": "testing-filter-feature;team-service-user-filter-testing-after-successful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User Navigate to crc service users",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on filter",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter first name and last name",
  "rows": [
    {
      "cells": [
        "First name",
        "Family name"
      ],
      "line": 16
    },
    {
      "cells": [
        "vikram",
        "testthreeB"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.user_Navigate_to_crc_service_users()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.click_on_filter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.enter_first_name_and_last_name(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 5,
  "name": "Launch neo tr url and enter username and password",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Open Browser and launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.open_Browser_and_launch_URL()"
});
