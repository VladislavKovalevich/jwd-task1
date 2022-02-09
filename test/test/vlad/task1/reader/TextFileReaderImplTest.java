package test.vlad.task1.reader;

import by.vlad.task1.exception.ReaderException;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TextFileReaderImplTest {
    private TextFileReader textFileReader;

    @BeforeClass
    public void init(){
        textFileReader = new TextFileReaderImpl();
    }

    @DataProvider(name = "fileReader")
    public Object[][] createData(){
        return new Object[][]{{"resource\\array.txt", Arrays.asList(" -1 ,"," 5 ,"," 2  ,"," -6")}};
    }

    @Test(dataProvider = "fileReader")
    public void testReadDataFromFile(String path, List<String> expected) throws ReaderException {
        List<String> actual = textFileReader.readArrayFromFile(path);
        Assert.assertEquals(actual, expected);
    }
}