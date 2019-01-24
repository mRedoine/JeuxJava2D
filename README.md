# Jeu2D_JAVA
Conception d'Applications en JAVA/JEE</u> par Jacques Longchamps<br><br>
<b>Trois couches pour point de départ: </b> 
<ul>
  <li>présentation (interface utilisateur)</li>
  <li>application (moteur et jeu "assemblé", regroupant une interface utilisateur et un moteur)</li>
  <li>infrastructure (persistances des scores, son)</li>
  </ul>
  <p>On sépare ensuite ce qui est commun à tous les jeux des spécificitées<ul>
  <li>présentation => paquet gui => une partie générique(gui.generique) + une partie spécifique(gui.specifique) qui comporte un sous-paquet par jeu(ex: gui.specifique.serpent,...) </li>
  <li>application => paquets jeu et moteur =>> jeu.generique, moteur.generique + jeu.specifique et moteur.specifique qui contiennent un sous-paquet par jeu (jeu.specifique.tetris...) </li>
  </ul>
  <br>
  <hr>
  <h4>Patrons utilisés </h4>
  <p>La composition est préférée à l'héritage :-)<br>
  Les moteurs spécifiques sont des composants qui se branchent sur le moteur générique.
  Au niveau de l'interface utilisateur, la classe GUI contient une JFrame qui déclare la structure en panneaux de l'interface, 2 panneaux sont complètements génériques :classe PanneauControle et PanneauScore (du meme paquet). Le panneau d'affichage gère les contrôles clavier(KeyListener), il est en partie générique (classe PanneauJeu de gui.generique) et reçoit des composants qui se branchent dessus.</p>
  
  <b>Monteur :</b> Assemblage des compositions<br>
  <b>Stratégie :</b> Plusieurs manières de gerer les sauvegardes (fichier texte, sérialisation, BD embarquée, etc.)<br>
  <b>Observeur :</b> Liens entre la classe Moteur(score, niveaux) et le panneau d'affichage(PanneauScore).<br>
  
La classe abstraite ObjetJeu est utilisée pour pouvoir manipuler les objets spécialisés dont ils dérivent.<br>
<b>Fabrication Abstraite :</b> Utilisée pour ces familles d'objets.<br>
  
