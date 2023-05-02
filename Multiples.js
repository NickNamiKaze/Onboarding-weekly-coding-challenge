function arrarsOfMultiple(num, length){

    let arr = [];
    arr[0] = num;
    let total = num

    for(i = 1; i < length; i++){
        total += num
        arr.push(total)
    }

    return arr;
}


function print(num, length){
    
    console.log('[ ' + arrarsOfMultiple(num,length).join(', ')+' ]')
    
}



print(5,9)