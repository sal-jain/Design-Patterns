package adapterpattern;

public class Client {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.getElement();
        chrome.selectElement();

        ExplorerDriver explorer = new ExplorerDriver();
        explorer.findElement();
        explorer.clickElement();

        WebDriver driver = new WebAdapter(explorer);
        driver.getElement();
        driver.selectElement();
    }
}
