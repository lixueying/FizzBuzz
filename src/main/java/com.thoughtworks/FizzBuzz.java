package com.thoughtworks;

class FizzBuzz {

    String formatFizzBuzz(int number) {

        if (number % 3 == 0 & number % 5 == 0 & number % 7 == 0) {
            return "FizzBuzzWhizz";
        }

        if (!isContain7(number)) {
            if (number % 5 == 0 & number % 7 == 0) {
                return "BuzzWhizz";
            }

            if (isContain3(number)) {
                return "Fizz";
            }

            if (number % 3 == 0 & number % 5 == 0) {
                return "FizzBuzz";
            }

            if (number % 5 == 0) {
                return "Buzz";
            }
        }

        if (number % 7 == 0) {
            return "Whizz";
        }

        return "Fizz";
    }

    boolean isContain3(int number) {
        return String.valueOf(number).contains("3");
    }

    boolean isContain7(int number) {
        return String.valueOf(number).contains("7");
    }
}
