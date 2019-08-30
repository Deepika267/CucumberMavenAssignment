package managers;

import reusablefunctions.Reusablefunctions;

public class ManagingFileReading {
	private static ManagingFileReading fileReaderManager = new ManagingFileReading();
	public static Reusablefunctions configFileReader;
 
	public ManagingFileReading() {
	}
 
	 public static ManagingFileReading getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public Reusablefunctions getConfigReader() {
		 return (configFileReader == null) ? new Reusablefunctions() : configFileReader;
	 }


}
