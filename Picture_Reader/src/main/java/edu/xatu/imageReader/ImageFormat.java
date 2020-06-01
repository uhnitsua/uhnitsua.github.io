package edu.xatu.imageReader;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class  ImageFormat {

    public static String getFormatInFile(File f) {
        return getFormatName(f);
    }

    private static String getFormatName(Object o) {
        try {
            ImageInputStream iis = ImageIO.createImageInputStream ( o );

            Iterator <javax.imageio.ImageReader> iter = ImageIO.getImageReaders ( iis );
            if (!iter.hasNext ()) {
                return null;
            }

            javax.imageio.ImageReader reader = (ImageReader) iter.next ();

            iis.close ();
            return reader.getFormatName ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return null;
    }
}
