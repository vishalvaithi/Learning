package GFG;

import java.util.HashSet;
import java.util.Set;

public class permutation {
	public static Set<String> uniquePermutations(String s) {
		Set<String> result = new HashSet<>();
		permute(s, "", result);
		return result;
	}

	private static void permute(String str, String prefix, Set<String> result) {
		if (str.length() == 0) {
			result.add(prefix);
		} else {	
			for (int i = 0; i < str.length(); i++) {
				permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), result);
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "ABC";
		System.out.println(uniquePermutations(s1)); // Output: [ABC, ACB, BAC, BCA, CAB, CBA]

		String s2 = "ABSG";
		System.out.println(uniquePermutations(s2)); // Output: [ABGS, ABSG, AGBS, AGSB, ASBG, ASGB, BAGS, BASG, BGAS,
													// BGSA, BSAG, BSGA, GABS, GASB, GBAS, GBSA, GSAB, GSBA, SABG, SAGB,
													// SBAG, SBGA, SGAB, SGBA]
	}
}

/*Sat, Jan 25
Given a string s, which may contain duplicate characters, your task is to generate and return an array of all unique permutations of the string. You can return your answer in any order. Examples: Input: s = "ABC" Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"] Explanation: Given string ABC has 6 unique permutations. Input: s = "ABSG" Output: ["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA", "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA", "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"] Explanation: Given string ABSG has 24 unique permutations.
Sure, I can help you with that! Here's a Python function that generates all unique permutations of a given string:

python
from itertools import permutations

def unique_permutations(s):
    # Generate all permutations
    perm = permutations(s)
    # Convert to a set to remove duplicates and then back to a list
    unique_perm = list(set([''.join(p) for p in perm]))
    return unique_perm

# Example usage:
s1 = "ABC"
print(unique_permutations(s1))  # Output: ['ABC', 'ACB', 'BAC', 'BCA', 'CAB', 'CBA']

s2 = "ABSG"
print(unique_permutations(s2))  # Output: ['ABGS', 'ABSG', 'AGBS', 'AGSB', 'ASBG', 'ASGB', 'BAGS', 'BASG', 'BGAS', 'BGSA', 'BSAG', 'BSGA', 'GABS', 'GASB', 'GBAS', 'GBSA', 'GSAB', 'GSBA', 'SABG', 'SAGB', 'SBAG', 'SBGA', 'SGAB', 'SGBA']
This function uses the permutations function from the itertools module to generate all possible permutations of the string. It then converts the permutations to a set to remove duplicates and finally converts it back to a list.

Feel free to try it out and let me know if you have any questions!

java code
Absolutely! Here's a Java function that generates all unique permutations of a given string:

java
import java.util.HashSet;
import java.util.Set;

public class UniquePermutations {
    public static Set<String> uniquePermutations(String s) {
        Set<String> result = new HashSet<>();
        permute(s, "", result);
        return result;
    }

    private static void permute(String str, String prefix, Set<String> result) {
        if (str.length() == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), result);
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "ABC";
        System.out.println(uniquePermutations(s1));  // Output: [ABC, ACB, BAC, BCA, CAB, CBA]

        String s2 = "ABSG";
        System.out.println(uniquePermutations(s2));  // Output: [ABGS, ABSG, AGBS, AGSB, ASBG, ASGB, BAGS, BASG, BGAS, BGSA, BSAG, BSGA, GABS, GASB, GBAS, GBSA, GSAB, GSBA, SABG, SAGB, SBAG, SBGA, SGAB, SGBA]
    }
}
This code uses a recursive approach to generate all permutations of the string and stores them in a HashSet to ensure uniqueness. The permute method is called recursively to build the permutations.

Feel free to try it out and let me know if you have any questions!

explain each step
Sure, let's break down the Java code step by step:

Importing Required Classes:

java
import java.util.HashSet;
import java.util.Set;
We import the HashSet and Set classes from the java.util package. These will be used to store the unique permutations.

Defining the Main Class:

java
public class UniquePermutations {
We define a public class named UniquePermutations.

Defining the uniquePermutations Method:

java
public static Set<String> uniquePermutations(String s) {
    Set<String> result = new HashSet<>();
    permute(s, "", result);
    return result;
}
This method takes a string s as input and returns a set of unique permutations.

We create a HashSet named result to store the unique permutations.

We call the permute method to generate the permutations and store them in the result set.

Finally, we return the result set.

Defining the permute Method:

java
private static void permute(String str, String prefix, Set<String> result) {
    if (str.length() == 0) {
        result.add(prefix);
    } else {
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), result);
        }
    }
}
This method is a recursive helper function that generates permutations.

It takes three parameters: the remaining string str, the current permutation prefix, and the set result to store the permutations.

If the remaining string str is empty, we add the current permutation prefix to the result set.

Otherwise, we loop through each character in the remaining string str and recursively call the permute method with the updated remaining string and current permutation.

Defining the main Method:

java
public static void main(String[] args) {
    String s1 = "ABC";
    System.out.println(uniquePermutations(s1));  // Output: [ABC, ACB, BAC, BCA, CAB, CBA]

    String s2 = "ABSG";
    System.out.println(uniquePermutations(s2));  // Output: [ABGS, ABSG, AGBS, AGSB, ASBG, ASGB, BAGS, BASG, BGAS, BGSA, BSAG, BSGA, GABS, GASB, GBAS, GBSA, GSAB, GSBA, SABG, SAGB, SBAG, SBGA, SGAB, SGBA]
}
This is the entry point of the program.

We create two example strings s1 and s2.

We call the uniquePermutations method with these strings and print the results.

I hope this explanation helps! Let me know if you have any questions or need further clarification.

for (int i = 0; i < str.length(); i++) { permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), result); } explain each step
Sure, let's break down this loop step by step:

Loop Initialization:

java
for (int i = 0; i < str.length(); i++) {
This is a for loop that initializes the variable i to 0 and runs as long as i is less than the length of the string str. The loop increments i by 1 after each iteration.

Recursive Call to permute Method:

java
permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), result);
Inside the loop, we make a recursive call to the permute method with three arguments:

str.substring(0, i) + str.substring(i + 1): This creates a new string by concatenating the substring of str from the beginning to the character before i (str.substring(0, i)) and the substring of str from the character after i to the end (str.substring(i + 1)). Essentially, this removes the character at index i from the string str.

prefix + str.charAt(i): This adds the character at index i of str to the current permutation prefix.

result: This is the set that stores the unique permutations.

Purpose of the Loop:

The loop iterates through each character in the string str. For each character, it removes that character from str and adds it to the current permutation prefix. The updated str and prefix are then passed to the recursive permute method to continue generating permutations.

In summary, this loop is responsible for generating all possible permutations by recursively removing each character from the string and adding it to the current permutation. The permute method continues this process until the string is empty, at which point the current permutation is added to the result set.

I hope this helps! Let me know if you have any further questions.

explain with example
Sure, let's go through an example to explain the loop and the recursive call in detail. We'll use the string "ABC" as our example.

Initial Call
We start with the initial call to the permute method:

java
permute("ABC", "", result);
Here, str is "ABC", prefix is an empty string, and result is an empty set.

First Level of Recursion
In the first level of recursion, the loop iterates over each character in "ABC":

First Iteration (i = 0):

str.substring(0, 0) + str.substring(1) results in "BC".

prefix + str.charAt(0) results in "A".

Recursive call: permute("BC", "A", result);

Second Iteration (i = 1):

str.substring(0, 1) + str.substring(2) results in "AC".

prefix + str.charAt(1) results in "B".

Recursive call: permute("AC", "B", result);

Third Iteration (i = 2):

str.substring(0, 2) + str.substring(3) results in "AB".

prefix + str.charAt(2) results in "C".

Recursive call: permute("AB", "C", result);

Second Level of Recursion
Let's follow the first iteration from the first level of recursion:

First Iteration (i = 0) from "BC":
Recursive call: permute("BC", "A", result);

Now, str is "BC" and prefix is "A".

In this level, the loop iterates over each character in "BC":

First Iteration (i = 0):

str.substring(0, 0) + str.substring(1) results in "C".

prefix + str.charAt(0) results in "AB".

Recursive call: permute("C", "AB", result);

Second Iteration (i = 1):

str.substring(0, 1) + str.substring(2) results in "B".

prefix + str.charAt(1) results in "AC".

Recursive call: permute("B", "AC", result);

Third Level of Recursion
Let's follow the first iteration from the second level of recursion:

First Iteration (i = 0) from "C":
Recursive call: permute("C", "AB", result);

Now, str is "C" and prefix is "AB".

In this level, the loop iterates over the single character in "C":

First Iteration (i = 0):

str.substring(0, 0) + str.substring(1) results in an empty string "".

prefix + str.charAt(0) results in "ABC".

Recursive call: permute("", "ABC", result);

Base Case
In the base case, str is an empty string:

Recursive call: permute("", "ABC", result);

Since str is empty, we add "ABC" to the result set.

Backtracking
After reaching the base case, the recursion backtracks to explore other permutations. The process continues similarly for other iterations and recursive calls, generating all unique permutations of the string "ABC".

I hope this detailed example helps! Let me know if you have any further questions.

*/