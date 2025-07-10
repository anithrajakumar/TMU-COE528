package lab4;

/**
 *
 * @Anith Rajakumar
 */

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Record {
    //creating an instance of record
    private static Record instance;
    
    //constructor
    public Record() {
    }
    
    public static Record getInstance()
    {
        if (instance == null){
            instance = new Record();
        }
        return instance;
    }
    
    public static void read() {
        //Trying to open a file
        try {
            //opening file
            File recordFile = new File("record.txt");
            //adding the reader to the file
            Scanner reader = new Scanner(recordFile);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            //closing reader
            reader.close();
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public static void write(String text) {
        try {
            File recordFile = new File("record.txt");
            //creating the writer and adding it to the file
            FileWriter myWriter = new FileWriter(recordFile, true);
            myWriter.write(text);
            myWriter.close();
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
    
        Record r = Record.getInstance();

        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " +
        "contains the following lines:");
        r.read();
    }
}
