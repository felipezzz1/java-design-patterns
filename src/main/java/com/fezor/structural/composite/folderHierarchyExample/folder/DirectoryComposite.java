package main.java.com.fezor.structural.composite.folderHierarchyExample.folder;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements FileSystem{
    private String name;
    private List<FileSystem> items = new ArrayList<>();

    public DirectoryComposite(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        items.add(fileSystem);
    }

    @Override
    public void show() {
        System.out.println("Directory: " + name);
        items.forEach(FileSystem::show);
    }
}
