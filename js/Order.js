window.onload = function (){
    let sub = document.getElementsByClassName("check_out");
    for( let i = 0 ; i < sub.length ;++i){
        sub[i].onclick = function (){
            window.location.href = "../html/NewOrder.html";
        }
    }
}