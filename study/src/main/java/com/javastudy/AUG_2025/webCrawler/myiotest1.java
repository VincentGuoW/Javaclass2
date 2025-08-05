package com.javastudy.AUG_2025.webCrawler;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class myiotest1 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        //String boyNameWeb = "https://www.youtube.com/watch?v=xfqBQ2XhBCg&list=RDsVTy_wmn5SU&index=27";
        String boyNameWeb = "https://www.cs.cmu.edu/afs/cs/project/ai-repository/ai/areas/nlp/corpora/names/male.txt";
        String result = webCrawler(boyNameWeb);
        System.out.println(result);
        //test test test
    }

    public static String webCrawler(String inputWeb) throws URISyntaxException, IOException {
        StringBuilder sb = new StringBuilder();
        URI uri = new URI(inputWeb);
        URL url = uri.toURL();
        //get detail info for the website:
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
