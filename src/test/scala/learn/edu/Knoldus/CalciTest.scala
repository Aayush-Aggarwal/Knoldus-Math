package learn.edu.Knoldus

/**
  * Created by knoldus on 7/16/17.
  */
class CalciTest extends org.scalatest.FunSuite {

  val cal =new Calci()
  test("Addition of two numbers"){

    assert(cal.add(1,2)===3)
  }

  test("Subtraction of two numbers"){

    assert(cal.sub(6,2)===4)
  }


  test("Division of two numbers"){

    assert(cal.div(8,2)===4)
  }

  test("Division by zero"){

    intercept[IllegalArgumentException] {
      cal.div(5, 0)
    }
  }


  test("Multiplication of two numbers"){

    assert(cal.mul(3,5)===15)
  }


  test("Power of any numbers"){

    assert(cal.pow(2,3)===8)
  }


  test("Power of negative numbers") {

    intercept[IllegalArgumentException] {
      cal.pow(2, -3)
    }
  }


  test("Mod of a numbers"){

    assert(cal.mod(8,3)===2)
  }


  test("Mod with negative numbers"){

    intercept[IllegalArgumentException] {
      cal.mod(8, 0)
    }
  }


  test("Absolute of a positive  numbers"){

    assert(cal.abs(5)===5)
  }

  test("Absolute of a negative  numbers"){

    assert(cal.abs(-5)===5)
  }

  test("Maximum of two numbers"){

    assert(cal.max(3,5)===5)
  }

  test("Minimum of two numbers"){

    assert(cal.min(3,5) === 3)
  }


}
