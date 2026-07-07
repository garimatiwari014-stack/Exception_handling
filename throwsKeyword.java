import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Readandwrite
{

    void readFile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("test.txt");
    }
    void saveFile() throws FileNotFoundException
    {
        String txt = "Hello World";
        FileOutputStream fos = new FileOutputStream("test.txt");

    }
}