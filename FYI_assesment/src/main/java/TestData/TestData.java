package TestData;

import java.util.HashMap;
import java.util.Map;

import org.testng.xml.XmlTest;

import FrameworkUtilities.PublicSharedVariables;

public class TestData {

	public static Map<String,String> getAllData(String TestName)
	{
		Map<String , String > TestData = new HashMap();
		for (XmlTest Test : PublicSharedVariables.AllTests) {
			if(Test.getName().equals(TestName))
			{
				TestData= Test.getAllParameters();
			}
		}
		return TestData;
		
	}
}
