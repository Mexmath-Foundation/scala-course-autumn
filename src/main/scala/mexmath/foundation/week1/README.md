# Week 1

This week in the topic we are building a simple model for arithmetic over Z<sub>3</sub>.

```
Nat3       ::= Zero | One | Two
Expression ::= Nat3 | (Expression + Expression) | (Expression * Expression)
```

In the homework it is required to build a model for a Boolean algebra.

```
Boolean    ::= True | False
Expression ::= Boolean | !Expression | (Expression ∧ Expression) | (Expression ∨ Expression) | (Expression → Expression)
```

Requirements:
* all `???` must be implemented;
* it is not allowed to use Scala 2 syntax if Scala 3 syntax is applicable (i.e. curly braces `{...}` instead of semicolon `:` and tabulations).


## ???
```scala 3
  case class Negation(expression: Expression) extends Expression:

    def evaluate: Boolean = ???
    
    override def toString: String = ???
```

Review
* [What does '???' (three question marks) mean in Scala?](https://alvinalexander.com/scala/what-does-three-question-marks-in-scala-mean/)

## Traits and Sealed Traits

```scala 3
sealed trait Expression:
  def evaluate: Nat3
```
Review
* [Traits](https://docs.scala-lang.org/tour/traits.html)
* [Sealed Keyword in Scala](https://www.baeldung.com/scala/sealed-keyword)

## Case Classes and Case Objects

```scala 3
type Zero = Zero.type
case object Zero extends Nat3

case class Addition(left: Expression, right: Expression) extends Expression
```

Review
* [Case Classes](https://docs.scala-lang.org/tour/case-classes.html)
* [Case Objects](https://docs.scala-lang.org/scala3/book/domain-modeling-tools.html#case-objects)

## Extension Methods

```scala 3
extension (expr: Expression)
    
  @targetName("Addition")
  infix def +(that: Expression): Addition = Addition(expr, that)

  @targetName("Multiplication")
  infix def *(that: Expression): Multiplication = Multiplication(expr, that)
```

Review
* [Extension Methods in Reference](https://docs.scala-lang.org/scala3/reference/contextual/extension-methods.html)
* [Extension Methods in Scala Book](https://docs.scala-lang.org/scala3/book/ca-extension-methods.html)
* [Extension Methods in Scala 3](https://www.baeldung.com/scala/extension-methods)

## ScalaCheck
* [ScalaCheck: Property-based testing for Scala](https://scalacheck.org/)
* [Introduction to ScalaCheck](https://www.baeldung.com/scala/scalacheck)

#### ScalaCheck Generators
```scala 3
val genAddition: Gen[Addition] =
  for
    left  <- genExpression
    right <- genExpression
  yield Addition(left, right)
```
Review

* [ScalaCheck Generators](https://www.scala-exercises.org/scalacheck/generators)
* [Building useful Scalacheck Generators](https://medium.com/@supermanue/building-useful-scalacheck-generators-71635d1edb9d)

#### ScalaCheck Arbitraties

```scala 3
given Arbitrary[Nat3] = Arbitrary(genNat3)
```

Review
* [ScalaCheck Arbitraries](https://www.scala-exercises.org/scalacheck/arbitrary)

#### ScalaCheck Properties

```scala 3
property("Zero + Zero must be Zero") = propBoolean {
  (Zero + Zero).evaluate == Zero
}

property("Zero + value must be value") = forAll { (value: Nat3) =>
  (Zero + value).evaluate == value
}
```
Review
* [ScalaCheck Properties](https://www.scala-exercises.org/scalacheck/properties)

