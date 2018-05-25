import org.scalatest._
import Matchers._

class UrlTest extends FunSuite with Matchers{
  val obj = new Url
  val a = obj.JsonParse("https://sport.detik.com/sepakbola/uefa/d-4036390/road-to-final-liga-champions-20172018-real-madrid").toString()
  a should not be empty
}
