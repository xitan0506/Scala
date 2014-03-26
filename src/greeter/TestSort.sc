package greeter

object TestSort {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val arr = Array(3, 4, 2, 1)                     //> arr  : Array[Int] = Array(3, 4, 2, 1)

  
  /*
  def qsort[T](arr : Array[T]) : Array[T] = {
  	if(arr.length <=0 ) arr
  	
  	val mid = (arr.length + 1)/2
  	val pivot = arr(mid)
  	
  	arr.filter(_>pivot)
  
  }*/
  
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