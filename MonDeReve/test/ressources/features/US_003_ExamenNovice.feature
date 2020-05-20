Feature: US_003 Examen Novice

  On veut faire progresser notre village, pour ce faire, tous les Ninjas passent un examen


  Scenario Outline: Attribution des titres suite à l'examen passé
    Given deux habitants de la ville <habitant 1> sans titre <habitant 2> titre <titre 2>
    When les 2 habitants passent l'examen
    Then l'<habitant 1> est devient <titre 1 new> et l'<habitant 2> devient <titre 2 new>

    Examples:
      |habitant 1|habitant 2|titre 2|titre 1 new|titre 2 new|
      |"Naruto"|"Kakashi"|Ninja   |Ninja|Hokage|



