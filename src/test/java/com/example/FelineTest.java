package com.example;
import junit.framework.TestCase;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import org.hamcrest.MatcherAssert;

public class FelineTest extends TestCase {
    private final String expected = "Кошачьи";
    private static final int EXPECTED_KITTENS_COUNT = 1;
    private int kittensCount = 5;


    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
             MatcherAssert.assertThat("Неправильный список еды",
                feline.eatMeat(),
                equalTo(feline.getFood("Хищник"))
        );
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
             assertEquals("Ожидаемое семейство не соответствует фактическому",
                expected, actual);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
             assertEquals("Фактическое количество котят не соответствует ожидаемому",
                EXPECTED_KITTENS_COUNT, actual);
    }

    @Test
    public void testTestGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
             assertEquals("Фактическое количество котят не соответствует ожидаемому",
                kittensCount, actual);
    }
}