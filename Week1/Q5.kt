open class Human1(val name:String){
    open fun attack(){
        println("$name use Fist Attack!")
    }
}
class Mage1(name:String): Human1(name){
    override fun attack(){
        println("$name use Fireball!")
    }
}
fun main(){
    val instanceOfMage = Mage1("Jake").attack()

}
