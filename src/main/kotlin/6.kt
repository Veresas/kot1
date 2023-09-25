fun main(args: Array<String>) {

    var a = 0;
    print("Введите первое число: ")
    var str1 = readln();

    print("Введите второе число: ")
    var str2 = readln();

    var str3 = str1 + str2;

    var chis = str3.toInt();


    if(chis % 2 != 0){
        println(str3);
        a++;
    }

    str3 = str2 + str1;

    chis = str3.toInt();

    if(chis % 2 != 0){
        println(str3);
        a++;
    }
    if(a == 0){
       println("Создать нечетное число невозможно");
    }
}