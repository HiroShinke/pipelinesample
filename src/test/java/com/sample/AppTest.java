
package com.sample;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
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
    
}
