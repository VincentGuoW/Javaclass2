package com.javastudy.JULY_2025.IOClass.IOClass15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipSteamDemo {
    public static void main(String[] args) throws IOException {
        File targetFile = new File(
                "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass15\\TestFile\\SampleZ.zip");
        File targetLocation = new File(
                "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass15\\TestFile");

        ZipInputStream zis = new ZipInputStream(new FileInputStream(targetFile));
        ZipEntry ze = zis.getNextEntry();
        ZipEntry ze1 = zis.getNextEntry();
        ZipEntry ze2 = zis.getNextEntry();
        ZipEntry ze3 = zis.getNextEntry();
        ZipEntry ze4 = zis.getNextEntry();
        System.out.println(ze);
        System.out.println(ze1);
        System.out.println(ze2);
        System.out.println(ze2);
        System.out.println(ze3);
        System.out.println(ze4);

    }
}
