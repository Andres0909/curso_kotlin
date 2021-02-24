fun main() {

    //Inferencia de tipos
    val number: Int = 10
    val pi: Double = 3.1415
    val primo02 = 73
    print(number)


    //Conversion de tipos

    var integer: Int = 100
    var integer02: Int = 200
    var decimal: Double = 12.5

    integer = integer02

   var mosntruosPantall01: Int = 100
    var moscaVoladoraTriple: Double = 30.00


    mosntruosPantall01 = moscaVoladoraTriple.toInt()
    print(mosntruosPantall01)

    //operadores con tipos mixtos

    val hourlyRates: Double = 19.5
    val hourlyWorked: Int = 10
    val totalCost: Double = hourlyRates + hourlyWorked.toDouble()

    val typeInferedDouble = 3.14159

    val totalCost02 = hourlyRates * hourlyWorked
    print(totalCost02)
}
