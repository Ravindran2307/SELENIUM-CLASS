package week1.day2;

public class Browser {
	
	public void launchBrowser(String browserName)
	
	{
		System.out.println("Launch Browser: " +browserName);
	}
	
	public String loadUrl()
	{
		return "URL loaded successfully";
	}
	

	public static void main(String[] args) {

		Browser bw = new Browser();
		bw.launchBrowser("Firefox");
		String Load = bw.loadUrl();
		System.out.println(Load);
		
		
	}

}
