package com.practice.readinput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContentToAnotherFile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("E:\\jmeter.log")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:\\text2.txt")));
        String x = br.readLine();
        while (x != null) {
            bw.write(x);
            bw.newLine();
            x = br.readLine();
        }
        System.out.println("File Content copied Successfully");
        br.close();
        bw.close();
    }
}
