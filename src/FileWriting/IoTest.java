package FileWriting;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.spec.ECField;
import java.util.Scanner;
import java.util.stream.Stream;

public class IoTest {

    public static void readContentOfFile(String filename) throws Exception{
        int i;
        FileInputStream fin = null;
        fin = new FileInputStream(filename);
        do{
            i = fin.read();
            if(i != -1) {
                System.out.println((char) i);
            }
            }while (i != -1);

            if(fin != null){
                fin.close();
            }
    }

    public static void readContentOfFileV2(String filename)throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        String s;
        while ((s=bufferedReader.readLine()) != null){
            System.out.println(s);
        }
        bufferedReader.close();
    }

    public static void readContentOfFileV3(String filename)throws Exception{
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s;
        while ((s= bufferedReader.readLine()) != null){
            System.out.println(s);
        }
        fileReader.close();
    }

    public static void readContentOfFileV4(String filename)throws Exception{
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void readContentOfFileV5(String filename) throws Exception
    {
        Stream<String> stream = Files.lines(Paths.get(filename));
        stream.forEach(System.out::println);
        stream.close();
    }

    public static void writeToFileV1(String filename)throws Exception{
        FileOutputStream fout = null;
        fout = new FileOutputStream( filename );
        String toWrite = "HELLO";
        fout.write( toWrite.getBytes() );
        fout.close();
    }

    public static void writeToFileV2(String filename) throws Exception {
        FileWriter writer = new FileWriter(filename);
        String toWrite = "Hallo";
        writer.write( toWrite );
        writer.close();
    }

}