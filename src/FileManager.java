import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class FileManager {
    private String currentDir = System.getProperty("user.dir");

    public void getFilesInCurrentDir() {
        File file = new File(currentDir);
        String [] files = file.list();

        if (files == null) {
            System.out.println("There is something Wrong!!\n");
            return;
        }
        if (files.length == 0) {
            System.out.println("The Directory is Empty\n");
            return;
        }
        for (String pathname : files) {
            System.out.println(pathname);
        }
    }

    public void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public void searchForFile(String fileName) {
        File file = new File(currentDir);
        String [] files = file.list();

        if (files == null) {
            System.out.println("There is something Wrong!!\n");
            return;
        }
        if (files.length == 0) {
            System.out.println("The Directory is Empty\n");
            return;
        }

        for (String pathname : files) {
            if(Objects.equals(fileName, pathname)) {
                System.out.println("Found the file: " + fileName);
                break;
            }
        }
    }
    private String [] fetchFiles() {

        File file = new File(currentDir);
        String [] files = file.list();

        if (files == null) {
            System.out.println("There is something Wrong!!\n");
            return null;
        }

        if (files.length == 0) {
            System.out.println("The Directory is Empty\n");
            return new String[]{};
        }

        return files;
    }
}
