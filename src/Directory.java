import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String name;
    List<FileSystem> files;
    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getSize() {
        long size = 0;
        for (FileSystem file : files) {
            size += file.getSize();
        }
        return size;
    }

    public void addFile(FileSystem file) {
        this.files.add(file);
    }

}
