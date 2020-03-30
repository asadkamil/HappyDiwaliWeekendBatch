package TestNG_Package;
import java.io.FileInputStream;
import java.util.Properties;
public class DataParameterizationUsingPropertyFile {

	public static void main(String[] args) throws Exception {
		FileInputStream configfileObj = new FileInputStream(".\\config.properties");
		Properties prop = new Properties();
		prop.load(configfileObj);
		String url = prop.getProperty("APP_URL");
		System.out.println(url.length());
		String Invalidurl = prop.getProperty("URL","Key does not exist");
		String un = prop.getProperty("USERNAME");
		String pwd = prop.getProperty("PASSWORD");
		System.out.println(url+" : "+Invalidurl+" : "+un+" : "+pwd);		
	}
}
