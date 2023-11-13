<h1 align="center">
 Siemens <br>Programming Skills Challenge<br><br>
</h1>

<h2 align="center">
 Created by <a href="https://github.com/abressam">Amanda Bressam Martins</a>
</h2>

# 🚀 Introduction

<p align="justify">
This project represents the technical challenge stage of Siemens' selection process and the following document describes the logic designed for each question. The following topics are available:
</p>

1. [Programming Language](#language)
2. [Project organization](#organize)
3. [Challenge Responses](#questions)

<div id='language' />

# 🔧 Programming Language

<p align="justify">
As I have already carried out projects with this language, I chose <strong><i>Java</i></strong> as the programming language to solve the practical exercises.
</p>

<div id='organize' />

# 📁 Project organization

<p align="justify">
The organization of the project is very simple, the <strong><i>scripts</i></strong> folder contains questions six, eight and nine, which are SQL files or .txt commands (as is the case with question nine). 
 The <strong><i>src</i></strong> contais questions three, four, ten, eleven and the Main file.
</p>

1. [The Script Folder](#script)
2. [The Src Folder](#src)

![image](https://github.com/abressam/challenge-siemens/assets/71531467/e70dcb11-3671-4ca9-8923-c3f16abb527d)

<div id='script' />

## 📁 The Script Folder

<p align="justify">
This folder separates the challenges that are in SQL and those that are arranged in files in .txt format.
</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/8ed06b5c-76fc-4d67-81e7-fd5ef973526d)

<div id='src' />

## 📁 The Src Folder

<p align="justify">
For the challenges made in Java, I created a class for each one and they are present in their respective folders. In the Main class, I created a menu to organize the separation of each exercise.
</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/7d29acb8-4fbb-460a-9ba6-4e45c4ceb952)

<div id='questions' />

# 💡 Challenge Responses

<p align="justify">
In this topic I will explain each question step by step.
</p>

1. [Question Three](#3)
2. [Question Four](#4)
3. [Question Four - Unit Test](#5)
4. [Question Six](#6)
5. [Question Eight](#8)
6. [Question Nine](#9)
7. [Question Ten](#10)
8. [Question Eleven](#11)

<div id='3' />

## 💡 Question Three

<p align="justify">
This code is an implementation of a Java program that loops through numbers from 1 to 100 and prints "Foo" if the number is a multiple of 3, "Baa" if it is a multiple of 5, and "FooBaa" if it is a multiple of both. If it is not a multiple of either, it simply prints the number. Let's see step by step.</p>

<p align="justify">
This is a private method that checks if number is a multiple of multiple. It returns true if it is and false otherwise. The % operator is used to calculate the remainder of dividing number by multiple, and if the remainder is zero, then number is a multiple of multiple.</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/2d5ad02f-d24f-49ca-b960-737ab83ab621)

<p align="justify">
This method loops through the numbers 1 to 100 using a for loop. For each number, it calls the multipleValidator method to check if it is a multiple of 3 and/or 5. Depending on the result, it concatenates the strings "Foo" and/or "Baa" to the resp variable. If the resp variable is still empty after the checks, it means that the number is not a multiple of 3 or 5, so the number itself is concatenated to resp. At the end of each iteration, the string resp is printed to the console.</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/50bb9049-8851-4487-bfde-3339882315a3)

### 💡 Question Three - Result

![image](https://github.com/abressam/challenge-siemens/assets/71531467/8fee8e43-0b5c-4eb8-ab60-06d1ece1b45d)

<div id='4' />

## 💡 Question Four

<p align="justify">
This code implements a function called ConcatRemove that receives two strings s and t, and an integer k. The function returns "yes" if it is possible to transform the string s into the string t in at most k operations, where an operation consists of removing a character from the end of a string or adding a character to the end of a string. Otherwise, returns "no". Let's see step by step.</p>

<p align="justify">
The CountCharactersInTheSamePosition method is a helper method that counts the number of characters in the same positions in s and t, stopping the count when it encounters the first different character.
</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/5438bec4-606e-4d96-a8f9-f1447b3ce28c)

* countSameCharacter: Calculates the number of equal characters in the corresponding positions of the strings s and t. These characters are the ones at the beginning and remain unchanged during operations.
 
* totalOperations: Calculates the total number of operations required to transform string s into string t. This is the sum of the non-matching characters in s and t after the matching positions.
 
* isKWithinValidTotalOperations: Checks whether the value of k is sufficient to perform the total number of necessary operations, and whether the difference (k - totalOperations) is an even number.
 
* isKWithinTotalLength: Checks if k is greater than or equal to the total length of the strings s and t.
  
* The code finally decides whether it is possible to transform s to t in at most k operations and returns "yes" or "no" according to the conditions mentioned above.

![image](https://github.com/abressam/challenge-siemens/assets/71531467/7a574ca7-f196-499d-8df6-885cf0aa69ca)

### 💡 Question Four - Result

![image](https://github.com/abressam/challenge-siemens/assets/71531467/517adb19-6068-486a-a820-706feb934fd9)

<div id='5' />
 
## 💡 Question Four - Unit Teste

<p align="justify">
This code is a set of unit tests for the QuestionFour class.
</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/4bc5c985-2fdb-459e-9102-6f59426ee707)

![image](https://github.com/abressam/challenge-siemens/assets/71531467/3b0e507c-2467-4d9c-9ff6-93cbd1097015)

![image](https://github.com/abressam/challenge-siemens/assets/71531467/2b2b1de1-c15f-4a20-bb95-dbf017324d66)

<div id='6' />

## 💡 Question Six

<p align="justify">
This SQL code creates two tables, Students and Notes, inserts data into these tables, and then performs a query to obtain student-specific information based on their grades.
</p>

<p align="justify">
Create student table with ID, Name and Value and insert values
</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/797a2b37-c14e-4ebe-a6d7-da1ed8ade3a1)

<p align="justify">
Create notes table with Grade, Min_Value and Max_Value and insert values
</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/3947651f-d26e-40a3-aa00-d07d45109629)

* The query uses the CASE clause to determine whether the student is in the 70 to 100 grade range. If so, the student's name is selected; otherwise, the value 'NULL' is returned.
  
* Another CASE clause is used to calculate the grade based on the student's Value. If the value is in the range of 70 to 100, the score is calculated using the formula 8 + (Value - 70) / 10; otherwise, the grade is fixed at 7.

* The query selects the Name, Grade, and Value columns from the Students table.

* The WHERE clause filters students with grades between 70 and 100 or below 70.

* The results are sorted in descending order by Grade and, in case of a tie, in alphabetical order by Name.

![image](https://github.com/abressam/challenge-siemens/assets/71531467/0ec763da-f47c-47b4-8aab-154cf048e39f)

### 💡 Question Six - Result

![image](https://github.com/abressam/challenge-siemens/assets/71531467/5754b787-bb7f-49fe-b3f2-f85a8189ce00)

<div id='8' />

## 💡 Question Eight

<p align="justify">
This SQL code performs a query on two different tables (dogs and cats) and combines the results using the UNION clause. The goal is to select the animal names (dogs and cats) from both tables and return a unique list of names, removing duplicates.</p>

![image](https://github.com/abressam/challenge-siemens/assets/71531467/f116db95-2ae7-4626-ba7f-a951550b09d1)

<div id='9' />

## 💡 Question Nine

<p align="justify">
This question needed to execute a sequence of commands to achieve the desired result.</p>

### 💡 Problem #1

![image](https://github.com/abressam/challenge-siemens/assets/71531467/0e39d1e8-19ae-47b8-82f0-f14748c7a4e7)

### 💡 Problem #2

![image](https://github.com/abressam/challenge-siemens/assets/71531467/ea219edd-fcef-47bf-aaee-9b62599565cc)

### 💡 Problem #3

![image](https://github.com/abressam/challenge-siemens/assets/71531467/62426915-dfe8-42e8-9949-6e88f2f1b457)

<div id='10' />

## 💡 Question Ten

<p align="justify">
The objective of this method is to calculate the length of a string, that is, the number of characters it contains
</p>

* int length = 0;: Declares an integer length variable and initializes it to zero. This variable will be used to store the length of the string.

* for (char character : inputString.toCharArray()) {: Starts a for-each loop that loops through each character in the inputString string. The toCharArray() method converts the string to an array of characters, and the for (char character : array) syntax iterates over each character in the array.

* length++;: Inside the loop, increments the length variable with each iteration, that is, for each character in the string.

* return length;: After the loop, the method returns the value of the length variable, which represents the total length of the string.

![image](https://github.com/abressam/challenge-siemens/assets/71531467/b2105794-8c6e-4cf3-8b80-3dcc62b5431d)

IMPORTANT: I couldn't find another way to make my string turn into an array of characters without using ready-made methods like toCharArray(), so I used it to complete the challenge.

## 💡 Question Ten - Result

![image](https://github.com/abressam/challenge-siemens/assets/71531467/e5b21f39-ca75-453a-ad19-dc41308355fe)

<div id='11' />

## 💡 Question Eleven

<p align="justify">
The purpose of this method is to reverse the order of characters in a string given as input.
</p>

* char[] charArray = inputString.toCharArray();: Converts the inputString string into a character array called charArray. This makes it easier to manipulate characters individually.

* int length = 0;: Declares an integer length variable and initializes it to zero. This variable will be used to store the length of the string.

* for (char character : charArray) { length++; }: Uses a for-each loop to loop through each character in the charArray array and increment the length variable to count the total number of characters in the string.

* int endIndex = 0;: Declares an integer variable endIndex and initializes it to zero. This variable will be used to store the index of the end of the string after counting characters.

* while (endIndex < length && charArray[endIndex] != '\0') { endIndex++; }: Uses a while loop to find the index at the end of the string (endIndex). The loop continues as long as the endIndex is less than the length of the string and the current character is not the null character ('\0').

* for (int i = 0; i < endIndex / 2; i++) { char temp = charArray[i]; charArray[i] = charArray[endIndex - i - 1]; charArray[endIndex - i - 1] = temp; }: Uses a for loop to reverse the order of characters in the charArray array. It swaps the character at position i with the character at the corresponding position at the end of the string (endIndex - i - 1). This is done until the middle of the string to avoid reversing characters again.

* return new String(charArray, 0, endIndex);: Returns a new string created from the charArray character array, starting from position 0 to the endIndex index. This represents the reversed string.

![image](https://github.com/abressam/challenge-siemens/assets/71531467/da3761c0-f790-47be-a049-28ec6936cd82)

## 💡 Question Eleven - Result

![image](https://github.com/abressam/challenge-siemens/assets/71531467/e6eccd09-1205-4184-9342-b0a3377bd78b)
