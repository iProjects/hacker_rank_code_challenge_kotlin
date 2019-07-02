package com.tech.nyax.hacker_rank_solve_me_first

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    println("enter two numbers to perform addition....")
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}


/*class MainActivity *//*: AppCompatActivity()*//* {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }


}*/
