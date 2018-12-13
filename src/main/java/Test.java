import com.meganexus.utils.WebDriverManager;
import com.megannexus.pages.LoginPage;

public class Test {
	 LoginPage lp =new LoginPage();
	public static void main(String[] args) {
		WebDriverManager.getDriver();
		Test t = new Test();
		t.run();
		
	}
	void run(){
		lp.Launch_URL();
	}
}