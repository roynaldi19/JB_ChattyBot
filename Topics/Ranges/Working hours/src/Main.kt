fun main() {
    val time = readln().toInt()
    val workTime = 9..18
    val lunchTime = 13..14
    // do not change the code above
    // put your code here

    if (time in lunchTime){
        println("false")

    } else if (time in workTime){
        println("true")
    } else {
        println("false")
    }

}