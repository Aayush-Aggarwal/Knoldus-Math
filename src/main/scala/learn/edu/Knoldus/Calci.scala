package learn.edu.Knoldus

/**
  * Created by knoldus on 7/16/17.
  */
class Calci {

  def add(a:Int,b:Int):Int= a + b

  def sub(a:Int,b:Int):Int=a-b

  def div(a:Int,b:Int):Int={

    require(b!=0)
    a/b
  }

  def mul(a:Int,b:Int):Int=a*b

  def pow(a:Int,b:Int):Int= {
    require(b>0)
    def cal(c: Int, d: Int, out: Int): Int = {
      if (d == 0)
        out
      else
        cal(c,d-1,out*a)

    }
    cal(a,b,1)
  }

  def mod(a:Int,b:Int):Int={
    require(b!=0)
    a%b
  }

  def abs(a:Int):Int={
    if(a<0)
      a*(-1)
    else
      a
  }

  def max(a:Int,b:Int):Int={

    if(a>b)
      a
    else
      b
  }

  def min(a:Int,b:Int):Int={

    if(a<b)
      a
    else
      b
  }

}
