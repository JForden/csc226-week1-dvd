# Assignment 1: Recap

## Overview:

This assignment is a soft reintroduction to the elements you learned in CSC110 and CSC111. 

The core concepts covered in this lesson include:
- Arrays
- Interfaces
- File Reading
- Looping structures
- Conditionals
- Class creation
- Exceptions


## Provided Files:

This assignment provides you with multiple starting files. 
- `IMDB.java` is the interface that outlines all the required methods that you need to implement.
- `videoObj.java` is the class file that you implement `IMDB.java` in.
- `subset.title.basics.tsv` is a tab seperated file(`tsv`) that contains a subset of IMDB's non-commercial datasets. This provides a uniqueID and provides basic show information. 
- `subset.title.ratings.tsv` contains the uniqueID and maps a show to it's ratings and vote counts

You can find more specific information on IMDB's tsv format [here](https://developer.imdb.com/non-commercial-datasets/)

## TODO's

You must implement the `.java` files. In addition, you need to complete `main.java` as a runner program. Each required function will have a comment with more specific details. 

This program is responsible for:
- parsing in the information found in both `tsv` files
- aggregating them into a unified object
- ensuring data correctness(removal of incomplete objects)
- handling all exceptions

