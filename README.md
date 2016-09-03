# BDD Training

BDD Training is intended to teach the basics of BDD using Serenity, JBehave, JUnit, and Spring.

The training is in the form of a repo with each step tagged along the way to make the process of setting up and following 
the training extremely easy for both the instructor and the participants.

## The Task Share Application

The `task share` application represents a simple application that is built using the principles of `TDD` and is the subject 
of the `BDD Training`.

The application models a successive set of stories which implement **Capabilities** and **Features**. The set up is consistent 
with the approach taken by Serenity for reducing boiler-plate code normally required by JBehave.
 
### The Courses

#### BDD for Analysts and Testers
This training session covers the basics of BDD from a non-technical perspective. It includes writing effective user stories, 
discovering personas, mapping user stories, working from Epics through to Features and then to User Stories.

##### Goal
The **goal** of BDD for Analysts and Testers is to provide an understanding of Behaviour Driven Development and the purpose
of User Stories and Scenarios in reducing ambiguity and thus enabling automation.

##### Learning Outcomes
At the end of the training students should be able to:
* distinguish between Behaviour Driven Development and Test Driven Development
* apply the INVEST acronym to User Stories
* recognise User Stories written from different persona perspectives
* analyse User Stories and create scenarios that can be automated
* write `.story` files using JBehave Story Syntax
* describe the difference between completed, ignored, and failed tests in the Serenity Test Report
* recognise and describe development progress using the Serenity Test Report 

#### BDD for Developers and Test Engineers
This training session covers the BDD process and how  `.story` files are automated to show that the application is meeting
it's acceptance criteria.

#### Goal
The **goal** of BDD for Developers and Test Engineers is to provide a technical understanding of the mechanics of BDD with 
JBehave and Serenity, how BDD can benefit the development process, and what the process is for developing an application 
using BDD.

#### Learning Outcomes
At the end of the training students should be able to:
* distinguish between Behaviour Driven Development (BDD) and Test Driven Development (TDD)
* configure Serenity, JBehave, and Selenium WebDriver using Maven as a build tool
* execute BDD tests and locate the resultant Serenity Test Report
* design an automated testing implementation strategy that reduces duplication and maintenance effort
* implement BDD tests using @Given, @When, @Then
