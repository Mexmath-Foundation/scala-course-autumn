package mexmath.foundation.week1.topic

import mexmath.foundation.week1.topic.arithmetic.*
import org.scalacheck.*
import org.scalacheck.Gen.lzy

object arbitraries:

  val genNat3: Gen[Nat3] = Gen.oneOf(Zero, One, Two)

  val genAddition: Gen[Addition] =
    for
      left  <- genExpression
      right <- genExpression
    yield Addition(left, right)

  val genMultiplication: Gen[Multiplication] =
    for
      left  <- genExpression
      right <- genExpression
    yield Multiplication(left, right)

  lazy val genExpression: Gen[Expression] =
    Gen.frequency((2, lzy(genNat3)), (1, lzy(genAddition)), (1, lzy(genMultiplication)))

  given Arbitrary[Nat3]       = Arbitrary(genNat3)
  given Arbitrary[Expression] = Arbitrary(genExpression)
