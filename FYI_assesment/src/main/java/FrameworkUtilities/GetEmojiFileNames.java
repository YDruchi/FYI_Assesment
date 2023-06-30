package FrameworkUtilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class GetEmojiFileNames {
	String Foldername="";
	List<String> FileNames= new ArrayList<String>();
	public void listFilesForFolder(final File folder, String SearchCriteria) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	Foldername=fileEntry.getAbsolutePath();
	        	FileNames.clear();
	            listFilesForFolder(fileEntry,SearchCriteria);
	        } else {
	        	if(fileEntry.getName().contains(SearchCriteria))
	        	{
	        		FileNames.add(fileEntry.getName());
	        	}
	        }
	        PublicSharedVariables.EmojisToTest.put(Foldername,new ArrayList<String>(FileNames));
	    }
	}
}
