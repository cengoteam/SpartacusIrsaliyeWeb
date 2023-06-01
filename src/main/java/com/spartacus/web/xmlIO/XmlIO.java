package com.spartacus.web.xmlIO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class XmlIO {
    public static void writeXml(String xml, String path, String fileName) throws IOException {
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path + fileName), StandardCharsets.UTF_8));
        try {
            out.write(xml);
        } finally {
            out.close();
        }
    }

    public static String readFileToString(String path) throws IOException{
        InputStream inStream = new FileInputStream(path);
        return getStringFromInputStream(inStream);
    }

    public static String getStringFromInputStream(InputStream inStream) throws IOException {
        Reader in = new InputStreamReader(inStream, StandardCharsets.UTF_8);
        int bufferSize = 1024;
        char[] buffer = new char[bufferSize];
        StringBuilder out = new StringBuilder();
        for (int numRead; (numRead = in.read(buffer, 0, buffer.length)) > 0; ) {
            out.append(buffer, 0, numRead);
        }

        return out.toString();
    }

}
