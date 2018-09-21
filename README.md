# Refactoring AberMovies
This code is used in an exercise on the module CS31310 Agile Methodologies and on Software Quality Assurance and Testing at the Software College in NEU.

The project uses the maven build tool.

## Command Line
If you prefer to work at the command line, you will need to download JUnit. We are using JUnit 5 on this project. 

## Example code for the end of Part 1
Example code is included to show the result of following the refactorings as part of this exercise. 

## About this code
The code in this repository is an evolution of the example for Movie Rentals in Chapter 1 of the [Refactoring](https://martinfowler.com/books/refactoring.html) book by Martin Fowler. Some of the Java syntax has been updated and tests have been added. Further, the example has been changed from just rentals to allow purchases too, aiming to represent an online store. The concept of High Definition and Standard Definition movies has also been included. 

## About Part 2 of the exercise
Part 2 of the workshop on Refactoring asks you to think about the use of polymorphism in the example. As a result of the change to allow a Movie Version (HD and SD) and the concept of Purchase and Rental, this code has broken the elegant use of a strategy pattern that is discussed by Martin Fowler. Rather than rework the code for this year, you are invited to read the second part of Chapter 1 in the refactoring book for Fowler's discussion of the strategy pattern.
