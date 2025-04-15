/*
* File: Store.java
* Author: Ónodi András Péter
* Copyright: 2025, Ónodi András Péter
* Group: Szoft II-2-N
* Date: 2025-04-15
* Github: https://github.com/AndrasOnodi/
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Store {
    
    public static void SaveResults(String results) {
        try{
            trySaveResults(results);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void trySaveResults(String results) throws IOException {
        FileWriter fw = new FileWriter("results.txt");
        fw.write(results);
        fw.close();
    }
}
