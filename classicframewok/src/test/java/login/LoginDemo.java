package login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		//WebDriver driver=new ChromeDriver();
	}

}
