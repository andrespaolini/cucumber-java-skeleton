Feature: Hear shout

  Shouty allows users to hear other users shouts as long as they are close enough to each other.

  To do:
  - only shout to people within a certain distance

  #Background:
  #  Given a person named Lucy
  #  And a person named Sean

  @smoke
  Rule: Shouts can be heard by other users
    Scenario: Listener hears a message
      Given the range is 100
      And a person named Sean is located at 0
      And a person named Lucy is at 50
      When Sean shouts
      """
        Now on that limb there was a branch
        A rare branch and a rattlin' branch
        And the branch on the limb
        And the limb on the tree
        And the tree in the bog
        And the bog down in the valley-o
      """
      Then Lucy hears Sean's message

  Rule: Shouts should only be heard if listener is within range

    Scenario: Listener is within range
      Given the range is 100
      And people are located at
        |1 |name |notes |
        |0 |sean        |hell  |
        |50 |lucy     |test  |
      When Sean shouts "free bagels at Sean's"
      Then Lucy hears Sean's message

    @focus @smoke
    Scenario: Listener is out of range
      Given the range is 100
      And people are located at
      |name |location |notes |
      |sean |0        |hell  |
      |lucy |50       |test  |
      When Sean shouts "free bagels at Sean's"
      Then Larry should not hear Sean's message