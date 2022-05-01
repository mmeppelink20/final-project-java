# final-project-java

This is the final project for my CIS-171 Java course at Kirkwood Community College. Below is a journal of all the things I learned throughout the class.

## Introduction

In the introduction of **Java CIS-171** we setup and learned how to use a program called Git to upload files to GitHub. Additionally, we learned how to use markdown. Learning how to use Git was entirely new to me, but I already had quite a bit of experience using markdown. Although I did learn a few new things in class about markdown such as embedding images in a file like so:

![Kirkwood Community College](https://www.kirkwood.edu/images/cehomepage/ceheader_kirkwood.png)


instructions for uploading to GitHub

1. git add [filename] README.md
1. git status
1. git commit -m "changes made to files"
1. git push origin main


## Chapter 1

in Chapter 1 of **Java CIS-171** we learned about some of the java fundamentals. this includes things like basic arithmetic operators, boolean operators, conditional statements, try/catch statements, for loops, using the Scanner class to get input, etc. . This all came quite easily to me, as I am already quite familiar with Java. 

## Chapter 2

in Chapter 2, titled "Data Types and Operators, of **Java CIS-171** we went over a variety of things, the most notable among them are; the Math class, char data type, boolean data type, escape characters, modular division, logical operators, and casting. These topics weren't particularly difficult for me to understand as I've previously learned them.

## Chapter 3

in chapter 3, titled "Control Statements" of **JAVA CIS-171** we went over several logical operators in Java. We went over ifs, elseifs, dates, switches, for loops, while loops, do while loops, nested loops. In addition to the aforementioned, we also learned about the LocalDate class, which has to deal with formatting and using date objects and carrying out calculations using dates. Aside from the LocalDate class, which I had previously not been exposed to, I had no difficulty understanding these concepts, as they're all things I already had quite a lot of exposure to.

## Chapter 4

in chapter 4, titled "Classes, Objects, and Methods" of **JAVA CIS-171** we discussed the aforementioned, as well as things related to these topics; such things included: reference variables and assignments, methods, return values, method parameters, method return types, constructuors, parameterized constructors, public and private access levels, accessor methods, and how to create objects. I had no difficulty understanding these concepts, as they're all things I already had quite a lot of exposure to or had learned in a previous or concurrent class.

## Chapter 5

In chapter 5, titled "Arrays and String Operators" of **JAVA CIS-171** we learned about one dimensional arrays, max and vin value in an array, ArrayIndexOutOfBoundsException, touched on various sorting algorithms with focus on the bubble sort, found the mean, meadian and mode of an array, two dimensional arrays, how array copies work, for-each loops, search algorithms, String arrays, and the ternary operator. I had previous exposure exposure to all of these concepts except search algorithms and the ternary operator. I'm not really a huge fan of the ternary operator as I thinks it's a little overly copmlicated, and harder to read than its counterparts.

+Star ship    | 
|---------|
-shipType: String<br>-maxSpeed: Double<br>-hyperDrive: Bool|
<<create>> +StarShip()<br><<create>> +StarShip(shipType: String, maxSpeed: Double, hyperDrive: Bool)<br>+getShipType(): String<br>+setShipType(shipType: String): void<br>-validateShipType(shipType: string): void<br>+getMaxSpeed(): Double<br>+setMaxSpeed(maxSpeed: Double): void<br>-validateMaxSpeed(maxSpeed: Double): void<br>+isHyperDrive(): Bool<br>+setHyperDrive(hyperDrive: Bool): void<br>+toString(): String<br>+compareTo(other: StarShip): int|



+Airplane |
|---------|
-airplaneName: String<br>-manufacturerName: Manufacturer<br>-maxAirSpeed: int
<<create>> +Airplane()<br><<create>> +Airplane(airplaneName: String, manufacturerName: Manufacturer, maxAirSpeed: int)<br>-validateAirplane(): void<br>+getAirplaneName(): String<br>+ setAirplaneName(): void<br>-validateAirSpeed(): void<br>+getAirSpeed(): int<br>+ setAirSpeed(): void<br>-validateManufacturer(): void<br>+getAirplaneManufacturer(): Manufacturer<br>+ setAirplaneManufacturer(): void<br>+ toString(): String<br>+ compareTo: Airplane

+FighterJet |
|---------|
-airplaneName: String<br>-manufacturerName: Manufacturer<br>-maxAirSpeed: int
<<create>> +FighterJet()<br><<create>> +FighterJet(fighterJetName: String, numMissiles: int, manufacturerName: Manufacturer, maxAirSpeed: int)<br>-validateNumMissiles(): void<br>+getMissileCount(): int<br>+setNumMissiles(): void

+Manufacturer |
|---------|
-manufacturer: String
<<create>>+Manufacturer()<br><<create>>+Manufacturer(manufacturer: String)<br>+getManufacturer(): String<br>setManufacturer(Manufacturer: String): void<br>-validateManufacturer(Manufacturer: String): void<br>+toString(): String<br>+compareTo(o: Manufacturer): int