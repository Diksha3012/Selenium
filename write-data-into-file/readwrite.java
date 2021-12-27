package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readwrite {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\rw\\src\\test\\resources\\properties\\testdata.properties");
	    properties.load(inputstream);
	    String browserinfo= properties.getProperty("browser");
	    System.out.println(browserinfo);
	    System.out.println(properties.getProperty("url"));
	    
	    // to write date into file
	    FileOutputStream outputstream = new FileOutputStream("C:\\Users\\lenovo\\eclipse-workspace\\rw\\src\\test\\resources\\properties\\testdata.properties");
	    
	    properties.setProperty("testdate", "1192");
	    properties.store(outputstream, "this is last selenium core program ");
	    
	}

}
