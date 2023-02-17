package com.draccotech.execiciomodulo5

fun main(){

    val gol = Veiculo("Gol")

    val model: String = gol.getModel()
    println(model)

//    gol.acceleration()
//    gol.slowdown()

    for(i in 0 .. 9){
        gol.acceleration()
        gol.getVelocity()
    }
//
    for(i in 0 .. 9){
        gol.slowdown()
    }


}

/*
    Criar uma classe veículo que tenha as seguintes propriedades e
    métodos:
        * Propriedades:
            * Long velocity: Valor inicial 0
            * Long acceleration: Valor inicial 10
            * String model
        * Métodos:
            * Crie um método para incrementar a velocidade do carro
            que calcule a nova velocidade, somando o valor da propriedade acceleration
            ao da velocity
            * Crie um método para reduzir a velocidade do carro
            que calcule a nova velocidade, decrementando o valor da propriedade
            acceleration ao da velocity, salvando o resultado em velocity. Importante!
            O valor da velocidade nunca pode ser negativo
            * Crie um método que retorna a velocidade atual do veículo
 */
class Veiculo(
    private val model: String,
    private var velocity: Long = 0,
    private val acceleration: Long = 10
){

    fun acceleration(){
        this.velocity += this.acceleration
        getVelocity()
    }

    fun slowdown() {
        if (this.velocity <= this.acceleration) {
            this.velocity = 0
        } else {
            this.velocity -= this.acceleration
        }
        getVelocity()
    }

    fun getModel(): String{
        return this.model
    }


    fun getVelocity(){
        when (this.velocity) {
            in 0 .. 0 -> println("Carro parou! Velocidade: ${this.velocity} km/h")
            in 1..19 -> println("Velocidade: ${this.velocity} km/h. Você está mais rápido que um caracol")
            in 20..39 -> println("Velocidade: ${this.velocity} km/h. Você está mais rápido que uma tartaruga")
            in 40..59 -> println("Velocidade: ${this.velocity} km/h. Você está mais rápido que um canguru")
            in 60..79 -> println("Velocidade: ${this.velocity} km/h. Você está mais rápido que um cavalo")
            in 80..99 -> println("Velocidade: ${this.velocity} km/h. Você está mais rápido que um guepardo")
            else -> println("Velocidade: ${this.velocity} km/h. Você está muito rápido! Talvez seja melhor diminuir a velocidade")
        }
    }
}