
package com.sample;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;
import org.junit.rules.ErrorCollector;
import org.junit.rules.Timeout;

import org.junit.experimental.categories.Category;


import java.io.File;
import java.util.List;
import java.util.Arrays;
import org.apache.commons.io.FileUtils;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Rule
    public TestName name = new TestName();

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Rule
    public Timeout globalTimeout = new Timeout(5000);
    

    /**
     * Rigourous Test :-)
     */
    @Test
    @Category(Simple.class)
    public void testApp()
    {

	App app = new App();
	System.out.println("TEST NAME IS!: " + name.getMethodName());
	assertThat( app.addValues(10,20), is(30) );
	assertThat( app.concatString("a","b"), is("ab"));
    }

    @Test
    @Category(Simple.class)
    public void testAddition()
    {

	App app = new App();
	System.out.println("TEST NAME IS!: " + name.getMethodName());
	assertThat( app.addValues(10,20), is(30) );
	assertThat( app.addValues(10,30), is(40) );
    }

    @Test
    @Category(Simple.class)
    public void testConcatenation()
    {

	App app = new App();
	System.out.println("TEST NAME IS!: " + name.getMethodName());
	assertThat( app.concatString("a","b"), is("ab"));
	assertThat( app.concatString("a","bc"), is("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(Simple.class)
    public void testFail()
    {
	System.out.println("TEST NAME IS!: " + name.getMethodName());
	throw new IllegalArgumentException("something wrong");
    }
    
    @Test
    @Category(Complicated.class)
    public void fileCreatedAndWrittenSuccessfully()  throws IOException {

	System.out.println("TEST NAME IS!: " + name.getMethodName());
	File file = tempFolder.newFile("sample.txt");
	FileUtils.writeStringToFile(file, "JUnit Rocks!");
	String line = FileUtils.readFileToString(file);
	assertThat(line, is("JUnit Rocks!"));
    }


    @Test
    @Category(Simple.class)
    public void variousTest() {

	String s = null;
	collector.checkThat("This must be null", null, is(s));

	s = "abcde";
	collector.checkThat("This must be null", "abcde", is(s));

    }

    @Test
    @Category(Complicated.class)
    public void loopTestFibo(){

	System.out.println("TEST NAME IS!: " + name.getMethodName());

	int values[][] = {
	    {0,0},
	    {1,1},
	    {2,1},
	    {3,2},
	    {4,3},
	    {5,5},
	    {6,8}
	};

	App app = new App();
	
	for (int m[]: values) {
	    int a = m[0];
	    int b = m[1];
	    collector.checkThat(app.fibo(a),is(b));
	}

    }
    
}
