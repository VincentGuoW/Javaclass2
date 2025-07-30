package com.javastudy.JULY_2025.IOClass.IOClass17;

import java.io.File;
import java.io.FileInputStream;
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

        String startFolderName = inputFolder.getName();
        zipTheFolder(inputFolder, zos, startFolderName);

        zos.close();
    }

    public static void zipTheFolder(File inputFolder, ZipOutputStream zos, String startFolderName) throws IOException {
        File[] files = inputFolder.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry ze = new ZipEntry(startFolderName + "\\" + file.getName());
                zos.putNextEntry(ze);   //start write into the zipentry
                FileInputStream fis = new FileInputStream(file);
                //Open another stream
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                zipTheFolder(file, zos, startFolderName + "\\" + file.getName());
            }
        }

    }

}
