

package com.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;


@RunWith(Categories.class)
@Categories.IncludeCategory(Complicated.class)
@Suite.SuiteClasses(AppTest.class)
    public class ComplicatedTest  {

    }
