import scala.io.Source

class File {

  def open(input:String): String = {
    val it = Source.fromFile("File/"+input).getLines().toList
    return it.toString()
  }
}