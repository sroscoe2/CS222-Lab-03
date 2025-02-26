# Programming II

## Lab 3: Scanners, Reading and Writing Files

In this lab, you will practice using Scanners, for getting user input in Java.

This lab is used in CS 222 at Saint Mary's College of California. Written by Dr. Sarah Roscoe in 2025.

## Important Note

There is only 1 JUnit test for this lab, for `End.java`. For `Beginning` and `Middle`, your code and its behavior must be correct. You may compare your output with the output as stated in each problem. If the output matches you will get full credit.

## Instructions

1. Clone this lab from Github. Use this link: <https://github.com/sroscoe2/CS222-Lab-03.git> Refer to Lab 1 if you need a refresher for how to do so. REMEMBER: when importing, name your folder `firstnameLI-CS222-Lab-03`

### Beginning.java

2. [Explanation](#scanners) [Hint](#beginning) Open `Beginning.java`. In the `main()` method, declare and instantiate a `Scanner` to read from `System.in`.

3. Prompt the user for their name and favorite color using sysout.

4. [Explanation](#using-scanners) Use the `.next()` method for your `Scanner` to grab the next two tokens. Save each token to a `String` variable: one for the person's name and the other for their favorite color.

5. Use `System.out.printf()` to tell the user their name and favorite color that you were given.

6. Close the `Scanner`.

7. [Expected Output](#beginning-expected-output) Test it out to make sure it works.

8. [Explanation](#trycatchfinally) If everything works, now edit the code you've written: Put the risky code  in your method within `try`/`catch`/`finally` blocks. Before the `try`, declare and initialize the `Scanner` to `null`. Inside the `try`, instantiate the `Scanner` as you had before (from `System.in`), and read using `.next()`. Catch an exception (maybe `NoSuchElementException`) and throw it in the `catch` block. In the `finally` block, close the scanner. Rerun to make sure everything works. There should be no change in the output from before.

### Middle.java

9. [Hint](#middle) Open `Middle.java`, and review the methods there. How many are there? The goal is to experiment with different `next...()` methods. Which methods, do you think? Check against a link such as <https://www.w3schools.com/java/java_user_input.asp> to inform your decision.

10. Implement all the methods except for `main()` (The `main()` method's already done for you). Don't worry about initializing the `Scanner`, or doing `try`/`catch` for this one. Just practice using the appropriate methods. For each, you should use `s.next...();`, choosing the appropriate `Scanner` method, then print the result you get.

11. In the `nextLine_r()` method, there is an extra `s.nextLine()` following the print statement. Why do you think this is? Write your answer in comments. Try taking out the extra `nextLine()` and see what happens. Does this affect your previous answer?

### End.java

12. Open `End.java`. There are three methods: one called `load()`, another, `main()`, and a third, `junitMethod()`. Your job is to implement `load()`. Do not modify `junitMethod()`.

13. [Hints](#end) The Scanner in `load()` has already been setup for you. You have to do the following:

- figure out how to go through each line of the file. Modify `while(true)` to do this.
- *take in* the next line, with a Scanner method.
- split it by commas,
- save the split information to an array.
- grab things from the array and save it to the variables.

14. Run `End.java` to verify the output looks as expected:

```txt
2023 NWSL Stats
Team Name: W/D/L
San Diego Wave: 11/4/7
Portland Thorns: 10/5/7
North Carolina Courage: 10/5/7
Seattle Reign: 9/5/8
Angel City FC: 8/7/7
Gotham FC: 8/7/7
Orlando Pride: 10/1/11
Washington Spirit: 7/9/6
Racing Louisville: 6/9/7
Houston Dash: 6/8/8
KC Current: 8/2/12
Chicago Red Stars: 7/3/12
```


15. Run `EndTests.java` and ensure all test cases pass. Don't forget to comment your code!

### Finishing Up

16. Zip your project folder and turn it into Canvas. Refer to Lab 1 if you need a refresher for how to do so.

## Explanations

### Scanners

A `Scanner` is a type defined by Java that we can use to process input of various sources. A `Scanner` allows us to go through a long source of input, in units of *tokens*. Tokens are words, numbers, or other types of complete items coming from the data stream.

The String `"Hello this is my String and I like the number 3"` has the following tokens: `"Hello", "this", "is", "my", "String", "and", "I", "like", "the", "number", "3"`

We've split a String into tokens before in the previous lab.

Now, we're going to get tokens a different way, using a `Scanner`.

[Go back to the instructions](#instructions)

#### Setting Up Scanners

To use a `Scanner`, we need to first declare the variable:

```java
Scanner s;
```

Easy enough. Then we need to either initialize it or instantiate it.

To initialize it (typically to `null`), we do the following:

```java
s = null;
```

Or, all in one line,

```java
Scanner s = null;
```

To instantiate it, we call

```java
s = new Scanner(inputSource);
```

This sets up the `Scanner` so it's all ready to read the input source we give it. We'll use two different input sources in this lab, but there are more available that you can look into on your own time.

**Important Note:** Typically, we initialize `Scanner`s to `null` if we're going to actually instantiate them later.

[Go back to the instructions](#instructions)


#### Using Scanners

To use a `Scanner`, we choose one of its many methods. The full list of `Scanner` methods can be found here, in Oracle's documentation:

<https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html>

Here is a tutorial that contains a list of different input types:
<https://www.w3schools.com/java/java_user_input.asp>

The `Scanner` essentially has two modes:

- *Checking* if there is next input
- *Receiving* next input & *removing* it from the pipeline.

The difference between these two modes is crucial to understand. Checking `hasNext()` will see *if* there is something next in the `Scanner`. If you're looking for a specific data type, e.g. an `int` or a `boolean`, you can use `hasNextInt()` or `hasNextBoolean()`, etc. `hasNext()` looks for anything next in a `Scanner` and is not specific to any data type.

However, calling `next()` (or `nextInt()`, etc.) actually *removes* the item from the `Scanner` and returns it to you. This means that we need to receive what gets removed, and assign it somewhere. Which is why you'll save the result of `next()` in a variable or store it somewhere.

<p align="center">
<img src="images/scanner-next.png" alt="On top is a code snippet, `Scanner s = new Scanner(System.in);`. Then there is a list of items separated into columns. The columns are Hello, this, is, a, sentence, in, the, Scanner. There is an arrow pointing down, to the right of which reads a code snippet `s.next()`, which returns Hello. Then there is a list of items separated to columns. There is one less column, as Hello has been removed from the Scanner." width=50% height=50%>
</p>

Each word in the diagram above is called a *token*.

Here is a table of some of the most common functions used with a `Scanner`.

| Data Type                                                | `Scanner` method |
| -------------------------------------------------------- | ---------------- |
| Token (any, saves as `String`)                           | `next()`         |
| The entire next line, including `\n` (saves as `String`) | `nextLine()`     |
| `boolean`                                                | `nextBoolean()`  |
| `double`                                                 | `nextDouble()`   |
| `int`                                                    | `nextInt()`      |

One last thing to note is that when we *open* a Scanner (we do so when we say `new Scanner(inputSource)`), we must also *close* it. We close the Scanner when we are done using it. This is done by typing `s.close()` (if `s` is the name of our Scanner).

[Go back to the instructions](#instructions)

### Try/Catch/Finally

When getting things from user input, there's a chance things could go wrong. Maybe the user doesn't give us everything we thought would be there. Maybe the user gives us the wrong input. Maybe a file we'd been looking for isn't there after all. Or maybe something else happened and we need to shut our program down.

Enter: try/catch!

`try` and `catch` are blocks of code which help to handle what happens when things go horribly wrong. The jist of it is that we put the risky code in `try`, plan a bit ahead for what sort of thing could go wrong and put that in `catch`. Then, after the `catch` block is fulfilled, have a `finally` block to do anything we need to do before the program ends.

Here's what it looks like:

```java
try{
    // risky code here
}
catch(SomeSpecificException e){
    throw new SomeSpecificException("error message set by us");
    // can do other things here
}
finally{
    // clean up resources
}
```

`finally` will [usually](https://stackoverflow.com/a/65049) happen after the try block, whether an exception is caught or not.

For a Scanner, the riskiest parts are:

- opening it, and
- getting input from it.

These are the riskiest parts because they all presumably involve something outside of our control. The source of input could be incorrect or not exist (like trying to open a file that's not actually there). If you expect the user to give you only numbers like `1 2 3 4`, they could type them instead `one two three four`, and leave you out of luck. You should approach any attempt to receive user input very cautiously! Assume they will try to mess with you and give you something other than expected. It could happen maliciously, or by ignorance.

Let's look at a simple try/catch/finally structure with a Scanner getting a number from `System.in`.
We want to use `nextInt()` to get the integer from the Scanner. What's the *boundary cases* we have to think about? How about, what if the user gives us something other than a number?
In that case, it probably makes sense to catch an `InputMismatchException`.

```java
Scanner s = null;
try{
    s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.printf("received: %d\n",n);
}
catch(InputMismatchException){
    throw new InputMismatchException("not an integer");
}
finally{
    s.close();
}
```

[Go back to the instructions](#instructions)


### Beginning

Your task for this problem is to open a `Scanner`, get input, and use `.next()` to read the next tokens from the user. Then you should print the tokens you received.

After you do that, your code should look something like the code above. Though it will be different because you'll use `.next()` multiple times instead of `.nextInt()`

[Go back to the instructions](#beginningjava)


#### Beginning Expected Output

Your output should look like the following:

```txt
Please enter your name:
Sarah
Please enter your favorite color:
red
Your name is: Sarah and your favorite color is: red
```


[Go back to the instructions](#beginningjava)

### Middle

Here is a table of some of the most common functions used with a `Scanner`.

| Data Type                                                | `Scanner` method |
| -------------------------------------------------------- | ---------------- |
| Token (any, saves as `String`)                           | `next()`         |
| The entire next line, including `\n` (saves as `String`) | `nextLine()`     |
| `boolean`                                                | `nextBoolean()`  |
| `double`                                                 | `nextDouble()`   |
| `int`                                                    | `nextInt()`      |

Using these, choose the appropriate method to use to get input from the user. 

There's a few thing you won't have to worry about for this problem. As you can see, the `Scanner` is set up, and it is closed in `main()`. All you need to do is choose the correct method.

For number 11, you should practice a process called *debugging*. This means, basically, try different stuff and see what happens.

First, observe what happens *without* changing anything. Is this what you want to have happen?

Next, delete it (or comment it out) and run the code again. Did something unexpected happen?

Next, try to add another instance of the statement. What happens then?

This practice of "let's try it and find out" will help you push the boundaries of code you have written, and help you discern whether your code is doing as you expected it to.

[Go back to the instructions](#middlejava)

#### Middle Expected Output

Your output should look like the following:

```txt
Please enter anything:
hihello
You gave me:
hihello
Please enter an INTEGER:
2345
You gave me:
2345
Please enter anything:
this! is! anything! 1 1 2 3 5 8
You gave me:
this! is! anything! 1 1 2 3 5 8
Please enter a BOOLEAN:
true
You gave me:
true
```

[Go back to the instructions](#middlejava)

### End

You should now be fairly familiar with how to use different functions belonging to a `Scanner`. Note that there may be other ways to do these things! This is just what I thought of.

**How to go through lines of a file.**

First, set up a while loop, and at each iteration ask, "does this file have a next line?" You can do that with the true/false condition `s.hasNextLine()`. 

Inside the while loop, you actually have to consume the next line and do something with it -- otherwise we'll be stuck in the while loop forever. That's actually saying `nextLine()` or something like that.

**How to split a line by commas.**

We know how to split a string by a certain character -- that's `.split("")`, where the thing in double quotes is the character to split by. For example, if my String is `"my name is Sarah"`, then `.split(" ")` splits it by spaces, and delivers an array which looks like `["my", "name", "is", "Sarah"]`. 

To split by commas, simply change the splitting string from a space `" "` to a comma `","`.

But how to get the entire line? Now we need to use the `.nextLine()` method. We can pair it up by saying `s.nextLine().split(",")`. We've got two dot operations next to each other -- that's fine!

**How to setup then save to an array.**

We've got our array of things. We've split that line String into pieces. We just have to save it somewhere. We can do that by declaring a String array (that looks like `String[] variableName`) and set it equal to the result you just got. Since each line of the file will be a team, maybe name it `teamInfo`? But up to you.

**How to grab things and save it to variables.**
We've got an array, and each piece of information about the team is now a String in that array. All that's needed is to grab the information.

Here's information about each line of the file:

- The 0th thing in the line is the team name.
- The 1st thing in the line is the number of wins.
- The 2nd thing in the line is the number of draws (ties).
- The 3rd thing in the line is the number of losses.

For the numbers, you can use `Integer.parseInt(someString)` to convert a String to an int.

[Go back to the instructions](#endjava)
