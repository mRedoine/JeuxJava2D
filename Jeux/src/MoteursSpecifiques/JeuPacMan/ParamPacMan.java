package MoteursSpecifiques.JeuPacMan;

public class ParamPacMan {
   public static final int FREQUENCE_MAJ = 100;
   public static final int NB_FANTOMES = 4;
   public static final int DUREE_PORTE_OUVERTE = 100;
   public static final int DUREE_EFFRAYE = 400;
   public static final int VITESSE_FANTOME = 25;
   public static final String[] definition = {
     "XXXXXXXXXXXXXXXXXXXXX",	// 0
     "X.........X.........X",	// 1
     "XOXXX.XXX.X.XXX.XXXOX",	// 2
     "X......X..X.........X",	// 3
     "XXX.XX.X.XXX.XX.X.X.X",	// 4
     "X....X..........X.X.X",	// 5
     "X.XX.X.XXX-XXX.XX.X.X",	// 6
     "X.XX.X.XBBBBBX......X",	// 7
     "X.XX...XBBBBBX.XXXX.X",	// 8
     "X.XX.X.XXXXXXX.XXXX.X",	// 9
     "X....X..............X",	// 10
     "XXX.XX.XXXXXXX.X.X.XX",	// 11
     "X.........X....X....X",	// 12
     "XOXXXXXXX.X.XXXXXXXOX",	// 13
     "X.........P.........X",	// 14
     "XXXXXXXXXXXXXXXXXXXXX",	// 15
   };
   public static final int LIGNES = definition.length; 
   public static final int COLONNES = definition[0].length(); 
   public static final int TAILLE_CELLULE = 30;
   public static final String CHEMIN_FANTOME = "/Users/CocoNeuneu/Desktop/jeu1/Images/ghost.png";
   public static final String CHEMIN_FANTOME_EFFRAYE =
     "Images/scaredghost.png";
   public static final String CHEMIN_BLANCHE = "/Users/CocoNeuneu/Desktop/jeu1/Images/blank.png";
   public static final String CHEMIN_MUR = "/Users/CocoNeuneu/Desktop/jeu1/Images/wall.png";
   public static final String CHEMIN_POINT = "/Users/CocoNeuneu/Desktop/jeu1/Images/dot.png";
   public static final String CHEMIN_POINT_PUISSANCE =
     "Images/power_dot.png";
   public static final String CHEMIN_PORTE_OUVERTE =
     "Images/door_open.png";
   public static final String CHEMIN_PORTE_FERMEE =
     "Images/door_closed.png";
   public static final String CHEMIN_PACD = "/Users/CocoNeuneu/Desktop/jeu1/Images/pacr.png";
   public static final String CHEMIN_PACG = "/Users/CocoNeuneu/Desktop/jeu1/Images/pacl.png";
   public static final String CHEMIN_PACH = "/Users/CocoNeuneu/Desktop/jeu1/Images/pacu.png";
   public static final String CHEMIN_PACB = "/Users/CocoNeuneu/Desktop/jeu1/Images/pacd.png"; 
   public static final int PAC = 1;
   public static final int LABYRINTHE = 2;
   public static final int FANTOME = 3;
}



   