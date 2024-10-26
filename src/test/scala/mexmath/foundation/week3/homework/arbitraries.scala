package mexmath.foundation.week3.homework

import mexmath.foundation.week3.homework.naturals.{Nat, Succ, Zero}
import org.scalacheck.*
import org.scalacheck.Gen.lzy

object arbitraries:

  val genZero: Gen[Zero] = Gen.const(Zero)

  def genSucc(nat: Nat = Zero): Gen[Succ] =
    Gen.frequency((1, Gen.const(Succ(nat))), (3, lzy(genSucc(Succ(nat)))))

  val genNat: Gen[Nat] = ???

  given Arbitrary[Zero] = ???
  given Arbitrary[Succ] = ???
  given Arbitrary[Nat]  = ???
