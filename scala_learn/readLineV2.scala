import scala.io.Source

def withOfLength(s: String) = s.length.toString.length

if(args.length > 0){
  val lines = Source.fromFile(args(0)).getLines().toList
  val longestLine = lines.reduceLeft(
    (a,b) => if(a.length > b.length) a else b
    )
  val maxWidth = withOfLength(longestLine)
  for(line <- lines){
    val numSpace = maxWidth - withOfLength(line)
    val padding = " " * numSpace
    println(padding + line.length + " | " + line)
  }
}else
  Console.err.println("Please enter filename")

