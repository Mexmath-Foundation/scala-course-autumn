# karazin.cheatsheet

This package is a small, self-contained Scala 3 cheat sheet for the course.
Each file focuses on a single topic and includes short, runnable examples or
commented explanations.

## How to use
- Read the files in any order; they are independent.
- The only executable object is `karazin.cheatsheet.objects` in `objects.scala`.
  You can run it with:
  ```shell
  sbt "runMain karazin.cheatsheet.objects"
  ```
- Other files define objects, methods, and values meant for reading and
  exploration. Many examples are intentionally simple and are not meant to be
  copied into homework submissions.

## Contents
- `objects.scala`:
  - Singleton objects, namespaces, and optional `end` markers.
  - `extends App` and executable objects.
  - String interpolation examples.
- `classes.scala`:
  - Regular classes vs. case classes.
  - Constructor side effects and member visibility.
  - Named arguments.
- `` `access modifiers`.scala ``:
  - Public-by-default members.
  - `private` members and access limitations.
  - Backtick-based names for learning examples.
- `` `variables and values`.scala ``:
  - `val` vs. `var` and why `var` is discouraged.
  - Explicit type annotations.
  - Naming conventions (camelCase vs. snake_case).
- `` `methods and functions`.scala ``:
  - Methods and functions as values.
  - Higher-order functions and currying.
  - Method-to-function conversions.
- `` `conditions and pattern-matching`.scala ``:
  - `if-then-else` as an expression.
  - Pattern matching basics and guards.
  - List and case class decomposition.
  - Regex patterns and sealed trait exhaustiveness.
- `style.scala`:
  - Naming guidelines.
  - Scala 3 indentation syntax vs. brace-based style.
  - Why `return` and `println` are discouraged for homework.

## Notes on backticks and file names
Some files and objects use backticks to allow spaces in names. This is for
learning purposes only and should not be used in production or homework code.

In Scala code, backticks allow unusual identifiers:
```scala
object `variables and values`:
  val `for learning purposes only` = "..."
```

## Expectations for homework
These files illustrate the syntax, including examples that are explicitly
discouraged in homework (for example, `var`, `return`, and `println`-based
logging). Treat them as reference material only.
