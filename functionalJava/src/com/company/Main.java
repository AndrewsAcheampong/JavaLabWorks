package com.company;

import java.util.Optional;

class Message {

    public static void main(String[] args) {
        // write your code here


        Optional<String> check = Optional.ofNullable(null);

        if (check.isPresent()) {

            Message message = null;
            message.print();

        } else {

            System.out.println("There is no value for the print method");
        }

    }

    public String print() {
        return "Hello World";
    }

}


