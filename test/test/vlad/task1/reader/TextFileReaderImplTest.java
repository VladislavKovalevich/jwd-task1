package test.vlad.task1.reader;

import by.vlad.task1.exceptions.ReaderException;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TextFileReaderImplTest {
    private TextFileReader textFileReader;

    @BeforeClass
    public void init(){
        textFileReader = new TextFileReaderImpl();
    }

    @DataProvider(name = "fileReader")
    public Object[][] createData(){
        return new Object[][]{{"resource\\array.txt", " -1 , 5 ,  2  , -6"}};
    }

    @Test(dataProvider = "fileReader")
    public void testReadDataFromFile(String path, String expected) throws ReaderException {
        String actual = textFileReader.readArrayFromFile(path);
        Assert.assertEquals(actual, expected);
    }
}
