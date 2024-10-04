# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](UML.png)

## Description

My project is about a toy store. My toy store had two different sub classes, one for plush toys and one for action figures. I chose this topic because some common stores that anyone goes to has to have some toys like Walmart and Target. In my project I used no-argument constructors, instance variables, parameterized constructors, accessor and mutator methods, and toString methods. Some instance variables I used had to do with the type of toy, material, price, and if it was okay for all ages. My parameterized constructors sets type to the specified type, price to the specified price, and allAges to the true or false value for my super class. My no argument constructors just put basic values for a common toy. The mutator methods are mostly just set type and just returning values like getType. I only have some user input just for the type of toy and the price because I was having errors with the all ages. The user will input the type of toy they want and what price they want into the console log. 
