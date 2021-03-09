package Tema04

fun main() {

    val yes: Boolean = true
    val no = false

    val doesOneEqualTwo = {1 == 2}
    val finalValue = doesOneEqualTwo

    val doesOneNotEqualTwo = {1 != 2}
    val finalValue = doesOneNotEqualTwo

    val alsoTrue = !(1 == 2)

    print(alsoTrue)

    val isOneGreaterThanTwo = (1 >= 2)
    val isOneLessThanTwo = (1 <= 2)

    /*
    < Menor
    > Mator a
    == Comparacion si dos tipos son iguales
    <= Menor o igual
    >= Mayor o igual
    != Si es distinto de
     */
    // Operadores Booleanos

    val adn1: Boolean = false&& false
    val adn2 = true && true
    val adn3 = false && true
    val adn4 = true && false

    //Operador Booleanos OR

    val or02 = true || true
    val or03 = false || true
    val or04 = true || false


    //Igualdad de cadenas

    val guess = "dog"
    val dogEqualsCat = guess == "cat"
}