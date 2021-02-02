$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automate TestLeaf Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.step({
  "name": "enter username as \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "enter password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "click login button",
  "keyword": "When "
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "click the logout button",
  "keyword": "And "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa"
      ]
    },
    {
      "cells": [
        "DemoCSR",
        "crmsfa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestSteps.launchChromeBrowserAndLoadUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestSteps.enterUsernameAsDemosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestSteps.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTestSteps.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestSteps.itsNavigatedHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the logout button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestSteps.clickTheLogoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestSteps.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestSteps.launchChromeBrowserAndLoadUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestSteps.enterUsernameAsDemosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestSteps.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTestSteps.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestSteps.itsNavigatedHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the logout button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestSteps.clickTheLogoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestSteps.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});