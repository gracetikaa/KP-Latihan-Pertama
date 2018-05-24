import java.io.File
import java.io.PrintWriter
import scala.io.Source

object MainUrl extends App {
  try {
    print("Input : ")
    val n = scala.io.StdIn.readLine()

    val f = new Url
    //f.getTitle(n)
    //f.getContent(n)
    println(f.JsonParse(n))
    val writer = new PrintWriter(new File("crawl.JSON"))
    writer.write(f.JsonParse(n).toString())
    writer.close()
  }
  catch {
    case unknown => println("Error : " + unknown)
  }

}
