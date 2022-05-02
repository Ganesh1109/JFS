/*
//1
document.write("Hello World!\n");
console.log("Hello World!\n");


//2
var name = window.prompt("Q2 - Enter your name: "); 
document.write("Hello " + name + "!\n");
console.log("Hello " + name + "!");

//3
var name = window.prompt("Enter your Name");
if(name =="Alice"||name=="Bob")
{
    document.write("Welcome "+ name);
}
else{
    document.write("You're not Alice or Bob");
}


//4
function sumofnumbers(n) {
    var i,sum=0;
    for( i = 1; i <= n; i++) {
        sum=sum+i;
    }
    return sum;
}

var result = sumofnumbers(window.prompt("Q4 - Enter number for sum of numbers:"))
document.write(result);



//6
var num = prompt("Q6 - Enter Number:");
var operation = prompt("Enter sum for Sum or Enter prod for Product");5
var sum = 0;
if(operation=="sum"){
    for(i=1;i<=num;i++){
        sum=sum+i;
    }
document.write("Sum of numbers "+num+"="+sum); 
}
else if(operation=="prod"){
    mul=1;
    for(i=1;i<=num;i++){
        mul=mul*i;
    }
document.write("Product of numbers "+num+"="+mul); 
}
else{
    document.write("Wrong input");
}


//7
var number;
for(var i=1;i<=12;i++)
{
    for(var j=1;j<=10;j++)
    {
        console.log(i+"*"+j+"="+(i*j)+("\n"));
        console.log("\n");
    }
    if(i==3)
    {
        continue;
    }
}


//8
var number = window.prompt("Q8 - Enter a number to check prime or not: ");
var i,prime=true;



    for (i = 2; i < number; i++) {
        if (number % i == 0) {
            prime = false;
            break;
        }
    }

    if(prime) {
        console.log(number +" is a prime number");
    }
    else {
        console.log(number + " is not a prime number");
    }


//10
var yearsPrinted = 0;
var currentYear = window.prompt("Enter year:");

function leapYears() {
    while (yearsPrinted <10) { 
        if ((currentYear % 4 === 0) && (!((currentYear % 100===0) && (currentYear % 400 !== 0)))) {
            document.write(currentYear + "<br>");
            yearsPrinted++;
            currentYear++;
        } else {
            currentYear++;
        }
    }       
}

leapYears();


//11-13
var array=[1,2,3,4,5];

//11
document.write("11:"+Math.max(1,2,3,4,5),"<br>");

//12
document.write("12:"+array.reverse(),"<br>");

//13
document.write("13:"+array.includes(4));
*/

//14
var array = [1,2,3,4,5,6,8];
document.write(array.filter(function(el, ind){
  return ind % 2 === 0;
}));

/*
//15
var cumulativeSum = (sum => value => sum += value)(0);

document.write([5, 10, 3, 2].map(cumulativeSum));

//16
function checkPalindrome(string) {

    const arrayValues = string.split('');

    const reverseArrayValues = arrayValues.reverse();

    const reverseString = reverseArrayValues.join('');

    if(string == reverseString) {
        document.write('It is a palindrome');
    }
    else {
        document.write('It is not a palindrome');
    }
}

const string = prompt('Enter a string: ');

checkPalindrome(string);

//17
function pow(x, n) {
    let result = 1;
  
    for (let i = 0; i < n; i++) {
      result *= x;
    }
  
    return result;
  }
  
  alert( pow(2, 3) ); 
  function pow(x, n) {
    if (n == 1) {
      return x;
    } else {
      return x * pow(x, n - 1);
    }
  }
  
  alert( pow(2, 3) ); 
  function pow(x, n) {
    return (n == 1) ? x : (x * pow(x, n - 1));
  }

//19
var alpha = ['a','b','c'];
var nums = [1,2,3];
var both = alpha.concat(nums);
console.log(both);

//20
function newList(alph, num) {
    var list = [];
    for (var i=0;i<alph.length;++i) {
    list.push(alph[i]);
    list.push(num[i]);
    }
    return list;
    }
    document.write(newList(['a','b','c'],[1,2,3]));

*/