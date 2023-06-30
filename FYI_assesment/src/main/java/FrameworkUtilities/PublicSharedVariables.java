package FrameworkUtilities;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import org.sikuli.script.Region;
import org.testng.xml.XmlTest;

public class PublicSharedVariables {

	public static Region MainWindow_EmojiSelector;
	public static Region SelectedEmojiRegion;
	public static String AppPath;
	public static List<XmlTest> AllTests;
	public static final String ImageBasePath=Paths.get("").toAbsolutePath().toString()+"/src/main/resources/Images/";
	public static HashMap<String, List<String>> EmojisToTest=new HashMap<String, List<String>>();
}