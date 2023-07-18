package com.simplify.que2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogAnalyzer {
    public static void main(String[] args) {
        String logFile = "C:\\Users\\RAJAT\\Desktop\\projectSimplify\\Simplify360_Assignment\\Assessment\\src\\com\\simplify\\que2\\trace.log";
        String targetJob = "J1";
        String targetTimestamp = "2023-06-29 04:04:04";

        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date targetDate = dateFormat.parse(targetTimestamp);
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ", 4);
                String logTimestamp = parts[0] + " " + parts[1];

                if (parts.length == 4 && parts[2].equals(targetJob)) {
                    Date logDate = dateFormat.parse(logTimestamp);
                    if (logDate.after(targetDate)) {
                        System.out.println(line);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("No log entry found for " + targetJob + " after " + targetTimestamp);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}