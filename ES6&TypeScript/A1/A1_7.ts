//1
/*
var [e1, e2, e3, e4] = arr;
console.log(arr);*/
//2
let organization = {
    Name: "Amazon",
    adress: {
        city: "Vijayawada",
        state: "AP",
        pincode: 521104
    }
};
let { adress: { pincode: pin,state:s } } = organization;
console.log(pin);
console.log(s);