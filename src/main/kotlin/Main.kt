fun main(){
   name()
    println(greeting("Vallary", 22))
    println(Length( ""))
    word("Lavin")
}
fun name(){
val name = "akirachix"
    val nm ="${name[0]}${name[2]}${name[3]}"
    println(nm)


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
