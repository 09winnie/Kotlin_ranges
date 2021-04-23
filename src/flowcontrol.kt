fun main(){
    odd()
    println(character(arrayOf("Melante","Lavington","Mike","Jackie","Winky","Kimberly","Tiffanny")))
    drinks(8)
    drinks(3)
    drinks(19)
    numbers()
}
fun odd() {
    for ( nums in 1..100) {
        if(nums%2!==0){
            println(nums) }
    }
}
fun character (names:Array<String>):Int{
    var count=0
    for(items in names){
if (items.count()>5){
    count++
}}
    return count
}
fun drinks(age:Int){
    if(age<6){
        println("serve a glass of milk")
    }
    else if(age>6 && age<15){
        println("serve a bottle of fanta orange")
    }
    else{println("serve a bottle of CocaCola")}
}
fun numbers(){
    for (nums in 1..100){
        println(nums)
        if(nums%3==0 && nums%5==0){
            println("FizzBuzz")
        }
      else if(nums%3==0){
          println("Fizz")
    }
        else if(nums%5==0){
            println("Buzz")
        }
       else{println(nums)}
}}