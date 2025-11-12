package main.java.com.fezor.structural.composite.folderHierarchyExample;

import main.java.com.fezor.structural.composite.folderHierarchyExample.folder.DirectoryComposite;
import main.java.com.fezor.structural.composite.folderHierarchyExample.folder.FileLeaf;

public class Main {
    public static void main(String[] args) {
        DirectoryComposite root = new DirectoryComposite("root");
        DirectoryComposite images = new DirectoryComposite("images");

        root.add(new FileLeaf("readme.md"));
        images.add(new FileLeaf("photo.png"));

        root.add(images);
        root.show();
    }
}
