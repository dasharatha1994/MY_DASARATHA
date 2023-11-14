$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "login functionality test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login with credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.HrmLoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "steps.HrmLoginSteps.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HrmLoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HrmLoginSteps.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check login with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.HrmLoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "steps.HrmLoginSteps.user_enters_invalid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HrmLoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message is displayed - Invalid Credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HrmLoginSteps.error_message_is_displayed_Invalid_Credentials()"
});
formatter.result({
  "status": "passed"
});
});