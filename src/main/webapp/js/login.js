window.onload = function(){
    document.querySelector("#pass").onkeyup = function(eve){
        // console.log(eve);
        var val = eve.target.value;
        var oDiv = document.getElementById("tips");
        if(val.length < 6  || val.length > 10){
            oDiv.innerHTML = "<b>密码不符合规则</b>";
        }else{
            oDiv.innerText = "<b>恭喜</b>";
        }
    };
};