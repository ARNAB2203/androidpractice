package com.example.codingtest

/**

There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i
to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

To solve this problem, we need to understand and use the following 2 facts:
1) if the sum of gas >= the sum of cost, then the circle can be completed.
2) if A can not reach C in a the sequence of A-->B-->C, then B can not make it either.

 */
fun main() {
    //array for petrol capacity per station.
    val petrol = arrayOf(1, 2, 3, 4, 5)
    //array for distance from one station to other station.
    val distance = arrayOf(4, 5, 1, 2, 3)
    //variable to store sum value.
    var sum = 0
    //variable to store difference value.
    var diff = 0
    //variable to store starting point.
    var start = 0

    for (i in 0..petrol.size) {
        //sum+diff >=0 --> Possible
        //sum+diff<0 --> Never possible to complete loop
        print("Index >>>>>>>>>>>>>>>>>>>>>>>>>" + i + "\n")
        //calculating sum value
        sum = sum + petrol[i] - distance[i]
        print("sum = " + sum + "\n")
        //if sum less than zero then calculating difference
        if (sum < 0) {
            //last entry into the loop, next to that index will be the
            //starting point.
            start = i + 1
            //calculating difference value
            diff = diff + sum
            print("diff = " + diff + "\n")
            //if sum less than zero means sum has no value.
            //that value will go too diff and sum will be zero.
            sum = 0
        }
        //sum+diff >=0 --> Possible
        //sum+diff<0 --> Returning -1
        if (sum + diff >= 0) {
            print("Start is @@@@@@@@@@@@@@ " + start + "\n")
        } else {
            print("Not starting point : " + start + " or can return -1\n")
        }
    }
}