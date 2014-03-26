package week4


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


class Cons[T](val head : T, val tail : List[T]) extends List[T] {
	def isEmpty = false

}


object List{
  /*
  def apply[T](x1 : T, x2 : T) : List[T] = new Cons(x1, new Cons(x2, new Nil) )
  
  def apply[T]() : List[T] = new Nil
  
  def apply[T](x1 : T) : List[T] = new Cons(x1, new Nil)
  
*/
    def main(args : Array[String]) = {
  
	    println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	  
	    val arr = Array(3, 4, 2, 1)                     //> arr  : Array[Int] = Array(3, 4, 2, 1)
	  
	  def qsort(arr : Array[Int]) : Array[Int] = {
	  	if(arr.length <=0 ) arr
	  	
	  	val mid = (arr.length + 1)/2
	  	val pivot = arr(mid)
	  	
	  	val greaterArray = arr.filter(_>pivot)
	  	val equalArray = arr.filter(_==pivot)
	  	val lessArray = arr.filter(_<pivot)
	  	
	  	greaterArray ++ equalArray ++ lessArray
	  	
	  }                                               //> qsort: (arr: Array[Int])Array[Int]
	    
	  val result = qsort(arr)                         //> result  : Array[Int] = Array(3, 4, 2, 1)

    }
}

