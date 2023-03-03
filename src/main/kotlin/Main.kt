import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>) {

    embeddedServer(io.ktor.server.netty.Netty, port = 4207) {
        createKtorApplication()
    }.start(wait = true)
}

fun Application.createKtorApplication() { //extension function. this function has the same "this" reference that the place where it is being called (line 8)
    routing {
        get("/") {
            call.respondText("Hello, world!");
        }
    }
}