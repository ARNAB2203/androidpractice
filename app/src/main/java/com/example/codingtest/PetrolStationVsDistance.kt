package com.example.codingtest

fun main() {
    val petrol = arrayOf(1, 2, 3, 4, 5)
    val distance = arrayOf(4, 5, 1, 2, 3)
    var sum = 0
    var diff = 0
    var start = 0

    for (i in 0..petrol.size){
        //sum+diff >=0 --> Possible
        //sum+diff<0 --> Never possible to complete loop
        print("Index >>>>>>>>>>>>>>>>>>>>>>>>>"+i+"\n")
        sum = sum + petrol[i] - distance[i]
        print("sum = "+sum+"\n")
        if (sum<0) {
            start = i+1
            diff = diff+sum
            print("diff = "+diff+"\n")
            sum = 0
        }
        if (sum+diff>=0) {
            print("Start is @@@@@@@@@@@@@@ "+start+"\n")
        } else{
            print("Not starting point : "+start+"\n")
        }
    }

}