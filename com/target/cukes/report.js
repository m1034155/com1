$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/assignment4.feature");
formatter.feature({
  "line": 2,
  "name": "CucumberJava- Registration of 10 users",
  "description": "",
  "id": "cucumberjava--registration-of-10-users",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@automationpractice"
    }
  ]
});
formatter.before({
  "duration": 13606891429,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Registration of a user",
  "description": "",
  "id": "cucumberjava--registration-of-10-users;registration-of-a-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Enter the user details and click on sign in button",
  "rows": [
    {
      "cells": [
        "accountid",
        "asdftyu@gmail.com"
      ],
      "line": 7
    },
    {
      "cells": [
        "customer_firstname",
        "firstname"
      ],
      "line": 8
    },
    {
      "cells": [
        "customer_lastname",
        "lastname"
      ],
      "line": 9
    },
    {
      "cells": [
        "password",
        "abc1234"
      ],
      "line": 10
    },
    {
      "cells": [
        "firstname",
        "firstname1"
      ],
      "line": 11
    },
    {
      "cells": [
        "lastname",
        "lastname1"
      ],
      "line": 12
    },
    {
      "cells": [
        "address1",
        "ds"
      ],
      "line": 13
    },
    {
      "cells": [
        "city",
        "des"
      ],
      "line": 14
    },
    {
      "cells": [
        "postcode",
        "12345"
      ],
      "line": 15
    },
    {
      "cells": [
        "phone",
        "1234567890"
      ],
      "line": 17
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Registration should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.enter_the_user_details_and_click_on_sign_in_button(DataTable)"
});
formatter.result({
  "duration": 19889991347,
  "status": "passed"
});
formatter.match({
  "location": "steps.registration_should_be_successful()"
});
formatter.result({
  "duration": 27908670,
  "status": "passed"
});
formatter.after({
  "duration": 20907,
  "status": "passed"
});
});