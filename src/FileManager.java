import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class FileManager {
    private final String currentDir = System.getProperty("user.dir");

    public void getFilesInCurrentDir() {
        String[] files = getFilesInDir();
        //sort
        if (files != null) {
            int size = files.length;
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < files.length; j++) {
                    if (files[i].compareTo(files[j]) > 0) {
                        String temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
            for (String pathname : files) {
                System.out.println(pathname);
            }
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
            System.out.println("Could not create the file An error occurred.");
            e.printStackTrace();
        }
    }

    public void deleteFile(String fileName) {
        String[] files = getFilesInDir();
        if (files != null) {
            for (String pathname : Objects.requireNonNull(getFilesInDir())) {
                if (Objects.equals(fileName, pathname)) {
                    File fileToDelete = new File(pathname);
                    if (fileToDelete.delete()) {
                        System.out.println("Deleted the file: " + pathname);
                    } else {
                        System.out.println("Failed to delete the file.");
                    }
                    return;
                }
            }
            System.out.println("No File with this specified name");
        }
    }

    public void searchForFile(String fileName) {
        String[] files = getFilesInDir();
        if (files != null) {
            for (String pathname : Objects.requireNonNull(getFilesInDir())) {
                if (Objects.equals(fileName, pathname)) {
                    System.out.println("Found the file: " + fileName);
                    break;
                }
            }
            System.out.println("File " + fileName + " Does Not Exist in Directory");
        }
    }

    private String[] getFilesInDir() {
        File file = new File(currentDir);
        String[] files = file.list();

        if (files == null) {
            System.out.println("There is something Wrong!!\n");
            return null;
        }
        if (files.length == 0) {
            System.out.println("The Directory is Empty\n");
            return null;
        }
        return files;
    }
}
