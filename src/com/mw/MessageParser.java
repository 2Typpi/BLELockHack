package com.mw;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MessageParser {

    public MessageParser() {
    }

    private boolean checkForFile(String path) {
        File f = new File(path);
        if (f.exists() && !f.isDirectory()) {
            return true;
        }
        return false;
    }

    public List<String> getMessages(String filePath) {
        List<String> messages = new ArrayList<String>();
        if (!checkForFile(filePath)) {
            System.err.println("File not found!");
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null){
                messages.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (messages.size() != 5) {
            System.err.println("Not enough messages found! There must be 5 messages.");
            return null;
        }

        return messages;
    }

}
