package week3



abstract class IntSet {
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean
}



class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
	def contains(x: Int): Boolean =
		if (x < elem) left contains x
		else if (x > elem) right contains x
		else true
	
	def incl(x: Int): IntSet =
		if (x < elem) new NonEmpty(elem, left incl x, right)
		else if (x > elem) new NonEmpty(elem, left, right incl x)
		else this
}

/*
object Empty extends IntSet {
	def contains(x: Int): Boolean = false
	def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
}
*/
object intSet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //new Empty()
  //val iSet = new NonEmpty(5, Empty, Empty)
}