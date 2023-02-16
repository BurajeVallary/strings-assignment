fun main(){
   name()
    println(greeting("Vallary", 22))
    println(Length( ""))
    word("Lavin")
}
fun name(){
val name = "akirachix"
println(name[0])
println(name[2])
println(name[3])
}

fun greeting (name:String,age:Int):String{
    val greet="Hi, my name is $name and I am $age years old."
    return greet
}

fun Length(str: String): Int {
    val str = "I am capable"
    return str.length
}
fun word (name: String){
    val z = "Lavin"
    if (z.equals(name))
       println("That's me")
       else
            println("I don't know who that is")

    }
