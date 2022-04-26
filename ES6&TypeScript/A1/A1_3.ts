var Order = {
    id: 1,
    title: 'order1',
    price: 1000,
    printOrder() {
        return (this.id + " " + this.title + " " + this.price);
    },
    getPrice() {
        return (this.price);
    }
};
var order2 = Object.assign(Order); //creating a new object from the existing object using Object.assign()
console.log(order2.printOrder()); //1 order 1000
console.log(order2.getPrice()); //1000
order2.id = 2; //changing the value of id
order2.title = 'order2'; //changing the value of title
order2.price = 200; //changing the value of price
console.log(order2.printOrder()); //20 order1 200
console.log(order2.getPrice()); //200
