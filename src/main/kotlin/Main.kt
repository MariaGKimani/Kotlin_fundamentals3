fun main() {
    operators()
    operators1()
//    bank()
    interest()

}
fun operators(){
    var a = 76.254
    var b = 3.867
    println( a + b)
    println( a - b)
    println( "Multiplication ${a * b}")
    println( a / b)
    println( a % b)
}
fun operators1(){
    var kilo = 29.99
    println( 0.3333 * 29.99)
    ///or////or///

    var amount = kilo * 1F/3
    println("Your total is ${amount}")
}
fun bank(){
    println("Check account Balance: ")
    val bal = readLine()?:""
    val bala = bal.toDouble() *3
    println("Your balance is now ${bal.toInt() * 3}")
    println("your balance is $bala")
}
//Read from the console the amount the user has in their bank account.
//
//The interest on that account is 5.5% per year.
//
//How much would that user have in 5 year
fun interest(){
    println("write balance: ")
    val userInterest = readLine()?:""
    val gain = userInterest.toDouble() * 0.055 * 5
    println("Your interest after 5 years is $gain + $userInterest")
}


