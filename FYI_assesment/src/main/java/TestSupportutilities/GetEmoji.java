package TestSupportutilities;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

public class GetEmoji {
	
	private String EmojiFilePath;
	
	public GetEmoji(String EmojiFilePath) {
		this.EmojiFilePath= EmojiFilePath;
	}
	
	public Match GetEmojiPattern(Region RegionToSearch)
	
	{
		try
		{
			Pattern Emoji= new Pattern(this.EmojiFilePath);
			return RegionToSearch.find(Emoji);
			
		}
		catch(FindFailed e)
		{
			e.printStackTrace();
			return null;
		}
	}
}