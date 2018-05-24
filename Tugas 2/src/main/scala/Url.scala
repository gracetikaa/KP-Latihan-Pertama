import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import play.api.libs.json.{Json,JsValue}


class Url {
  val browser = JsoupBrowser()

  //  def printTitle(x : String) {
  //    val doc = browser.get(x)
  //    val title: String = doc >> text("title")
  //    println("Title : "+title)
  //  }
  //
  //  def printContent(x : String){
  //    val doc = browser.get(x)
  //    doc >> texts("p") foreach println
  //  }

  def JsonParse(x : String) : JsValue = {
    val doc = browser.get(x)
    val title: String = doc >> text("title")
    val konten = doc >> text("#detikdetailtext")
    val date = doc >> attr("content")("meta[name=publishdate]")
    val author = doc >> attr("content")("meta[name=author]")

    val json :JsValue = Json.obj(
      "title" -> title,
      "content"  -> konten,
      "author"  -> author,
      "date"  -> date
    )
    return json
  }
}
