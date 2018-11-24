package com.cl.composite;

public class Client {

    public static void main(String[] args) {

        AbstractFile f2, f3, f4;
        Folder f1 = new Folder("My Favorates");

        f2 = new ImageFile("image1");
        f3 = new TextFile("text file");
        f1.add(f2);
        f1.add(f3);

        Folder f11 = new Folder("movies");
        f4 = new ImageFile("sky.img");
        f11.add(f4);
        f1.add(f11);
        f1.killVirus();

    }
}
