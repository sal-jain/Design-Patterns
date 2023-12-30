package adapterpattern;

public class ChromeDriver implements WebDriver{
    @Override
    public void getElement() {
        System.out.println("Get element from Chrome Driver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from Chrome Driver");
    }
}
