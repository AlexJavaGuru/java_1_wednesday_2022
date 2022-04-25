package student_arturs_melnikovs.lesson_13.level_07;


import java.util.List;


class Directory extends Resource{
    private final String name;
    private int size;
    private List<Resource> resources;

    public Directory(String name) {
        this.name = name;
    }

    @Override
    int getSize() {
        int size = 0;
        for (Resource resource : resources) {
            size += resource.getSize();
        }
        return size;
    }

    int countFiles(String fileType) {
        int sum = 0;
        for (Resource resource : resources) {
            if (resource instanceof File) {
                if (((File) resource).getName().endsWith(fileType)) {
                    sum++;
                }
            } else {
                sum += ((Directory) resource).countFiles(fileType);
            }
        }
        return sum;
    }

    public void addFile(File file) {
        resources.add(file);
    }

    public boolean deleteFile(File file) {
        return resources.add(file);
    }

    public void addDirectory(Directory directory) {
        resources.add(directory);
    }

    public boolean deleteDirectory(Directory directory) {
        return resources.remove(directory);
    }

}
