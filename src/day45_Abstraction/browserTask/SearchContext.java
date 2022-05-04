package day45_Abstraction.browserTask;

public interface SearchContext {

 void findElement(String locator);
 void findElements(String locator);

 void close();
 void quit();
 void getTitle();




}
