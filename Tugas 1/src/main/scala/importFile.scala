
object importFile {
  def main(args: Array[String]) {
    try{
      print("Input nama file : ")
      val n = scala.io.StdIn.readLine()

      val f = new File
      println("Isi file :")
      println(f.open(n))
    }
    catch{
      case unknown => println("Error : " + unknown)
    }
  }
}
