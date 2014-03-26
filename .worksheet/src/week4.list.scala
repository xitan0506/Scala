package week4

object list {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet")}
}


trait List[T]{
	def isEmpty : Boolean
	def head : T
	def tail : List[T]
}


class Nil[T] extends List[T] {

	def isEmpty : Boolean = true
	
	def head : Nothing = throw new NoSuchElementException("Nil.head")
	
	def tail : Nothing = throw new NoSuchElementException("Nil.tail")
}


class Cons[T] extends List[T] {
	def isEmpty = false

}
