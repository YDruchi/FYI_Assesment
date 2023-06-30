package FrameworkUtilities;

public class GetEmojiNameFromFileName {

	public static String GetEmojiName (String FileName)
	{
		//System.out.println(FileName.split("\\."));
		return FileName.split("\\.")[0];
	}
}
