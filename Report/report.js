$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Icic.feature");
formatter.feature({
  "name": "To validate the login Functionality of ICIC BANK LOGIN PAGE Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature5"
    }
  ]
});
formatter.scenario({
  "name": "To  validate login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature5"
    }
  ]
});
formatter.step({
  "name": "launch the browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Icic.launch_the_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "launch the url of the ICIC BANK application",
  "keyword": "When "
});
formatter.match({
  "location": "Icic.launch_the_url_of_the_ICIC_BANK_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login btn",
  "keyword": "And "
});
formatter.match({
  "location": "Icic.to_click_the_login_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click personal",
  "keyword": "And "
});
formatter.match({
  "location": "Icic.to_click_personal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close all browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Icic.close_all_browser()"
});
formatter.result({
  "status": "passed"
});
});