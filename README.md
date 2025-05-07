## Collections Study – Name and Gender List

A simple Java program that allows users to input a list of names and assign a gender to each. The application ensures proper formatting of names and standardizes gender inputs for consistency.

## Features

* Prompts the user to enter 5 names, separated by commas.
* Formats each name to have the first letter capitalized and the rest in lowercase.
* Sorts the list of names alphabetically.
* Prompts the user to assign a gender to each name, accepting various input formats:

* Accepts 'M', 'm', 'man', 'Masculino', etc., and standardizes to 'M'.
* Accepts 'W', 'w', 'woman', 'Feminino', etc., and standardizes to 'W'.
* Displays the final list with each name and its corresponding gender.

## How It Works

1. The program prompts the user to input 5 names, separated by commas.
2. Each name is trimmed of whitespace, formatted with proper capitalization, and added to a list.
3. The list of names is sorted alphabetically.
4. The program prompts the user to input the corresponding gender for each name, accepting various formats and standardizing them.
5. The final list is displayed, showing each name alongside its assigned gender.

## Technologies

* Language: Java
* IDE: VSCode
* Java Collections: ArrayList, Scanner, Collections.sort

## Example Output

```

****Let's make a 5 name list!****

Write 5 names, each separated by a comma.
> alice, Bob, charlie, diana, Edward

There is the names list:
[Alice, Bob, Charlie, Diana, Edward]

****Now, define the gender of each name in the list, in the same order as printed above****

Write 5 genres in order, each according to the name, each separated by a comma. (M/W)
> f, m, m, f, m

Alice - (W)
Bob - (M)
Charlie - (M)
Diana - (W)
Edward - (M)
```



## Getting Started

To run the program:

1. Ensure you have Java installed on your system.
2. Clone the repository:

   ```
   git clone https://github.com/igovargas/Collections-Study.git
   ```


3\. Navigate to the project directory:

```
cd Collections-Study
```


4\. Compile and run the program using your IDE.

