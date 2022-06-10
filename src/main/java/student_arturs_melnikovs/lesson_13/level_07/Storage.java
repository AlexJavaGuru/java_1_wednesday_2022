package student_arturs_melnikovs.lesson_13.level_07;

class Storage {
    Directory rootDirectory;

    public Directory rootDirectory() {
        return new Directory("/");
    }

    public int totalSize() {
        return rootDirectory().getSize();
    }

    public int totalMP3() {
        return rootDirectory().countFiles("mp3");
    }
}
