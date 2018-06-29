package com.didispace;

import java.io.*;
import java.util.List;

/**
 * Created by zhouk-d on 2018/6/29 0029.
 */
public class StreamDemo {

        public static byte[] getBytesFromFile(File file) throws IOException {
            InputStream is = new FileInputStream(file);
            long length = file.length();
            if (length > Integer.MAX_VALUE) {
               return null;
            }
            byte[] bytes = new byte[(int) length];
            int offset = 0;
            int numRead = 0;
            while ((offset < bytes.length) && ((numRead = is.read(bytes, offset, bytes.length - offset)) >= 0)) {
                offset += numRead;
            }
            if (offset < bytes.length) {
                throw new IOException("Could not completely read file " + file.getName());
            }
            is.close();
            return bytes;
        }


    public static byte[] getBytesFromFile1(File file) throws IOException {
        try(InputStream is = new FileInputStream(file)) {
            long length = file.length();
            if (length > Integer.MAX_VALUE) {
                return new byte[0];
            }
            byte[] bytes = new byte[(int) length];
            int offset = 0;
            int numRead = 0;
            while ((offset < bytes.length) && ((numRead = is.read(bytes, offset, bytes.length - offset)) >= 0)) {
                offset += numRead;
            }
            if (offset < bytes.length) {
                throw new IOException("Could not completely read file " + file.getName());
            }
            return bytes;
        }

    }
}
