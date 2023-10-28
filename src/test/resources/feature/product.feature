Feature: Products

  As a admin
  I want to access product details
  So that I can manage products

  # [Positive] Get all products
  Scenario: As an admin, I can get all product when using a valid baseURL
    Given I set a GET endpoints
    When I send HTTP GET request
    Then I receive a valid Get HTTP response code 200 OK
    And I receive valid data for all product details