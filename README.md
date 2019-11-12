# Java Abstraction. introduction.
# What is Java Abstraction.
Java Abstraction code implementation

How we can restrict object creation of any class?

Whenever we want to restrict any class object creation from its sub class etc, then we can declare it using abstract keyword.

Because as per java rules, class with abstract keyword, cannot be instantiated.

Now the next question is, why we need this type of restrictions, rite?

First will share the example and then we will discuss answer for this question.

Example-
Suppose we are working on a ‘Vehicle’ project, in which, we want to calculate travel Time, engine implementation,& Gear Implementtion etc.

In above project, we know partial details and some details we need from client.
Here assume client is sub class, rite.

Travel time formula is same for any type of vehicle, so we will write this calculation in parent class, and engine and gear implementation is depends client to client, but details are mandatory to provide.
So we will create abstract class with abstract method for engine and gear implementation.

Hence for such kind of scenarios we generally declare the class as abstract and later concrete classes extend these classes and override the methods accordingly and can have their own methods as well.

For code, kindly check below github repo –

Check this first
	https://github.com/jainabhishek0406/JavaInheritanceEx

Then below, for better learning.
https://github.com/jainabhishek0406/JavaAbstractionEx
