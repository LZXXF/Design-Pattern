package com.cl.composite;

import java.util.ArrayList;
import java.util.List;

//Component: abstract file
public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("image file" + name);
    }
}


class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("text file" + name);
    }
}

class Folder implements AbstractFile {
    private String name;
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        list.add(file);
    }
    public void remove(AbstractFile file) {
        list.remove(file);
    }
    public AbstractFile get(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("folder" + name);

        for (AbstractFile file : list) {
            file.killVirus();
        }
    }
}