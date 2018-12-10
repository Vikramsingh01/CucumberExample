$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 2,
  "name": "My Testing feature",
  "description": "I want to use this template for my feature file",
  "id": "my-testing-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "my-testing-feature;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Navigate to Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "select products",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "product add to cart Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefs.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 12616737943,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefs.user_Navigate_to_Home_Page()"
});
formatter.result({
  "duration": 60338,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefs.select_products()"
});
formatter.result({
  "duration": 43854,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefs.product_add_to_cart_Successfully()"
});
formatter.result({
  "duration": 23327,
  "status": "passed"
});
});