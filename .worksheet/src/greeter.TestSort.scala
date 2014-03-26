package greeter

object TestSort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet");$skip(33); 
  
  val arr = Array(3, 4, 2, 1);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(496); 

  
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
  	
  };System.out.println("""qsort: (arr: Array[Int])Array[Int]""");$skip(31); 
    
  val result = qsort(arr);System.out.println("""result  : Array[Int] = """ + $show(result ))}

  
}
