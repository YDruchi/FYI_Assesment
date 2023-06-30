package TestSupportutilities;

import org.sikuli.script.App;
import org.testng.Reporter;

import FrameworkUtilities.PublicSharedVariables;

public class Application_Handlig {

	App EmojiSelector;
	public void LaunchApp_GetWindow()
	
	{
		EmojiSelector= new App(PublicSharedVariables.AppPath);
		EmojiSelector.open();
		PublicSharedVariables.MainWindow_EmojiSelector= EmojiSelector.waitForWindow(2);
	}
	
	public void CloseApp()
	{
		if (EmojiSelector.close(1))
		{
			Reporter.log("Application is Closed Now");
		}
		else
		{
			Reporter.log("Application is Not Closed");
		}
	}
}
