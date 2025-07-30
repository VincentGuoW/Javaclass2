package com.javastudy.AUG_2025.webCrawler;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class myiotest1 {
    public static void main(String[] args) {
        String boyNameWeb = "https://www.cs.cmu.edu/afs/cs/project/ai-repository/ai/areas/nlp/corpora/names/male.txt";
    }

    public static String webCrawler(String inputWeb) throws URISyntaxException, IOException{
        StringBuilder sb = new StringBuilder();
        URI uri = new URI(inputWeb);
        URL url = uri.toURL();
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch=isr.read())!=-1) { 
            (char)ch;
        }
        return sb.toString();
    }
}
