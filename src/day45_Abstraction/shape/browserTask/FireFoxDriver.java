package day45_Abstraction.shape.browserTask;

public class FireFoxDriver extends RemoteWebDriver{

    public FireFoxDriver(String browserName) {
        super(browserName);
    }

    @Override
    public String getBrowserName() {
        return super.getBrowserName();
    }

    @Override
    public void get(String url) {
        super.get(url);
    }

    @Override
    public void findElement(String locator) {
        super.findElement(locator);
    }

    @Override
    public void findElements(String locator) {
        super.findElements(locator);
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public void quit() {
        super.quit();
    }

    @Override
    public void getTitle() {
        super.getTitle();
    }

    @Override
    public void takeScreenShot() {
        super.takeScreenShot();
    }

    @Override
    public void executeScript(String script) {
        super.executeScript(script);
    }
}
