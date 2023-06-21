@googlesearch @smokeTest;
Feature: perform an google product search

@googleSearchSimple
Scenario Outline: search for i phone13

Given I am on the google homepage
When I enter search "<term>"
And I click on google search button
Then I find  search result


Examples:
|term        |
|i phone 13  |
|smart phone | 

  
