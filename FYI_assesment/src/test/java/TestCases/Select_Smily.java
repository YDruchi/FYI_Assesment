package TestCases;

import java.io.File;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameworkUtilities.GetEmojiFileNames;
import FrameworkUtilities.GetEmojiNameFromFileName;
import FrameworkUtilities.PublicSharedVariables;
import TestData.TestData;
import TestSupportutilities.ActionManager;
import TestSupportutilities.GetEmoji;
import TestSupportutilities.SelectCategories;
import TestSupportutilities.SelectedEmoji;

public class Select_Smily {
 
	@Test
	public void SearchandSelectAllSmilies(ITestContext test) throws InterruptedException
	{
		
		  String SerachCritearia= TestData.getAllData(test.getName()).get("EmojiCriteria");
		  ActionManager.TypeTextbox("TextBox_SerachEmoji.png", SerachCritearia);
		  
		 //test
		  
		  final File folder = new File(PublicSharedVariables.ImageBasePath);
		  new GetEmojiFileNames().listFilesForFolder(folder,SerachCritearia);
		  
		  
		 
		  SelectedEmoji VerifyEmoji= new SelectedEmoji();
		  Match EmojitoClick;
		  String EmojitobeSlectedFileName;
		  for ( String Key : PublicSharedVariables.EmojisToTest.keySet()) {
			if (PublicSharedVariables.EmojisToTest.get(Key).size()!=0)
			{
				new SelectCategories().SelectCategory(GetEmojiNameFromFileName.GetCategoryName(Key));
				for (String EmojiName : PublicSharedVariables.EmojisToTest.get(Key)) {
					EmojitobeSlectedFileName=Key+"/"+EmojiName;
					EmojitoClick=new GetEmoji(EmojitobeSlectedFileName).GetEmojiPattern(PublicSharedVariables.MainWindow_EmojiSelector);
					EmojitoClick.click();
					Thread.sleep(500);
					Assert.assertTrue(VerifyEmoji.VerifySelectedEmoji(new Pattern(EmojitobeSlectedFileName)), null);
					Reporter.log("Selected Emoji " +GetEmojiNameFromFileName.GetEmojiName(EmojiName) + " is Visible");
				}
			}
		}
		  
		  
	}
	
}
