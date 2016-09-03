Meta:

Narrative:
As an administrator
I want the system to know who is accessing it
So that I can keep the user's data safe.

Scenario:  A new user saves their credentials
Given I am a new user
When I register
And I provide my credentials
And I provide my name
Then the system saves the user's details
And the system saves the credentials