fun main(){
    var p=arrayofnum(arrayOf(20,57,30,41))
    println(p)
    var o=(mixedtypes(arrayOf( 5.785F,"true",7,45.87,66)))
    println(o)

}
//create a function that takes in an array of numbers and returns it product
fun arrayofnum(numbers:Array<Int>):Int{
    var product=1
    numbers.forEach { number->
        product*=number
    }
        return product
    }

////write a function that takes in an array of mixed types and returns the sum of all decimal elements.
fun mixedtypes(mixedArray: Array<Any>):Double{
    var sum =0.00
    mixedArray.forEach { number->
        if (number is Double){
            sum+=number
        }
    }
    return sum
}



