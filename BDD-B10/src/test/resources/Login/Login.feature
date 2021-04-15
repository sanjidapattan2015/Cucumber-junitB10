Feature: Login features
This feature includes scenario that will validate the following feature.
1) Login as Admin
2) Login as linda.anderson
3) Login with Negative data

Background:
Given I am able to navigate onto the login page

#Scenario: Login as Admin
#When I Enter the username as "Admin"
#And I Enrer the Password as "admin123"
#And I Click on the Login button
#Then I should see the username as "Welcome Paulette"
 
#Scenario: Login as linda.anderson
#When I Enter the username as "Admin"
#And I Enrer the Password as "admin123"
#And I Click on the Login button
#Then I should see the username as "Welcome Paulette"

@ValidLogin 
Scenario: Test Login with different data
When I Enter the username as "<username>"
And I Enrer the Password as "<password>"
And I Click on the Login button
Then I should see the username as "<LoginName>"

Examples:
|username|password|LoginName|
|Admin	 |admin123|Welcome Paul|
|Admin	 |admin123|Welcome Paul|

@InvalidLogin
Scenario: Login with Negative data
When I Enter the username as "Sunil"
And I Enrer the Password as "admin123"
And I Click on the Login button
Then I should see a Error Message as "Invalid Credentials"
