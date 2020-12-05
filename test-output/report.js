$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/SOFTWARE TESTING/Selenium/FreeCrmBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Free CRM Login Test Scenario"
    },
    {
      "line": 4,
      "value": "# Given user is already on Login Page"
    },
    {
      "line": 5,
      "value": "# When title of login page is Free CRM"
    },
    {
      "line": 6,
      "value": "# Then user enters \" prashanthirave86@gmail.com\" and \"P9096960753\""
    },
    {
      "line": 7,
      "value": "# Then user click on Login"
    },
    {
      "line": 8,
      "value": "# Then user is on home page"
    },
    {
      "line": 12,
      "value": "#with Examples Keyword"
    }
  ],
  "line": 13,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 25,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "prashanthirave86@gmail.com",
        "P9096960753"
      ],
      "line": 26,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "vickyhirave86@gmail..com",
        "V1234567890"
      ],
      "line": 27,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters \"prashanthirave86@gmail.com\" and \"P9096960753\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 18647341399,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 18318200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prashanthirave86@gmail.com",
      "offset": 13
    },
    {
      "val": "P9096960753",
      "offset": 46
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 845648100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_Login()"
});
formatter.result({
  "duration": 282314200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 23836300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1247394699,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters \"vickyhirave86@gmail..com\" and \"V1234567890\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 21682507700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 41169100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vickyhirave86@gmail..com",
      "offset": 13
    },
    {
      "val": "V1234567890",
      "offset": 44
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 1201606701,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_Login()"
});
formatter.result({
  "duration": 179564100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 9640599,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 895163499,
  "status": "passed"
});
});