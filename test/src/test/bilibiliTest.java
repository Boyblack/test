package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class bilibiliTest {
	driver a = new driver();
	WebDriver wd;
@Test
  public void xpath() throws InterruptedException, IOException {
	 System.setProperty("webdriver.chrome.driver", "/Users/gaya/Documents/selenium/chromedriver");
	  a.adriver.findElement(By.id("tv.danmaku.bili:id/tab_title")).click();
	  WebElement element = a.adriver.findElement(By.id("tv.danmaku.bili:id/image"));
//	  a.adriver.tap(1, element, 3000);
	  element.click();
	  Thread.sleep(6000);
	  Set<String> contextSet = a.adriver.getContextHandles();
	  for(String context : contextSet ){
		  System.out.println(context);
		  if(context.contains("WEBVIEW_tv")){
//			  a.adriver.context("WEBVIEW_tv.danmaku.bili:web");
			  a.adriver.context(context);
			  System.out.println("1");
			  break;
		  }
	  }
	  a.adriver.context("WEBVIEW_tv.danmaku.bili:web");
//	  a.adriver.findElement(By.className("android.widget.ImageButton")).click();
	 FileOutputStream wt = new FileOutputStream("/Users/gaya/Downloads/2.html") ;
	 PrintStream p = new PrintStream(wt);
	 System.out.println(1);
	 System.out.println(a.adriver.getContext());
	 p.print(a.adriver.getPageSource());

	 a.adriver.findElement(By.xpath("//div[@id='CustomClickArea']/div/a")).click();
	 System.out.println(1);
	 p.close();
	  
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  
//	  a.AnDriver("4.4", "192.168.56.101:5555", "/Users/gaya/Documents/App/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
	  a.AnDriver("7.0", "192.168.56.101:5555", "/Users/gaya/Documents/App/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.AnDriver("4.1", "192.168.56.102:5555", "/Users/gaya/Documents/App/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");

  }

  @AfterClass
  public void afterClass() {
	  a.adriver.closeApp();
	  a.adriver.quit();
  }

}