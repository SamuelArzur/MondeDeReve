Feature: US_001 Naissance Ninja

  En tant que chef du village
  Je veux assister à la naissance de 3 nouveaux habitants Ninja afin de m'assurer
  que je peux peupler correctement mon village

  Scenario Outline: création d'un Habitant et attribution automatique du village
    Given  le nom de la <ville 1> qui contient <nb habitant 1> habitants
    When les 3 habitants sont ajoutés les 3 <nom 1> <nom 2> <nom 3> de Ninja
    Then Le village compte <nb habitant 2> habitants et leur ville <ville 1> est bien attribué automatiquement

    Examples:
    |nom 1   |ville 1 |nom 2   |ville 1 |nom 3   |ville 1 |nb habitant 1|nb habitant 2|
    |"Naruto"|"Konoha"  |"Sasuke"|"Konoha"  |"Hinata"|"Konoha"  |4      |7            |





