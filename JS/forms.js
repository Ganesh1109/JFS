var Quiz = document.forms.Quiz
var message= document.getElementById("message")

Quiz.onsubmit=function(){
    if(Quiz.name.value==""){
        message.innerHTML="please enter name"
        return false

    }
    else{
        message.innerHTML=""
        return true
    }
}