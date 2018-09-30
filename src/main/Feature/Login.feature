Feature: Login Test Suite



#  Scenario: Create Account Test
#    When Login into Application and Create Account with username "sandeep"
#
#  Scenario Outline: : Create Account Test with second user
#    When Login into Application and Create Account with username "<userlist>"
#    Examples:
#      | userlist |
#      | sandeep  |

  Scenario:login into application using dataSet
    Given login into application using below details
      | username | password |
      | sandeep  | duve     |

#  Scenario: to verify dry run
#    Given your details.