package com.thoughtworks;

class FizzBuzz {

    String formatFizzBuzz(int number) {

        if (number % 5 == 0) {
            return "Buzz";
        }
//        else if (number % 7 == 0) {
//            return "Whizz";
//        }
        return "Fizz";
    }
}
