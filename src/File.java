public class File implements FileSystem{
    String name;
    long size;
    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getSize() {
        return this.size;
    }
}
