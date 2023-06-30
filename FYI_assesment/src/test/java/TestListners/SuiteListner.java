package TestListners;


import java.nio.file.Paths;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import FrameworkUtilities.PublicSharedVariables;
import TestSupportutilities.Application_Handlig;
import TestSupportutilities.SelectedEmoji;

public class SuiteListner implements ISuiteListener {

	Application_Handlig Apphandling= new Application_Handlig();
	
	public void onStart(ISuite suite) {	
		System.out.println("onStart function started "  + suite.getName());
		
		PublicSharedVariables.AppPath= suite.getParameter("AppPath");
		PublicSharedVariables.AllTests= suite.getXmlSuite().getTests();
		
		Apphandling.LaunchApp_GetWindow();
		new SelectedEmoji().FindSelectedEmojiRegion();
		
	}
	
	public void onFinish(ISuite suite) {
		System.out.println("onFinish function started "  + suite.getName());
		Apphandling.CloseApp();
	}
	
}
