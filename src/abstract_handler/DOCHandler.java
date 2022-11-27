package abstract_handler;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Open DOC");
    }

    @Override
    public void change() {
        System.out.println("Change DOC");
    }

    @Override
    public void create() {
        System.out.println("Create DOC");
    }

    @Override
    public void save() {
        System.out.println("Save DOC");
    }
}
