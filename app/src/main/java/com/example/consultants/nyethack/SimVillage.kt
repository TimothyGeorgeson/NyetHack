package com.example.consultants.nyethack

fun main(args: Array<String>) {
    runSimulation()
}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}

fun printConstructionCosts(numBuildings: Int) {
    val cost = 500
    println("construction costs: ${cost * numBuildings}")
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("Adding $numBuildings $structureType")
    "Welcome to SimVillage, $playerName! (copyright $currentYear)"    } }