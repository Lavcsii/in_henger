/*
* File: Storage.java
* Author: Fazekas Laura
* Copyright: 2025, Fazekas Laura
* Group: Szoft I-N
* Date: 2025-05-25
* Github: https://github.com/Lavcsii/
* Licenc: MIT
 */
package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {

    public static void writeFile(String line) {
        try {
            tryWriteFile(line);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void tryWriteFile(String line) throws IOException {
        FileWriter fw = new FileWriter("adat.txt", true);
        fw.write(line);
        fw.write("\n");
        fw.close();
    }
}
