import org.scalatest._
import Matchers._

class FileClassTest extends FunSuite with Matchers{
  val obj = new File
  val a = obj.open("1.txt")
  a should be ("List(ini file teks)")
  }
