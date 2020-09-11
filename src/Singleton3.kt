
object SingletonA {

    init{
        println("SingletonA class invoked")
    }

    var name="Kotlin Objects A"


    fun printName(){
        println(name)
    }
}
class A1{
    companion object{
        object SingletonA {
            init {
                println("SingletonB class invoked")
            }

        }
    }
    init {
        println("class init method .Singleton name property :${Singleton.name}")
        Singleton.printName()
    }
}
fun main() {
    Singleton.printName()
    Singleton.name=" kk "
    var  a=A()
}