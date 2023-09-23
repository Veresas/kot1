fun main(args: Array<String>) {

    var str = readln();
    val sorStr = str.toCharArray()
        .sorted()
        .joinToString(separator = "")
    var i = 0;
    var count = 0;
    var itogStr = "";
    var currentChar = sorStr[0];
    /*for(item in 1.. str.substring(1).length){
        if(currentChar == str[item]){
            count++;
        }
    }*/

    sorStr.forEach {
        if(it == currentChar)
        {
            count++;
        }else{
            itogStr += currentChar;
            if(count > 1){
                itogStr += count;
            }
            i++;
            currentChar = it;
            count = 1;
        }
    }
    itogStr += currentChar;
    if(count > 1){
        itogStr += count;
    }
    for(j in 0..i+2 step 2){
        println(itogStr[j] + "-" + itogStr[j+1]);
    }

    println("Program arguments: ${args.joinToString()}")
}