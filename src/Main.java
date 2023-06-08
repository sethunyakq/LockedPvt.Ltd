import java.util.*;

public class Main {
    private static final String DIRECTORY_PATH = "C:/LockedMe/Files/";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayWelcomeScreen();
        handleUserInput();
        scanner.close();
    }

    private static void displayWelcomeScreen() {
        System.out.println("******************************************");
        System.out.println("*********** Welcome to LockedMe.com *******");
        System.out.println("*********** Developer: Sethunya Karabelo Quinton **********");
        System.out.println("******************************************");
    }

    private static void handleUserInput() {
        int choice = 0;
        do {
            displayMenuOptions();
            choice = getUserChoice();
            switch (choice) {
                case 1:
                    displayFilesInAscendingOrder();
                    break;
                case 2:
                    addFile();
                    break;
                case 3:
                    deleteFile();
                    break;
                case 4:
                    searchFile();
                    break;
                case 5:
                    System.out.println("Closing the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    private static void displayMenuOptions() {
        System.out.println("\n*********** Menu Options ************");
        System.out.println("1. Retrieve file names in ascending order");
        System.out.println("2. Add a file to the directory");
        System.out.println("3. Delete a file from the directory");
        System.out.println("4. Search a file in the directory");
        System.out.println("5. Close the application");
        System.out.println("*************************************");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private static void displayFilesInAscendingOrder() {
        List<String> files = getFilesFromDirectory();
        if (files.isEmpty()) {
            System.out.println("The directory is empty.");
        } else {
            Collections.sort(files);
            System.out.println("Files in ascending order:");
            for (String file : files) {
                System.out.println(file);
            }
        }
    }

    private static List<String> getFilesFromDirectory() {
        // Implement logic to retrieve file names from the directory
        // You can use java.io.File or java.nio.file.Path classes
        // and listFiles() or DirectoryStream to achieve this
        // Example: File[] files = new File(DIRECTORY_PATH).listFiles();
        // Convert the File[] to a List<String> and return
        return new ArrayList<>(); // Placeholder
    }

    private static void addFile() {
        System.out.print("Enter the file name to add: ");
        String fileName = scanner.next();
        // Implement logic to add the file to the directory
        // You can use java.io.File or java.nio.file.Path classes
        // and createNewFile() or Files.createFile() to achieve this
        // Example: File file = new File(DIRECTORY_PATH + fileName);
        // file.createNewFile();
        System.out.println("File added successfully.");
    }

    private static void deleteFile() {
        System.out.print("Enter the file name to delete: ");
        String fileName = scanner.next();
        // Implement logic to delete the file from the directory
        // You can use java.io.File or java.nio.file.Path classes
        // and delete() or Files.delete() to achieve this
        // Example: File file = new File(DIRECTORY_PATH + fileName);
        // file.delete();
        System.out.println("File deleted successfully.");
    }

    private static void searchFile() {
        System.out.print("Enter the file name to search: ");
        String fileName = scanner.next();
        // Implement logic to search the file in the directory
        // You can use java.io.File or java.nio.file.Path classes
        // and exists() or Files.exists() to achieve this
        // Example: File file = new File(DIRECTORY_PATH + fileName);
        // boolean exists = file.exists();
        boolean fileFound = false; // Placeholder
        if (fileFound) {
            System.out.println("File found in the directory.");
        } else {
            System.out.println("File not found in the directory.");
        }
    }
}