fun main(args: Array<String>) {

    print("Введите два числа и знак действия через пробел: ")

    var str = readln();
    val list = str.split(' ');
    var a = list[0].toDouble();
    var b = list[1].toDouble();
    var c = list[2].toString();
    var z = c[0].toChar();
    if(z == '/')
    {
        println("Частное равно: ${a / b}")
    }

    if(list[2] == "*")
    {
        println("Произведение равно:  ${a * b}");
    }

    if(list[2] == "-")
    {
        println("Разнасть равна:  ${a - b}");
    }

    if(list[2] == "+")
    {
        println("Сумма равна:  ${a + b}");
    }

    println("Program arguments: ${args.joinToString()}")
}