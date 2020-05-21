package HomeWork15;

import java.io.File;

public class TheNecessaryFolder {

    public void getTheNecessaryFolder(String folder, int nestingLevel) {
        StringBuilder tabs = new StringBuilder();
        for (int i = 0; i < nestingLevel; i++) {
            tabs.append('\t');
        }
        File folderFile = new File(folder);
        File[] folderList = folderFile.listFiles();
        for (File file : folderList) {
            System.out.println(tabs.toString() + file.getName());
            if (file.isDirectory()) {
                getTheNecessaryFolder(file.getAbsolutePath(), nestingLevel + 1);


            }
        }
    }
}
