import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) {

        FileInputStream myFile = null;
        FileInputStream myFile2 = null;

        try {
            myFile = new FileInputStream("src/moviesDataSet.csv");
            myFile2 = new FileInputStream("src/moviesDataSet.csv");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not open input file - ending program");
            System.exit(1);
        }

        Scanner fileReader2 = new Scanner(myFile2);
        while(fileReader2.hasNextLine()){
            String data = fileReader2.nextLine();
            System.out.println(data);
        }

        Scanner fileReader = new Scanner(myFile);
        while(fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            String[] arrOfStr = data.split(",");
            System.out.println(arrOfStr[2]);
        }

        fileReader.close();

//       1) Open the given file inside src called moviesDataSet.csv
//       2) Read each row in the dataset
//       3) Print each row to the screen
//       4) Print only the name of the movie
//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub

    }

}