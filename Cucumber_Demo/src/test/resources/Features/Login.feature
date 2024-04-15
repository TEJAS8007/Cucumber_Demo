Feature:check login functionality
Scenario: login check
Given user navigate to "https://demo.guru99.com/test/newtours/login.php"
When user enter userName as "QQQQ"
And user enter password as "qqqq"
Then Login should be complete


Scenario Outline: data Driver Tests

Given user should enter '<username>'
When user should enter pass '<password>'
Then DDTest Should get Completed..

Examples:

 |username        |  password   |
 |QQQQ            |qqqq         |
 |AAAA            |aaaa         |
