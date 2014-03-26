package greeter

object qsort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  
  println("Welcome to the Scala worksheet");$skip(33); 
  
  val arr = Array(3, 4, 2, 1);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(283); 
  
  def qsort(arr : Array[Int]) : Array[Int] = {
  	if(arr==null) arr
  	if(arr.length <=1 ) arr
  	
  	val mid = (arr.length)/2
  	val pivot = arr(mid)
  	  	
  	Array.concat(
  	qsort(arr filter (pivot>_)),
  	qsort(arr filter (pivot==_)),
  	qsort(arr filter (pivot<_)))
  	
  };System.out.println("""qsort: (arr: Array[Int])Array[Int]""");$skip(31); 
    
  val result = qsort(arr);System.out.println("""result  : Array[Int] = """ + $show(result ))}
  
  
}
