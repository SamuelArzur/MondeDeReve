Feature: US_005 Heritage

  Lors du décès d'un parent, tous ces enfants obtiennent en héritage ses techniques Ninja
  sauf celles qu'ils connaissent déjà.

  Scenario Outline: Décès d'un parent, et héritage de technique par ses enfants.
    Given  une <ville 1> avec <habitant 1> possédant <technique 1> <technique 2> <technique 3> et son enfant <habitant 2> possédant <technique 1> et <technique 4>
    When l'<habitant 1> décède
    Then l'<habitant 2> possède maintenant <technique 1> <technique 2> <technique 3> <technique 4> et l'<habitant 1> aucune

    Examples:
    |ville 1 |habitant 1|habitant 2|technique 1   |technique 2  |technique 3|technique 4             |
    |"Konoha"|"Minato"  |"Naruto"  |"Multiclonage"|"Subsitution"|"Razengan" |"Déplacement instantanné|





