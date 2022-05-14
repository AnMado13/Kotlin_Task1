import java.io.ByteArrayOutputStream
import java.io.PrintStream

object Helper {
    val console: PrintStream = System.out

    var bytesOutput: ByteArrayOutputStream = ByteArrayOutputStream()
    val printStreamNew: PrintStream = PrintStream(bytesOutput)
}