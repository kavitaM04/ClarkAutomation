$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("salesFunnel.feature");
formatter.feature({
  "line": 1,
  "name": "Clark Sales funnel",
  "description": "",
  "id": "clark-sales-funnel",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Clark sales funnel Test Scenario",
  "description": "",
  "id": "clark-sales-funnel;clark-sales-funnel-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User opens Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User is already on landing page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Go to Angebote tab to enter sales funnel",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Go to Privathaftpflicht option",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Accept Private liability offer",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "complete the questionnaire",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Go to Offer",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Select Offer",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Registration details to submit",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Personal Information: \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cbirthdate\u003e\" , \"\u003cstreet\u003e\" , \"\u003chousenumber\u003e\" , \"\u003czipcode\u003e\" , \"\u003ccity\u003e\" , \"\u003cphonenumber\u003e\" , \"\u003cIBAN\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify that the correct contract is shown on manager route",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "clark-sales-funnel;clark-sales-funnel-test-scenario;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "birthdate",
        "street",
        "housenumber",
        "zipcode",
        "city",
        "phonenumber",
        "IBAN"
      ],
      "line": 19,
      "id": "clark-sales-funnel;clark-sales-funnel-test-scenario;;1"
    },
    {
      "cells": [
        "test",
        "kavita",
        "04.09.1990",
        "tonca",
        "B-0/S-6",
        "60306",
        "Goa",
        "015229320777",
        "DE55500105174529223988"
      ],
      "line": 20,
      "id": "clark-sales-funnel;clark-sales-funnel-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Clark sales funnel Test Scenario",
  "description": "",
  "id": "clark-sales-funnel;clark-sales-funnel-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User opens Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User is already on landing page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Go to Angebote tab to enter sales funnel",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Go to Privathaftpflicht option",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Accept Private liability offer",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "complete the questionnaire",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Go to Offer",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Select Offer",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Registration details to submit",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Personal Information: \"test\" , \"kavita\" , \"04.09.1990\" , \"tonca\" , \"B-0/S-6\" , \"60306\" , \"Goa\" , \"015229320777\" , \"DE55500105174529223988\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify that the correct contract is shown on manager route",
  "keyword": "Then "
});
formatter.match({
  "location": "salesStepDefinition.user_opens_browser()"
});
formatter.result({
  "duration": 32738531400,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.user_is_already_on_landing_page()"
});
formatter.result({
  "duration": 116697400,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.go_to_Angebote_tab_to_enter_sales_funnel()"
});
formatter.result({
  "duration": 5289920700,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.go_to_Privathaftpflicht_option()"
});
formatter.result({
  "duration": 3497156800,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.accept_Private_liability_offer()"
});
formatter.result({
  "duration": 2432069500,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.complete_the_questionnaire()"
});
formatter.result({
  "duration": 7134319900,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.Go_To_Offer()"
});
formatter.result({
  "duration": 3501442900,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.Select_Offer()"
});
formatter.result({
  "duration": 1759085800,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.Enter_Registration_details_to_submit()"
});
formatter.result({
  "duration": 3719581900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 29
    },
    {
      "val": "kavita",
      "offset": 38
    },
    {
      "val": "04.09.1990",
      "offset": 49
    },
    {
      "val": "tonca",
      "offset": 64
    },
    {
      "val": "B-0/S-6",
      "offset": 74
    },
    {
      "val": "60306",
      "offset": 86
    },
    {
      "val": "Goa",
      "offset": 96
    },
    {
      "val": "015229320777",
      "offset": 104
    },
    {
      "val": "DE55500105174529223988",
      "offset": 121
    }
  ],
  "location": "salesStepDefinition.Enter_Personal_Information(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 22689353100,
  "status": "passed"
});
formatter.match({
  "location": "salesStepDefinition.Verify_that_the_correct_contract_is_shown_on_manager_route()"
});
formatter.result({
  "duration": 69853300,
  "status": "passed"
});
});