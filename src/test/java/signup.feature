Feature: Signup API

Scenario: Create user account
Given url 'https://localhost:8080/auth/signup'
And request
"""
{
    "name": "Test User",
    "email": "test@email.com",
    "password": "1234",
    "hourGoal": 10,
    "hoursVolunteered": 0
}
"""
When method post
Then status 200