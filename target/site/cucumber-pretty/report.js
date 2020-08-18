$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Darksky page feature",
  "description": "",
  "id": "darksky-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@homepage"
    }
  ]
});
formatter.before({
  "duration": 5736141039,
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
  "name": "I am on darsky homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSD.verifyPageTitle()"
});
formatter.result({
  "duration": 655928345,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify lowest and highest degrees of today on darksky page",
  "description": "",
  "id": "darksky-page-feature;verify-lowest-and-highest-degrees-of-today-on-darksky-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@darksky"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on today button on home page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify lowest temperature of the day on home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify highest temperature on darksky home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.goToday()"
});
formatter.result({
  "duration": 586722285,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyMinTemp()"
});
formatter.result({
  "duration": 168093320,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyMaxTemp()"
});
formatter.result({
  "duration": 92103892,
  "status": "passed"
});
formatter.after({
  "duration": 187678307,
  "status": "passed"
});
});