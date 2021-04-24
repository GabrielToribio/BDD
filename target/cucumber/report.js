$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Validate PHP Travels Login functionality",
  "description": "",
  "id": "validate-php-travels-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 9479345899,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the PHP login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.User_is_on_the_PHP_login_page()"
});
formatter.result({
  "duration": 3900052800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "validate-php-travels-login-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User enters username from database",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters password from database",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.User_enters_username_from_database()"
});
formatter.result({
  "duration": 66591801,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_enters_password_from_database()"
});
formatter.result({
  "duration": 69628000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 62493200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 5208359199,
  "status": "passed"
});
formatter.after({
  "duration": 684355800,
  "status": "passed"
});
});