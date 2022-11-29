package abstract_handler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву документа з розширенням:");
        String name = scanner.next();
        String[] arrayName = name.split("[.]");
        String[] arrayDocumentTypes = {"xml", "txt", "doc"};
        if (arrayName[1].equals(arrayDocumentTypes[0])) {
            XMLHandler xmlHandler = new XMLHandler();
            handler(xmlHandler);
        }
        if (arrayName[1].equals(arrayDocumentTypes[1])) {
            TXTHandler txtHandler = new TXTHandler();
            handler(txtHandler);
        }
        if (arrayName[1].equals(arrayDocumentTypes[2])) {
            DOCHandler docHandler = new DOCHandler();
            handler(docHandler);
        }
        else System.out.println("Невірний формат документа");

    }

    public static void handler(AbstractHandler abstractHandler) {
        abstractHandler.change();
        abstractHandler.open();
        abstractHandler.change();
        abstractHandler.save();
    }
}
