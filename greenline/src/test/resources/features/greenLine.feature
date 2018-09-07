Feature: GreenLine Navigation
    In order to find the order details
    As a generic Test User
    I want to be able to Navigate to the GreenLine UI
    
    Scenario: ECA REST order shows up in the  orders grid
    
	Given I want to navigate to GF UI
	When I click on FBCP Application cluster
	Then I click on DashBoard
	Then I mouse over on FixMessage
	Then I click on Orders&Execution
	Then I search for ClOrdID
	