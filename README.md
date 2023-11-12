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
3. [Question Six](#6)
4. [Question Eight](#8)
5. [Question Nine](#9)
6. [Question Ten](#10)
7. [Question Eleven](#11)

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


