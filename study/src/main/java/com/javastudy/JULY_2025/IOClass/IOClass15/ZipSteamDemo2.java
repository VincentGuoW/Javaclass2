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
                // ===============================
                creatFolder.mkdirs();// use mkdirs not mkdir (end with '/' or not)
                // prevent some zip file end with "xxx/xxx/"
                // creatFile ==> creatFile.mkdir();
            } else {
                File creatFile = new File(targetLocation, ZEntry.toString());
                // FileWriter fw = new FileWriter(creatFile);
                // fw.close();
                FileOutputStream fos = new FileOutputStream(creatFile);
                int b;
                while ((b = zis.read()) != -1) {
                    fos.write(b);
                    /*
                     * why write() not writeObject() / PrintWriter() / ObjectOutputSteam()
                     * write()
                     * ==>copy byte, most common way to copy file
                     * 
                     * writeObject()
                     * ==>Need"Serializable" , can't use on .txt / .png file
                     * 
                     * PrintWriter()
                     * ==>use for write string, not copy byte file E.g. picture
                     * 
                     * ObjectOutputSteam()
                     * ==>use on java
                     */
                }
                fos.close();
                zis.closeEntry();// Last file, no folder, entire entry done

            }

        }
        zis.close();// close after everything is done.
    }
}
