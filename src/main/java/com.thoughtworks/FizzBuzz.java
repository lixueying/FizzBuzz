package com.thoughtworks;

class FizzBuzz {

    String formatFizzBuzz(int number) {

        if(number % 3 == 0 & number % 5 == 0 & number % 7 == 0){
            return "FizzBuzzWhizz";
        }

        if (number % 3 == 0 & number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        if (number % 7 == 0) {
            return "Whizz";
        }

        return "Fizz";
    }
}
