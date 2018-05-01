Feature: Tatoc course
	
	Scenario: Selection of coruse type i.e, advance
	Given Open browser and start application Tatoc
	When Click on advance course
	Then Navigated to hover menu
	
	Scenario: Select 'Go Next' from 'Menu 2' to proceed
	When Hover on 'menu 2' and click on 'Go next'
	Then Navigated to query gate
	
	Scenario: Query the mysql database at 10.0.1.86 to get the 'Name' and 'PassKey' matching the provided 'Symbol'
	Given Symbol text on query gate
	When connection is established
	Then Check the number of column in tables And fetch the name and passkey
		And fill the fetched credentials
		And proceed to next page