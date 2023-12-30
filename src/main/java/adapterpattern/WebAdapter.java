package adapterpattern;

public class WebAdapter implements WebDriver{

    ExplorerDriver explorerDriver;

    public WebAdapter(ExplorerDriver explorerDriver){
        this.explorerDriver = explorerDriver;
    }
    @Override
    public void getElement() {
        explorerDriver.findElement();
    }

    @Override
    public void selectElement() {
        explorerDriver.clickElement();
    }
}
