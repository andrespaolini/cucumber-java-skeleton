Feature: Hear shout

  Shouty allows users to hear other users shouts as long as they are close enough to each other.

  To do:
  - only shout to people within a certain distance

  #Background:
  #  Given a person named Lucy
  #  And a person named Sean

  Rule: Shouts can be heard by other users
    Scenario: Listener hears a message
      Given the range is 100
      And a person named Sean is located at 0
      And a person named Lucy is at 50
      When Sean shouts "free bagels at Sean's"
      Then Lucy hears Sean's message

  Rule: Shouts should only be heard if listener is within range

    Scenario: Listener is within range
      Given the range is 100
      And a person named Sean is located at 0
      And a person named Lucy is at 50
      When Sean shouts "free bagels at Sean's"
      Then Lucy hears Sean's message

    Scenario: Listener is out of range
      Given the range is 100
      And people are located at
      |name |location |
      |sean |0        |
      |lucy |50       |
      When Sean shouts "free bagels at Sean's"
      Then Larry should not hear Sean's message