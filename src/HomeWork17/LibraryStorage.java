package HomeWork17;

import java.io.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class LibraryStorage {
    static final Logger log = Logger.getLogger(LibraryStorage.class.getName());

    public void saveLibrary(Library library) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
            oos.writeObject(library);
            log.info("Библиотека сохранена в library.dat");
        } catch (IOException e) {
            log.warning("Ошибка ввода-вывода:");
           // log.warning(e.fillInStackTrace());
        }
    }

    public Library loadLibrary() {
        File file = new File("library.dat");
        if (file.exists() && file.isFile()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (Library) ois.readObject();
            } catch (IOException e) {
                log.warning("Ошибка ввода-вывода:");
               // log.warning((e.fillInStackTrace());
            } catch (ClassNotFoundException e) {
                log.warning("Не найден считываемый класс:");
               // log.warning(e.fillInStackTrace());

            }
        } else {
            log.info("Файл сохранения library.dat не найден. Восстановление невозможно");
        }
        return null;
    }
}
