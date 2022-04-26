let A1_4 = function(...names){ 
    
    for(let i in names){
        console.log('{name: \''+names[i]+'\'},{length: '+names[i].length+'}')
    }
}

let arr1=['Ivan','Tom','Jerry']
A1_4(...arr1)
