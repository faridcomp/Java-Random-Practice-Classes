package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import core.Base;

public class UtilityClass extends Base {
	public static String screenShotName() {
		Date date = new Date(); 
		String screenShot = date.toString().replace(":", "_").replace(" ", "_"); 
		return screenShot;
	}

	public static void takeScreenShot() {
		String location = System.getProperty("user.dir") + "\\output\\screenshots\\";
		String screenShotFileName = screenShotName() + ".png";

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File(location + screenShotFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
