package com.javastudy.JULY_2025.IOClass.IOClass15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipSteamDemo2 {
    public static void main(String[] args) throws IOException {
        File targetFile = new File(
                "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass15\\TestFile\\SampleZ.zip");
        File targetLocation = new File(
                "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass15\\TestFile");

        ZipFileMethod(targetFile, targetLocation);

    }

    public static void ZipFileMethod(File targetFile, File targetLocation) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(targetFile));
        ZipEntry ZEntry;
        while ((ZEntry = zis.getNextEntry()) != null) {
            if (ZEntry.isDirectory()) {
                File creatFolder = new File(targetLocation, ZEntry.toString());
                // Must use toString, not get name==> we need the root
                // toString() ==> "images/icons/logo.png"
                // getName() ==> "logo.png"
                creatFolder.mkdir();
                // creatFile ==> creatFile.mkdir();
            } else {
                File creatFile = new File(targetLocation, ZEntry.toString());
                // FileWriter fw = new FileWriter(creatFile);
                // fw.close();
                FileOutputStream fos = new FileOutputStream(creatFile);
                int b;
                while ((b = zis.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
            }

        }
    }
}
