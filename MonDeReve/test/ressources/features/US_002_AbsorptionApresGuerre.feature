Feature: US_002 Absorption après guerre

  Après une grande guerre Ninja, tous les ninjas du village vainqueur accueillent les vaincus dans leur village
  et le village vaincu est donc dépeuplé de ses habitants


  Scenario Outline: Absorption des habitants et calcul automatique du nombre de nouveaux habitants respectifs
    Given une <ville 1> de <nb habitant 1> habitants et <superficie 1> et une <ville 2> de <nb habitant 2> habitants et <superficie 2>
    When une bataille eclate
    Then la ville <ville 1> compte <nb habitant 1 new> et <superficie 1 new> et <ville 2> est vide

    Examples:
      |ville 1 |nb habitant 1|superficie 1|ville 2|nb habitant 2|superficie 2|nb habitant 1 new|superficie 1 new|
      |"Konoha"|5            |1000         |"Suna"|2            |700         |7                |1700            |



