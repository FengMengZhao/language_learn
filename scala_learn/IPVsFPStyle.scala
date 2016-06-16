def printArgs(args: Array[String]): Unit = {
  var i = 0 ;
  while(i < args.length){
    println(args(i))
    i += 1
  }
}
printArgs(Array("fmz", "cll", "wlm"))

def printArgsFunc(args: Array[String]): Unit = {
  for(arg <- args)
    println(arg)

  args.foreach(println)
}
printArgsFunc(Array("fmz", "cll", "wlm"))

def formatArgs(args: Array[String]) = args.mkString("\n")
val res = formatArgs(Array("fmz", "cll", "wlm"))
assert(res == "fmz\ncll\nwlm")
