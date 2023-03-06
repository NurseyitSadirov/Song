import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Text.txt")) {
            fileWriter.write("""
                    Tittle:  Nothing else matters
                    Author: Metallica
                    
               
                    Text: So close, no matter how far
                     Couldn't be much more from the heart 
                     Forever trusting who we are And nothing else matters
                     Never opened myself this way 
                     Life is ours, we live it our wau 
                     All these words 
                     I don't just say And nothing else matters""");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Song song = new Song();
        try (FileReader fileReader = new FileReader("Text.txt")) {
            Scanner scanner = new Scanner(fileReader);
            byte a = 0;
            while (scanner.hasNextLine()) {
                a++;
                if (a <= 1) {
                    song.setAuthor(scanner.nextLine());
                    System.out.println(song.getAuthor());
                } else if (a <= 2) {
                    song.setTittle(scanner.nextLine());
                    System.out.println(song.getTittle());
                }
                String str  = " ";
                str = scanner.nextLine();
                song.setText(str);
                System.out.println(song.getText());
                fileReader.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}