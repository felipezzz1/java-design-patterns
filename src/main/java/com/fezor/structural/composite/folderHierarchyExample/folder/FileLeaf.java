package main.java.com.fezor.structural.composite.folderHierarchyExample.folder;

public class FileLeaf implements FileSystem{
    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("File: " + name);
    }
}
