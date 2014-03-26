package greeter

object qsort {
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val arr = Array(3, 4, 2, 1)                     //> arr  : Array[Int] = Array(3, 4, 2, 1)
  
  def qsort(arr : Array[Int]) : Array[Int] = {
  	if(arr==null) arr
  	if(arr.length <=1 ) arr
  	
  	val mid = (arr.length)/2
  	val pivot = arr(mid)
  	  	
  	Array.concat(
  	qsort(arr filter (pivot>_)),
  	qsort(arr filter (pivot==_)),
  	qsort(arr filter (pivot<_)))
  	
  }                                               //> qsort: (arr: Array[Int])Array[Int]
    
  val result = qsort(arr)                         //> java.lang.ArrayIndexOutOfBoundsException: 0
                                                  //| 	at greeter.qsort$$anonfun$main$1.qsort$1(greeter.qsort.scala:14)
                                                  //| 	at greeter.qsort$$anonfun$main$1.qsort$1(greeter.qsort.scala:17)
                                                  //| 	at greeter.qsort$$anonfun$main$1.qsort$1(greeter.qsort.scala:17)
                                                  //| 	at greeter.qsort$$anonfun$main$1.apply$mcV$sp(greeter.qsort.scala:23)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at greeter.qsort$.main(greeter.qsort.scala:3)
                                                  //| 	at greeter.qsort.main(greeter.qsort.scala)
  
  
}