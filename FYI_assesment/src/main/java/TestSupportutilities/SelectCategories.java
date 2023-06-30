package TestSupportutilities;



import FrameworkUtilities.PublicSharedVariables;

public class SelectCategories {
	
	public void SelectCategory(String CategoryEmojiName)
	{
		new GetEmoji(PublicSharedVariables.CategoryBasepath+CategoryEmojiName+".png").GetEmojiPattern(PublicSharedVariables.MainWindow_EmojiSelector).click();
	}

	
}
