open class Human2(val name:String){
    open fun attack(){
        println("$name use Fist Attack")
    }
}

class Mage2(name:String): Human2(name){
    override fun attack(){
        val mana = 2
        if(mana > 5){
            println("$name use Fireball!")
        } else {
            println("$name is lack of mana.")
        }
    }
}
fun main(){
    val instanceOfMage = Mage2("Bibby").attack()
}