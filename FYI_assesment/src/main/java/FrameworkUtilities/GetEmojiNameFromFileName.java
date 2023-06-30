package FrameworkUtilities;

public class GetEmojiNameFromFileName {

	public static String GetEmojiName (String FileName)
	{
		//System.out.println(FileName.split("\\."));
		return FileName.split("\\.")[0];
	}
	
	public static String GetCategoryName (String FileName)
	{
		//System.out.println(FileName.split("\\."));
		String[]spliitedpath=FileName.split("/");
		return spliitedpath[spliitedpath.length-1];
	}
	
}
