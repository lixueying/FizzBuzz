package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_number_is_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.formatFizzBuzz(6);

        //then
        assertEquals(actual,"Fizz");
    }

    @Test
    public void should_return_buzz_when_number_is_multiple_of_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.formatFizzBuzz(10);

        //then
        assertEquals(actual,"Buzz");
    }

    @Test
    public void should_return_whizz_when_number_is_multiple_of_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.formatFizzBuzz(14);

        //then
        assertEquals(actual,"Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_number_is_multiple_of_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.formatFizzBuzz(15);

        //then
        assertEquals(actual,"FizzBuzz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_number_is_multiple_of_3_and_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.formatFizzBuzz(105);

        //then
        assertEquals(actual,"FizzBuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_number_is_include_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.formatFizzBuzz(30);

        //then
        assertEquals(actual,"Fizz");
    }
}
