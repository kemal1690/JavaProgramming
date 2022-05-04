package day45_Abstraction.shape.browserTask;

public class DriverObjects {

    public static void main(String[] args) {

    ChromeDriver chromeDriver = new ChromeDriver("Chrome");
    FireFoxDriver fireFoxDriver = new FireFoxDriver("Firefox");
    EdgeDriver edgeDriver = new EdgeDriver("Edge");
    SafariDriver safariDriver = new SafariDriver("Safari");
    OperaDriver operaDriver = new OperaDriver("Opera");


    chromeDriver.close();
    fireFoxDriver.findElement("upload");
    edgeDriver.executeScript("Executing new window");
    safariDriver.get("https://wwww.google.com");
    chromeDriver.getTitle();


    }
}
