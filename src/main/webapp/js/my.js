window.onload = function(){
    var oLis = document.querySelectorAll(".menu");
    for (let i = 0; i < oLis.length; i++) {
        oLis[i].onclick = function(eve){
            // console.log(this.innerText);
            console.log(eve.target.innerText);
        };
    }
};

var oMenu1 = document.querySelector("#second+li+li");
// oMenu1.onclick = aaa;
oMenu1.onclick = callFunc;//注意此处没有括号   当click事件在  oMenu1对象发生时，调用   callFunc函数

function callFunc(eve){
    console.log(eve.target.innerText);
}


document.querySelector(".out").onclick = function(eve){
    console.log("out被点击了");
};
document.querySelector(".in").onclick = function(eve){
    console.log("in被点击了");
    //阻止默认行为的方式
    // return false;
    //阻止冒泡
    eve.stopPropagation();
    return false;
};

