package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;

public class ImageDownloader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cdn.differencebetween.net/wp-content/uploads/2018/02/Difference-Between-Java-and-Core-Java.png");

            try(InputStream inputStream = url.openStream()) {

                OutputStream outputStream = new FileOutputStream("copy.png");

                int i;
                while((i = inputStream.read()) != -1){
                    outputStream.write(i);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
