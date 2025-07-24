package com.javastudy.JULY_2025.IOClass.IOClass16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDemo2 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File(
                "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass16\\ZipDemoT.txt");
        File outputLocation = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass16");
        toZipFile(inputFile, outputLocation);
    }

    public static void toZipFile(File inputFile, File outputLocation) throws FileNotFoundException, IOException {
        ZipOutputStream zos = new ZipOutputStream(
                new FileOutputStream(new File(outputLocation, inputFile.getName() + ".zip")));

        // From now need new for every entry.
        ZipEntry ZEntry = new ZipEntry(inputFile.getName());

        zos.putNextEntry(ZEntry);// let zipStream know we are going to input this Entry

        FileInputStream fis = new FileInputStream(inputFile);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        // end every entry
        zos.close();
        // end when all done

        // 1.14mb --> 924kb
    }
}
