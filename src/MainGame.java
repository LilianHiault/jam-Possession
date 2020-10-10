package src;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


/**class MyWindow extends JFrame<p>
 * Gere la fenetre et les saisies clavier
*/
public class MainGame extends JFrame {
	private static final long serialVersionUID = 1816999198544107363L;

	public MainGame() {
		createWindow();
	}


	/**Cree la fenetre principale
	 * <p>
	 * La fenetre ne sera pas resizable par l'utilisateur (meme si le code y est adapte),
	 * mais il aura la possibilite dans le menu de passer d'un mode fenetre a un mode plein ecran.
	 */
	public void createWindow() {
		this.setTitle("Possess Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Fenetre hors plein ecran : width = 80% et height = 90% (les proportions sont a peu pres conservees)
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(screenSize.getWidth() * 0.8);
		int height = (int)(screenSize.getHeight() * 0.9);
		this.setSize(width, height);
		//this.setLocationRelativeTo(null);
		this.setLocation( (int)(screenSize.getWidth() * 0.1), (int)(screenSize.getHeight() * 0.05) );

		// // this.setResizable(false);
		// mainMenu = new MainMenu(this);


		// Plein ecran
		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// this.setUndecorated(true);

		this.setVisible(true);
	}


	/** Le Main principal du jeu */
	public static void main(String[] args) {
		new MainGame();
	}

}
