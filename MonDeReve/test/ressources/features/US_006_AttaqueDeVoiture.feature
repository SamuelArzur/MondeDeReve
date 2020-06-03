Feature: US_006 Attaque de voiture

  La ville et ses habitants se font attaquer par une horde de voiture,
  y aura-t-il assez d'habitants pour survivre à l'attaque ?

  Scenario Outline: attaque de la ville par les voitures
    Given  une <ville> de <nb habitant> et une horde de voiture <nb voiture>
    When <nb voiture> attaque la ville de <nb habitant>
    Then les voitures gagnent la ville est vide et elle a <nb habitant 2>

    Examples:
      |nb habitant|ville   |nb voiture|nb habitant 2|
      |2          |"Konoha"|3         |0            |






