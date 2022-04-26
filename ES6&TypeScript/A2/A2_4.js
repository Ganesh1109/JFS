//using set to store users
var croom1 = new Map();
var croom2 = new Map();
// adding users and messages
croom1.set("user1", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom1.set("user2", ["Hi", "How are you?", "I am fine", "Thank you"]);
croom1.set("user3", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user4", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user5", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user6", ["Hello", "How are you?", "I am fine", "Thank you"]);
//printing users and messages
var printusers = function (room, name) {
    console.log("Users in room name  ".concat(name, " are : "));
    for (var _i = 0, _a = room.keys(); _i < _a.length; _i++) {
        var key = _a[_i];
        console.log(key);
    }
};
var printmessages = function (room, name) {
    console.log("Messages in room name  ".concat(name, " are : "));
    for (var _i = 0, _a = room.values(); _i < _a.length; _i++) {
        var value = _a[_i];
        console.log(value);
    }
};
printusers(croom1, "chatroom1");
printusers(croom2, "chatroom2");
printmessages(croom1, "chatroom1");
printmessages(croom2, "chatroom2");
