Feature: Access basitali.com website
  Use selenium java with cucumber-jvm and navigate to website

  Scenario: Print title, url
    When I open image galery website
    Then I validate title and URL
