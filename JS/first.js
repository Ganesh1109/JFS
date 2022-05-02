//alert('Hello World!');

/* commenting in JS
alert('Hello World!');
*/

//if else statements
/*var a=78;

if(a%2!=0 && a>=50){document.write(a+" odd and greater than 50");}
else if(a%2!=0 && a<50){document.write(a+ " odd and less than 50")}
else{document.write(a+" even");}

//logical operator
var age=23

if(age>=18 && age<=55){console.log("adult")}
else if(age>=3 && age<=17){document.write("Kid")}
else{document.write("sr.ctzn")}


//while loop
let aged=23;

while(aged<25){
    console.log("Age less than 25");
    aged++;
}
document.write("Age over 25");

//for loop
let links=document.getElementsByTagName("a")

for(i=1;i<=links.length;i++){
    console.log("this is link number" + i);
}
document.write("all links are printed")


//break and continue
for(j=0;j<10;j++){
    if(j==5||j==3){
        continue;  //skips those numbers and execute remaining
    }
    console.log(j);
    if(j==6){
        break;  //breaks the execution if that condition is executed
    }
}

//functions
function getAvg(a,b){
    var avg = (a+b)/2;  //local variable
    //console.log(avg);
    return avg;
}

let g = getAvg(100,250);  //global variable
console.log(g)

//numbers
var a="5";  //5 is a string here when we add a&b we get 510 as 10 is concatinated with 5
var b=10;
var c=5;

console.log(a+b)
console.log(typeof(a+b));  //string as a="5" is a string

console.log(Math.round(7.8))  //roundoff the decimal
console.log(Math.max(7,10,25,-5))  //returns max value
console.log(Math.PI)  //pi value

//strings

var myString = "I\'m  Ganesh";

console.log(myString);
console.log(myString.length);
console.log(myString.toLowerCase());
console.log(myString.toUpperCase());
console.log(myString.indexOf("Gan"));

//object
var myCar=new String()
myCar='Hello'
document.write(myCar.length+"<br>")
document.write(myCar)

//arrays
var arr=new Array();
arr[0]=1;
arr[1]="Ganesh";
console.log(arr);

var myCar = new Object();
myCar.maxSpeed=120;
myCar.driver="Ganesh";
myCar.drive = function(speed,time){
   //console.log("moving");
   console.log(speed*time)
}
myCar.drive(80,3);  //speed and time values given for drive function


var myCar2={maxSpeed:80,driver:"venkat",drive:function(){console.log("repairing");}};
console.log(myCar2.driver);


//this keyword
var myCar2={
    maxSpeed:80,
    driver:"venkat",
    drive:function(speed,time){
        console.log(speed*time);
    },
    test:function() {
        console.log(this)  //this gives the whole information of this object
    },
    //function for getting driver name using this kehword
    longDriver:function(){
        console.log("the driver is: "+this.driver)
    }
};
//myCar2.test();
myCar2.longDriver();


//constructors
var car=function(maxSpeed,driver){
    this.maxSpeed=maxSpeed
    this.driver=driver
    this.drive=function(speed,time){
        console.log(speed*time)
    }
    this.longDriver = function(){
        console.log("driver name: "+this.driver)
    }
}

var car1=new car(80,"veer")
var car2=new car(90,"kheer")
var car3=new car(180,"deer")

car1.drive(30,6)
car1.longDriver()


//date object
var pdate=new Date(2000,08,11);
var fdate=new Date(2023,08,11);
var date=new Date();

console.log(pdate)
console.log(date)
console.log(fdate)

var bday = new Date(2000,9,11,09,32,58);
console.log(bday.getMonth())
console.log(bday.getTime())  //number of milli seconds from given date
*/

//forms





