import java.awt.EventQueue;

import javax.swing.UIManager;

//Added a comment line as test by Veera Feb 22, 10:27
public class ChangeCounterMain {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable( )
		{
			public void run( )
			{
				// Set the look and feel to Windows
//				try
//				{
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//				}
//				catch(Exception ex)
//				{
//					// Do Nothing!
//					// i.e. The look and feel is not set and therefore should be the default!
//				}
				
				new ChangeCounterMainFrame( );
			}
		});

	}

}
