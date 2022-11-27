package abstract_handler;

public class Main {
    public static void main(String[] args) {
        XMLHandler xmlHandler = new XMLHandler();
        TXTHandler txtHandler = new TXTHandler();
        DOCHandler docHandler = new DOCHandler();
        System.out.println("XML");
        xmlHandler.open();
        xmlHandler.change();
        xmlHandler.create();
        xmlHandler.save();
        System.out.println("TXT");
        txtHandler.open();
        txtHandler.change();
        txtHandler.create();
        txtHandler.save();
        System.out.println("DOC");
        docHandler.open();
        docHandler.change();
        docHandler.create();
        docHandler.save();
    }
}
