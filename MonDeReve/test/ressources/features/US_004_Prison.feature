Feature: US_004 Prison

  Pour faire régner le calme dans le village, chaque habitant possède 5 points de délits
  s'il les perd à cause de mauvaises actions, il va en prison.

  Scenario Outline: Perte des points et mise en prison d'un habitant
    Given  une ville <ville 1> avec ses habitants<nb habitant 1>
    When un <habitant 1> perd tous ces points
    Then l'<habitant 1> est mis en prison <nb jours> puis regagne <nb points>

    Examples:
    |ville 1 |nb habitant 1|habitant 1|nb jours|nb points|
    |"Konoha"|10           |Sasuke  |56      |3        |





