import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    public void test2008(){
        assertEquals(LocalDate.parse("2008-03-23"), LocalDate.parse(Calculator.calculate(2008)));
    }
    @Test
    public void test2024(){
        assertEquals(LocalDate.parse("2024-03-31"), LocalDate.parse(Calculator.calculate(2024)));
    }
    @Test
    public void test2018(){
        assertEquals(LocalDate.parse("2018-04-01"), LocalDate.parse(Calculator.calculate(2018)));
    }
    @Test
    public void test2285(){
        assertEquals(LocalDate.parse("2285-03-22"), LocalDate.parse(Calculator.calculate(2285)));
    }
    @Test
    public void test2160(){
        assertEquals(LocalDate.parse("2160-03-23"), LocalDate.parse(Calculator.calculate(2160)));
    }
}