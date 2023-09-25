fun main(args: Array<String>) {

    print("Введите целое число: ")
    var str = readln();
    var n = str.toInt();

    print("Введите показатель степени: ")
    str = readln();
    var x = str.toInt();

    var y = 0;
    var powX = 1;
    do
    {
        powX = powX * x;
        y++;
    }while ((powX < n));

    if(powX == n)
    {
        println("Показатель степени: $y")
    }else{
        println("Целочисленный показатель не существует")
    }
    println("Program arguments: ${args.joinToString()}")
}