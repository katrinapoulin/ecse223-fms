Feature: Add airport

Scenario: Add airport successfully
Given a FlightManagementSystem exists
When an airport is added with code "<code>" and address "<address>"
Then an airport shall exist with code "<code>" and address "<address>"
Then there should be no error
Then the number of airports shall be "1"

Examples:
| code| address    |
| YUL | Montreal   |
| YYT | Toronto    |

Scenario: Add airport unsuccessfully
Given a FlightManagementSystem exists
Given the following airports exist in the system
| code| address  |
| YUL | Montreal |
When an airport is added with code "<code>" and address "<address>"
Then the number of airports shall be "1"
Then there should be an error returned with message "<error>"

Examples:
| code | address    | error                                 |
| YUL  | Montreal   | Error: Airport already exists.        |
|      | Montreal   | Error: airport code must not be empty |