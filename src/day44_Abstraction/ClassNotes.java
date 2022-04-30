package day44_Abstraction;

public class ClassNotes {

    /*

    An abstract class is a class that is declared abstract—it may or may not include abstract methods.
    Abstract classes cannot be instantiated, but they can be subclassed.

An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon),
If a class includes abstract methods, then the class itself must be declared abstract,
 When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.
 However, if it does not, then the subclass must also be declared abstract.


 Technically, instantiation is the process of creating an instance of a class.
 The class serves as a blueprint for building an object, and it also includes a constructor for doing the actual construction.
 You instantiate a class by invoking its constructor with the new keyword.
    Java Day44
Topics: Abstraction Continue
				Interface Intro

Package name: day44_Abstraction

Warmup task:
	Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a cosntructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake


OOP Abstraction: concentrating on essentials (what it is), not worrying about the details/implementation (how it's done)

		Abstract method: A method without the implementation/body

							meant to be overridden

				area();
				perimeter();
				...
				eat();
				..

		2 ways to achieve the abstraction:
				1. Abstract class
				2. Interface



		Abstract class: meant to be super class (parent)
						can not be final
						Not concrete ( can not create object)

						can have all the methods, variables, and blocks of non-abstract class + abstract methods



Animal Task:
	interface Swimmable:
		swim()

	interface Flyable:
		 fly();

	Interface Wild:
		hunt();

	interface Plyable:
		play();

	Abstract Animal:
		 eat()
		 drink()



   Dog extends Animal implemnts Plyable, Swimmable

   Cat extends Animal implemnts Plyable

   Cow extends Animal implemnts Plyable

   Horse extends Animal implemnts Plyable

   Parrot extends Animal implemnts Plyable, Flyable

   Tiger extends Animal implements Wild

   Lion extends Animal implements Wild

   Eagle extends Animal implements Wild, Flyable

   Falcon extends Animal implements Wild, Flyable

   Dolphin extends Animal implemnts Plyable, Swimmable

   Shark extends Animal implements Wild, Swimmable

   Duck extends Animal implements Swimmable, Flyable, Plyable

   Java extends Animal implements Swimmable, Flyable, Plyable, Wild

   ...



Person implements Swimmable, Plyable

Boat implements Swimmable

Airplane implemnts Flyable

CydeoCar implements Swimmable, Flyable
     */
}
