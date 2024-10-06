## Mexmath Foundation at Karazin University 
Join us on [LinkedIn](https://www.linkedin.com/company/mexmath-foundation).

# Scala Course Autumn

## Documentation and Resources
* [Scala 3 Reference](https://docs.scala-lang.org/scala3/reference/)
* [Documentation](https://docs.scala-lang.org/)
* [Документація](https://docs.scala-lang.org/uk/)
* [Scala 3 Book](https://docs.scala-lang.org/scala3/book/introduction.html)
* [Introduction to Scala 3](https://www.baeldung.com/scala/dotty-scala-3)
* [Scala Exercises](https://www.scala-exercises.org/)

## External Courses
* [Functional Programming Principles in Scala](https://www.coursera.org/learn/scala-functional-programming?specialization=scala) (Scala 2 in general)
* [Functional Programming in Scala Specialization](https://www.coursera.org/specializations/scala) (Scala 2 in general)

## Telegram community
* [Scala Ukraine](https://t.me/scala_ukraine)

## Course format
Each homework relates to each week in the code, i.e. `week1`, `week2` and so one. 
For each week there are to main parts: `topic` and `homework` for both `main` and `test`. 
In the `topic` the relevant material is explained and template tests are provided. 
The `homework` contains similar to the `topic` code or approach that should be implemented or improved.
Test are required and integral part of the contract unless otherwise stated. 

### The requirements to pass the homework to a review
Violation of any of the rules results leads to a homework not being checked.
* The `main` and `test` code must compile.
* The tests must be implemented unless otherwise stated.
* The tests must pass.
* The code must follow the code format rules.

The student may send an incomplete homework to verify any assumptions but the incompleteness of the homework must be explicitly stated.

## Code style
[scalafmt](https://scalameta.org/scalafmt/) code formatter for Scala is used in the project.
The code must be reformatted after being commited.


## How to start
* Create GitHub account (if needed)
* Clone (not fork) the repo
* Create your own private repo
* Push the local clone to your private repo
* Create a new branch for each homework

### Create GitHub account
Open https://github.com/ and follow the sign-up procedure.
It's better to choose a professional-like name, usually `[First][Last]` name
(my personal GitHub account is https://github.com/IgorWolkov).

### Create a new repository on GitHub
Create a new empty **private** repository on GitHub. Please name it as the original repository `scala-course-autumn`.

### Clone the course repository
The course repository is [here](https://github.com/Mexmath-Foundation/scala-course-autumn).
You can either use Intellij IDE or do it manually.
For manually cloning move to the directory you'd like the project to be located and execute
````shell
git clone https://github.com/Mexmath-Foundation/scala-course-autumn.git
````

Please **do not** fork the repository.

### Verify the cloned repository
#### Check the remote
```shell
git remote -v
```
the output should be
```shell
origin	https://github.com/Mexmath-Foundation/scala-course-autumn.git (fetch)
origin	https://github.com/Mexmath-Foundation/scala-course-autumn.git (push)
```
#### Check the branches
```shell
git branch
```
the output should be
```shell
* main
```

### Prevent accidental updates
To detouch the course repository from your private remote repository rename `origin` and disable `push` to the course repository.

#### Rename origin
```shell
git remote rename origin course
```
execute `git remote -v`, the output should be
```shell
course	https://github.com/Mexmath-Foundation/scala-course-autumn.git (fetch)
course	https://github.com/Mexmath-Foundation/scala-course-autumn.git (push)
```
#### Disable push
To prevent pushing to the course repository replace push url by any non-existent url, i.e. DISABLED
```shell
git remote set-url --push course DISABLED
```
execute `git remote -v`, the output should be
```shell
course	https://github.com/Mexmath-Foundation/scala-course-autumn.git (fetch)
course	DISABLED (push)
```

### Link the local repository to your private repository
To link the local repository to your private GitHub repository add new `origin`.

#### Open the newly created repository
Open your new GitHub repository web page and follow the instructions in `…or push an existing repository from the command line` section.
There should be a list of commands:
```shell
git remote add origin <your private repository>
git branch -M main
git push -u origin main
```
Execute each command one-by-one.

Execute `git remote -v`, the output should be
```shell
course	https://github.com/Mexmath-Foundation/scala-course-autumn.git (fetch)
course	DISABLED (push)
origin  https://github.com/<your github account>/scala-course-autumn.git (fetch)
origin  https://github.com/<your github account>/scala-course-autumn.git (push)
```

To verify that all works, go to the folder with the source code and run
```shell
sbt clean compile
```

### Get updates from the course repository
To fetch updates from the course repository execute
```shell
git pull course main
```

### New branch for each homework
**Do not** solve the homework tasks in `main` branch. You required to create a new branch for each homework.
Create a branch for a new homework only when the previous homework is accepted and merged to `main` branch.
Naming convention for homework branches:
* `week-1` for week 1
* `week-2` for week 2
* ...
* `week-n` for week n
  Please follow this name convention.

### How to run the project, test etc


```shell
sbt clean
```

To compile the project source code (except tests source code) run

```shell
sbt compile
```

To compile the tests run
```shell
sbt test:compile
```

To execute the tests run
```shell
sbt test
```

To execute a specific test suite run
```shell
sbt testOnly <full path to the test suite>
```
for example for `mexmath.foundation.week1.topic.ArithmeticSpecification` run

```shell
sbt testOnly mexmath.foundation.week1.topic.ArithmeticSpecification
```

To format the code run
```shell
sbt scalafmt
```

All the command can be run in 
`'sbt shell'` without `'sbt'` prefix.