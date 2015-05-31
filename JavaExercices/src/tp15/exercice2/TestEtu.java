package tp15.exercice2;


import javax.swing.JOptionPane;

/**
 * @author Abderrahman ZIANI
 *
 */
public class TestEtu {
	public static String getMenu(){
		StringBuffer sb = new StringBuffer();
		sb.append("1. Ajouter un �tudiant\n");
		sb.append("2. Ajouter un nouveau r�sultat � tous les �tudiants\n");
		sb.append("3. Afficher les �tudiants et leur moyenne.\n");
		sb.append("4. Supprimer un �tudiant");
		sb.append("0. Quitter\n");
		sb.append("Votre choix : \n");
		String s = new String(sb);
		return s;
	}
	public static void main(String[] args) {
		char choix;
		do{
			choix = (JOptionPane.showInputDialog(getMenu())).charAt(0);// change str en char
			switch (choix){
			case '1' :
				String nom = JOptionPane.showInputDialog("Nom de l'�tudiant : ");
				Etudiant etu = new Etudiant(nom);
				Etudiant.ajouteEtu(etu);
				break;
			case '2' :
				for (Etudiant etud : Etudiant.listeEtu) {
					int points = Integer.parseInt(JOptionPane.showInputDialog(
							etud.toString()+"\nNouveaux points de cet �tudiant : "));
					etud.ajoutePoint(points);
				}
				break;
			case '3' :
				JOptionPane.showMessageDialog(null, Etudiant.toStringAll());
				break;
			}
		}while (choix!='0');
	}
}