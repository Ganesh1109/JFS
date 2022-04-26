//1
/*
var [e1, e2, e3, e4] = arr;
console.log(arr);*/
//2
var organization = {
    Name: "Amazon",
    adress: {
        city: "Vijayawada",
        state: "AP",
        pincode: 521104
    }
};
var _a = organization.adress, pin = _a.pincode, s = _a.state;
console.log(pin);
console.log(s);
