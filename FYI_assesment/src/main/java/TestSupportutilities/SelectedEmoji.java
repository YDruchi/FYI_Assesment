package TestSupportutilities;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import FrameworkUtilities.PublicSharedVariables;

public class SelectedEmoji {

	public void FindSelectedEmojiRegion()
	{
		PublicSharedVariables.SelectedEmojiRegion= new GetEmoji(PublicSharedVariables.ImageBasePath+"SelectedEmojiRegion.png").GetEmojiPattern(PublicSharedVariables.MainWindow_EmojiSelector);
	}
	
	public boolean VerifySelectedEmoji(Pattern Emoji)
	{
		try
		{
			PublicSharedVariables.SelectedEmojiRegion.find(Emoji);
			return true;
		}
		catch(FindFailed e)
		{
			return false;
		}
	}
}
