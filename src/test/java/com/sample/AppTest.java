
package com.sample;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {

	App app = new App();

	assertThat( app.addValues(10,20), is(30) );
	assertThat( app.concatString("a","b"), is("ab"));
    }

    @Test
    public void testAddition()
    {

	App app = new App();

	assertThat( app.addValues(10,20), is(30) );
	assertThat( app.addValues(10,30), is(40) );
    }

    @Test
    public void testConcatenation()
    {

	App app = new App();

	assertThat( app.concatString("a","b"), is("ab"));
	assertThat( app.concatString("a","bc"), is("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFail()
    {
	throw new IllegalArgumentException("something wrong");
    }
    
    @Test
    public void fileCreatedAndWrittenSuccessfully()  throws IOException {
	File file = tempFolder.newFile("sample.txt");
	FileUtils.writeStringToFile(file, "JUnit Rocks!");
	String line = FileUtils.readFileToString(file);
	assertThat(line, is("JUnit Rocks!"));
    }


}
