public class Main {
    public static void printFileSystem(FileSystem fileSystem, String indent) {
        System.out.println(indent + fileSystem.getName() + " (" + fileSystem.getSize() + ")");
        if (fileSystem instanceof Directory) {
            for (FileSystem child : ((Directory) fileSystem).files) {
                printFileSystem(child, indent + "  ");
            }
        }
    }
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");

        File file1 = new File("file1", 100);
        File file2 = new File("file2", 200);
        File file3 = new File("file3", 300);

        user.addFile(file1);
        user.addFile(file2);
        home.addFile(user);
        home.addFile(file3);
        root.addFile(home);

        printFileSystem(root, "");
    }
}