var str = "It is a good mobile";

function Q2(str) {
    if (str.length > 0) {
        let str1 = str.split(" ");
        console.log(str1);
    }
    else {
        console.log("String is less than 0");
    }
    //return str1;  -   //returning the value of strres
    // but it will not be returned as the scope of let is only within the function .
}

Q2(str);