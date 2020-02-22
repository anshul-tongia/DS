package ds.array;

import org.junit.Assert;
import org.junit.Test;

public class TestAnagram {

    @Test
    public void test() {
        boolean result = Anagram.isAnagram("AB", "BAB");
        Assert.assertFalse(result);
        result = Anagram.isAnagram("ABBABABABABABAB", "AAAAAAABBBBBBBB");
        Assert.assertTrue(result);
    }

    @Test
    public void test1() {
        boolean result = Anagram.isAnagram("ABBBBB", "AAABBB");
        Assert.assertFalse(result);
        result = Anagram.isAnagram("AAAAAAAAABBBBBBBBAA", "AAAAAAAAAAABBBBBBBB");
        Assert.assertTrue(result);
    }
}
