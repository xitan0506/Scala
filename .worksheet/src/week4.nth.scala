package week4
import week4._
object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(240); 
	def nth[T]( n : Int, xs : List[T]) : T =
		if(n < 0) throw new IllegalArgumentException
	  else if(xs.isEmpty) throw new IndexOutOfBoundsException
	  else if(n==0) xs.head
	  else nth(n-1, xs.tail);System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""");$skip(68); 
	  
	  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : week4.Cons[Int] = """ + $show(list ));$skip(17); val res$0 = 
	
  nth(2, list);System.out.println("""res0: Int = """ + $show(res$0))}
   
    // val list = List(1)
  
      //println(list)
}
