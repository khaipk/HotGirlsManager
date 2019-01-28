package login;

import javax.swing.SwingUtilities;

public class Manager {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Face face = new Face();
				face.setVisible(true);
				face.setSize(300, 300);
				face.setLocation(300,300);
			}
		});
	}

}
