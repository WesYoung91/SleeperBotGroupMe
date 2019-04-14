import com.beust.klaxon.Klaxon
import java.io.File
import java.io.FileReader

data class Message(val text: String,val name: String)

fun main(args: Array<String>) {
    val klaxon = Klaxon()
    //val parsed = klaxon.parseJsonArray(FileReader(json))
    val parsed = klaxon.parse<Message>(FileReader(json))
    //val dataArray = parsed.get("text")
println()
        ////File("C:\\Workspace\\GroupMe\\src\\main\\kotlin\\test.txt").printWriter().use { out ->
    //    for(data in dataArray){
        //    out.print(" " +data)
      //  }
   // }



}


val json = "C:\\Workspace\\GroupMe\\src\\main\\kotlin\\message.json"