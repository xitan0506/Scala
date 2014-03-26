package week3
import scala.util.Sorting
object Rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(101); 
  println("Welcome to the Scala worksheet");$skip(30); 
  val r1 = new Rational(3, 4);System.out.println("""r1  : week3.Rational = """ + $show(r1 ));$skip(30); 
  val r2 = new Rational(4, 5);System.out.println("""r2  : week3.Rational = """ + $show(r2 ));$skip(12); val res$0 = 
  r1 add r2;System.out.println("""res0: week3.Rational = """ + $show(res$0));$skip(30); 
  val r3 = new Rational(1, 2);System.out.println("""r3  : week3.Rational = """ + $show(r3 ));$skip(19); val res$1 = 
  
  r1 compare r2;System.out.println("""res1: Int = """ + $show(res$1));$skip(42); 
  
  val rationalList = Array(r1, r2, r3);System.out.println("""rationalList  : Array[week3.Rational] = """ + $show(rationalList ));$skip(65); 
  val result = Sorting.quickSort(rationalList)(RationalOrdering);System.out.println("""result  : Unit = """ + $show(result ))}
  
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
