# Bracket Checker
Create a progam which takes in a string and checks to ensure that all brackets inside it are properly closed.

## Challenge
Create a stack for each type of bracket we are checking for.

for loop through the input string, taking the character at each index and checking what it is. If it is any of the opening brackets, push onto the corresponding stack. If it is a closing bracket, pop from the corresponding stack, and if there is nothing on that stack, return false. Once all are checked, return true if the stacks have no additional nodes, or false if they do.

## Solution
![](assets/bracket-check.jpg)
