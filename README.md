## Exercise: AlignedNumbers (10 Points)

The project name of this exercise is **AlignedNumbers**.

The purpose of this assignment is for you to write more of your own comments, write code to solve more complex problems, use libraries provided as part of Java and output more organized data using `String.format`. 

### Problem Description

This problem is captured in the book at problem P2.4 and P2.5 (page 71 and 72, of the _Late Objects_ version). You are to solve this problem by getting user input with code in the `main` method and returning a string with the aligned numbers in `alignNumbers`. This code will get user input for two numbers and output the appropriate mathematical result in an organized format.

Here is a sample of how your code will prompt the user for code. When the program is run you will ask the user for two integer numbers. Do not worry about error checking; the integer inputs will always be valid.

<pre>Enter the first number: <span style="color: #0f0;">20</span>
Enter the second number: <span style="color: #0f0;">25</span>
</pre>

You then print all of the statistics using the **exact** format below. Your `alignNumbers` method must generate this exact format for any two integers between 1 and 1000.

```
Sum:                        45
Average:                    22.50
Difference:                  5
Product:                   500
Distance:                    5
Maximum:                    25
Minimum:                    20
```

#### Hints:

1. There are 30 characters in the first line starting with "S" and ending with "5".
2. The ones digits are all aligned.
3. Use `String.format`

### Getting Started

Like our last exercise, we are going to start by creating **AlignedNumbers.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) create a source file called **AlignedNumbers.java**.

```java
/**
 * CS 105 Theory & Practice
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: AlignedNumbers
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

import java.util.*;

/**
 * This class tests the AlignedNumbers object.
 *
 */
public class AlignedNumbers {
    /**
     * This code accepts two integers and then prints out the relationship 
     * between those two numbers as described in the problem statement.
     *
     * @param first The first integer value
     * @param second The second integer value
     *
     * @return A string with the metrics formatted as described
     */
    public static String alignNumbers(int first, int second) {
        String aligned = "";
    	
        // Put your code for this assignment here.
	
        return aligned;
    }
    
    /**
     * This code runs by asking for two numbers, computing the various stats,
     * and then printing it out.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        System.out.println(alignNumbers(first, second));
    }
}
```

Now go through **AlignedNumbers.java** and change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed. The CRN # is either 62498, for the Thu. night lab section, or 62499, for the Thu. morning lab section.

Next, write your code to print out the aligned number in `public static String alignNumbers` between the curly braces.

Once you've written your code run the code by single clicking on **AlignedNumbers.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Using my Unit Tests

Next we are going to use my unit tests to test your code. For most exercises there will be a unit test supplied that I wrote. You are supposed to use this unit test after you have written the code in **AlignedNumbers.java**.

When you forked the project from BitBucket, my unit tests were copied over. In your project you should see **AlignedNumbersTester.java** in the `unittest.cs105` package.

The forked AlignedNumbers project from BitBucket should look like this:

<img src="https://www.dropbox.com/s/4o3rjijlug1j5j7/miyazaki_layout.png?dl=1" width="252" height="179" />

Yours should look **_very_** similar! The name of the tester will change for each project, and you might have a different JRE System Library though. What should be the same are the packages and what they contain.

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

Once you have run the tests, the results of them should look something like the following:

<img src="https://www.dropbox.com/s/79zw4fbsjebbx1s/junit_test.png?dl=1" width="257" height="445" />

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to BitBucket. Once you've completed this step your code will be on BitBucket in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...**. You should see the following dialog:

![Commit dialogue](https://www.dropbox.com/s/lojod76ghyzl626/commit-git.png?dl=1)

Now follow these steps to commit and push your code:

1. Select the files by check marking the files you want to commit. In this case **AlignedNumbers.java**. 
2. Enter a commit message. The commit message can be anything, but should describe the changes that are begin committed. A good commit message in this case might be "Committing code to check in for assignment"
3. Press **Commit and Push**

You will see a few more dialogs (including ones that may ask for your BitBucket username and password) go by and then you will see something similar to the following:

![Push dialogue](https://www.dropbox.com/s/niao32p4abbx4k2/push-git.png?dl=1)

1. Push **OK** to complete the commit. You may get no confirmation, but you can check BitBucket to see if the code now exists there.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **pull request** in the class BitBucket repository. This action will indicate to the original project that you have finished your coding and it will create a place to give feedback on a line by line basis. 

Go to **your** repository or the repository for this assignment on BitBucket (the project you forked from to create your project).

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/create-pull-request.png" width="207" height="207" />

1\. Click on the **Create pull request** icon. 

You should see something similar to this picture:


<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-screen-first.png" width="600" height="250" />

The next screen then shows the source and destination of the pull request. Your code is the source and is listed at the top. The destination is the original project that you forked from. The only thing to do on this screen is to select the **master** branch for your project. Once you select **Select Branch**, as directed below, you should see the following:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-master.png" width="600" height="250" />

2\. Select **Select Branch** you should see something like this:

3\. Select **master** 

4\. Press the **Continue** button.

Once you've followed these steps you should see this at the top:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-description.png" width="514" height="325" />

5\. Under **Title**, give the pull request a meaningful title. It's mostly for your benefit.

6\. Under **Description**, describe the purpose of this pull request. Usually it's just to submit the assignment. However, you can also use this field to let me know anything that might be wrong or different with your code.

7\. Finally, click on **Create**

After selecting **Create**, you code should build and be tested within a minute or so. If the test is successful you will see something similar to the following screen:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-submitted.png" width="740" height="350" />

Remember, green good, red bad.