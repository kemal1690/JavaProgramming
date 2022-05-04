package day45_Abstraction.shape.browserTask;

public interface SearchContext {

 void findElement(String locator);
 void findElements(String locator);

 void close();
 void quit();
 void getTitle();




}
