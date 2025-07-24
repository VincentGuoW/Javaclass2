package com.javastudy.JULY_2025.IOClass.IOClass17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDemo2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File inputFolder = new File(
                "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass17\\TestDemoFolder");
        File outputFolder = inputFolder.getParentFile();
        File zipFolder = new File(outputFolder, inputFolder.getName() + ".zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFolder));

        zos.close();
    }

    public static void zipTheFolder(File inputFolder, ZipOutputStream zos, String name) {
        ZipEntry ze = new ZipEntry(inputFolder.getName());

    }

}
