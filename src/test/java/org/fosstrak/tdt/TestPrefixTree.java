package org.fosstrak.tdt;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestPrefixTree {
    @Test
    public void testOne() {

        PrefixTree<String> pt = new PrefixTree<String>();

        pt.insert("123456", "hello");
        pt.insert("131313", "there");
        pt.insert("123456", "funny");

        List<String> expect = (List<String>) Arrays.asList(new String[]{
                "hello", "funny"});

        List<String> test = pt.search("123456789");
        Assert.assertEquals(expect, test);

        expect = Arrays.asList(new String[]{
                "there"});

        test = pt.search("13131313");
        Assert.assertEquals(expect, test);

        expect = Arrays.asList(new String[0]);
        test = pt.search("15131313");
        Assert.assertEquals(expect, test);
    }
}