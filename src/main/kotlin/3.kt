fun main(args: Array<String>) {

    print("Введите целое число: ")
    var str = readln();
    var a = str.toInt();
    val b: String = Integer.toBinaryString(a);

    println( str + " в двочиной системе: " + b);

    println("Program arguments: ${args.joinToString()}")
}