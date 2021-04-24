package com.sample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
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
    
}
