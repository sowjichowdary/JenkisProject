Feature: Validating Registration in Facebok

  Scenario: facebook registration
    Given user is in registraion page
    When user enters registration creditntials 
         |Sowjanya|G|6380508191|Saibaba@512|6|2|1992|Female|Male|Custom|
    Then user clicks on Sign Up and verified registration 