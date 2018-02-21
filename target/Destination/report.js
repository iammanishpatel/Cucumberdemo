$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/feature/feature.feature");
formatter.feature({
  "name": "Test Website login scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Website login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open browser and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "WebsiteStep.open_browser_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "WebsiteStep.i_enter_valid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebsiteStep.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "status": "passed"
});
});