package mexmath.foundation.week1.topic

import mexmath.foundation.week1.topic.arbitraries.given
import mexmath.foundation.week1.topic.arithmetic.*
import org.scalacheck.*
import org.scalacheck.Prop.{forAll, propBoolean}

object ArithmeticSpecification extends Properties("Arithmetic"):

  include(Nat3AdditionSpecification)
  include(Nat3MultiplicationSpecification)
  include(ExpressionAdditionSpecification)
  include(ExpressionMultiplicationSpecification)

end ArithmeticSpecification

object Nat3AdditionSpecification extends Properties("Nat3 Addition"):

  property("Zero + Zero must be Zero") = propBoolean {
    (Zero + Zero).evaluate == Zero
  }

  property("Zero + value must be value") = forAll { (value: Nat3) =>
    (Zero + value).evaluate == value
  }

  property("value + Zero must be value") = forAll { (value: Nat3) =>
    (value + Zero).evaluate == value
  }

  property("One + One must be Two") = propBoolean {
    (One + One).evaluate == Two
  }

  property("One + Two must be Zero") = propBoolean {
    (One + Two).evaluate == Zero
  }

  property("Two + One must be Zero") = propBoolean {
    (Two + One).evaluate == Zero
  }

  property("Two + Two must be One") = propBoolean {
    (Two + Two).evaluate == One
  }

  property("left + right must be correctly evaluated") = forAll { (left: Nat3, right: Nat3) =>
    (left + right).evaluate == (left.evaluate + right.evaluate).evaluate
  }

end Nat3AdditionSpecification

object Nat3MultiplicationSpecification extends Properties("Nat3 Multiplication"):

  property("Zero * value must be Zero") = forAll { (value: Nat3) =>
    (Zero * value).evaluate == Zero
  }

  property("value * Zero must be Zero") = forAll { (value: Nat3) =>
    (value * Zero).evaluate == Zero
  }

  property("One * value must be value") = forAll { (value: Nat3) =>
    (One * value).evaluate == value
  }

  property("value * One must be value") = forAll { (value: Nat3) =>
    (value * One).evaluate == value
  }

  property("Two * Two must be One") = propBoolean {
    (Two * Two).evaluate == One
  }

  property("left * right must be correctly evaluated") = forAll { (left: Nat3, right: Nat3) =>
    (left * right).evaluate == (left.evaluate * right.evaluate).evaluate
  }

end Nat3MultiplicationSpecification

object ExpressionAdditionSpecification extends Properties("Expression Addition"):

  property("Zero + expression must be value") = forAll { (expression: Expression) =>
    (Zero + expression).evaluate == expression.evaluate
  }

  property("expression + Zero must be value") = forAll { (expression: Expression) =>
    (expression + Zero).evaluate == expression.evaluate
  }

  property("left + right must be correctly evaluated") = forAll { (left: Expression, right: Expression) =>
    (left + right).evaluate == (left.evaluate + right.evaluate).evaluate
  }

end ExpressionAdditionSpecification

object ExpressionMultiplicationSpecification extends Properties("Expression Multiplication"):

  property("Zero * expression must be Zero") = forAll { (expression: Expression) =>
    (Zero * expression).evaluate == Zero
  }

  property("expression * Zero must be Zero") = forAll { (expression: Expression) =>
    (expression * Zero).evaluate == Zero
  }

  property("left * right must be correctly evaluated") = forAll { (left: Expression, right: Expression) =>
    (left * right).evaluate == (left.evaluate * right.evaluate).evaluate
  }

end ExpressionMultiplicationSpecification
