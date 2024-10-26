# Week 2

This week in the topic we are extending a simple model for arithmetic over Z<sub>3</sub> with variables and substitution functionality.

In the homework it is required to extend the  model for a Boolean algebra with variables and substitution functionality.

Requirements:
* all `???` must be implemented;
* it is not allowed to use Scala 2 syntax if Scala 3 syntax is applicable (i.e. curly braces `{...}` instead of semicolon `:` and tabulations).


## Conversion
```scala 3
given Conversion[String, Variable] with
  def apply(str: String): Variable = Variable(str)
```

Review
* [Implicit Conversion Reference](https://docs.scala-lang.org/scala3/reference/contextual/conversions.html)
* [Implicit Conversion Scala Book](https://docs.scala-lang.org/scala3/book/ca-implicit-conversions.html)
* [Implicit Conversion Baeldung](https://www.baeldung.com/scala/scala-3-implicit-redesign#2-usage-in-scala-3)

## ScalaCheck

#### ScalaCheck Conditional Properties

```scala 3
property("substitution into different variable should make no changes") = forAll { (v1: Variable, v2: Variable, expression: Expression) =>
  v1 != v2 ==> {
    v1.substitute(v2, expression) == v1
  }
}
```
Review
* [Conditional Properties](https://github.com/typelevel/scalacheck/blob/main/doc/UserGuide.md#conditional-properties)

