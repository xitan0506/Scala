package week3
import scala.util.Sorting
object Rational {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val r1 = new Rational(3, 4)                     //> r1  : week3.Rational = 3/4
  val r2 = new Rational(4, 5)                     //> r2  : week3.Rational = 4/5
  r1 add r2                                       //> res0: week3.Rational = 31/20
  val r3 = new Rational(1, 2)                     //> r3  : week3.Rational = 1/2
  
  r1 compare r2                                   //> res1: Int = -1
  
  val rationalList = Array(r1, r2, r3)            //> rationalList  : Array[week3.Rational] = Array(3/4, 4/5, 1/2)
  val result = Sorting.quickSort(rationalList)(RationalOrdering)
                                                  //> result  : Unit = ()
  
  //Sorting.quickSort(rationalList)(Ordering.by(Int, Int), Int)()
}



class Rational(x:Int, y: Int){
	def num = x
	def denum = y
	
	def add(that : Rational) : Rational = new Rational(num * that.denum + denum * that.num, denum * that.denum)
	def compare (that : Rational) : Int = if (this.num * that.denum <= this.denum * that.num) -1 else 1

	override def toString()  = { num + "/" + denum }
}

object RationalOrdering extends Ordering[Rational] {
	def compare(a : Rational, b : Rational) = a compare b
}