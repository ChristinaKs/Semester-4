# Chapter 01
## *Introduction to PHP*

## PHP Syntax
* Delimiters come in pais
* Parentheses are used to enclose parameter lists
* Quotation marks:
    * Straight double quotation marks (") are used to enclose strings so that PHP may substitute variables by their values
    * Straight single quotation marks (') are used to enclose string laterals
    * All quotation marks are straight
* Accolades enclose methods, classes as well as namespaces, definitions and scopes
* Semicolons end all executing instructions

```PHP
<?php
    // PHP code goes here
?>
```

<br>

## Variables in PHP
Variables start with The $ followed by the variable name
```PHP
$a = 10
$str = "Declaring a variable"
```

<br>

## GET Method
The data is sent as URL parameters (usually string of name and value pairs separated by &)
```PHP
$lastName = $_GET["LastName"];
```
<br>

## POST Method
The data is sent to the server as a package in a separate communication with processing script. Not visible in URL.
```PHP
$firstName = $_POST["FirstName"]
```