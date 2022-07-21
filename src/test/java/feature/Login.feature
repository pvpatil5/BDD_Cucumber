Feature: Login to the Application


@SmokeTest @RegressionTest
Scenario: Login to App through Valid Cred

Given launch browser
When enter URL
Then enter username
And enter password
Then click on loginbtn
And Close Browser

@RegressionTest
Scenario: Login to App through Valid Cred

Given launch browser
When enter URL "http://localhost:8888"
Then enter username "admin"
And enter password "12345"
Then click on loginbtn
And Close Browser


@SmokeTest
Scenario: Login to App through Invalid Cred

Given launch browser
When enter URL "http://localhost:8888"
Then enter username "admin"
And enter password "123456"
Then click on loginbtn
And Close Browser




