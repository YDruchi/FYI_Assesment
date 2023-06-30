package TestSupportutilities;

import org.sikuli.script.Match;

import FrameworkUtilities.PublicSharedVariables;

public class ActionManager {

	public static void TypeTextbox(String TextBoxImageFile, String TexttoType)
	{
		Match TextBoxtoType= new GetEmoji(PublicSharedVariables.ImageBasePath+ TextBoxImageFile).GetEmojiPattern(PublicSharedVariables.MainWindow_EmojiSelector);
		  TextBoxtoType.click();
		  TextBoxtoType.type(TexttoType);
		  
	}
}
