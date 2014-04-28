//查看按钮事件
function chakan() {
	$("#aa").css({
		display : "block"
	});
}



//报告份数加减
function report(aa){
	if(aa=='-'){
		var n1=document.getElementById("reportnum").value;          		
		var n2=parseInt(n1);        		
    	if(n2>=1){
    		n2=n2-1; 
    	}
    	document.getElementById("reportnum").value=n2;        
	}
	else if(aa=='+'){
		var n1=document.getElementById("reportnum").value;          		
		var n2=parseInt(n1);        		
    	n2=n2+1;
    	document.getElementById("reportnum").value=n2;        	
	}
}    
//事件选择器
$(document).ready(function(){
	 $("#dateinput").datepick( {  
    dateFormat : 'yy-mm-dd'  
    }); 
    $("#dateinput2").datepick( {  
        dateFormat : 'yy-mm-dd'  
    });  			
	});      
//标签数加减
function lablejian(){        	
	var n1=document.getElementById("lablenum").value;          		
	var n2=parseInt(n1);        		
	if(n2>=1){
		n2=n2-1; 
	}
	document.getElementById("lablenum").value=n2;        
}      

function lablejia(){        	
	var n1=document.getElementById("lablenum").value;          		
	var n2=parseInt(n1);        		
	n2=n2+1;
	document.getElementById("lablenum").value=n2;        
} 
//关闭层
function closeceng() {
	$("#aa").css({
		display : "none"
	});
}
function closeceng2() {
	$("#bb").css({
		display : "none"
	});
}


//禁用Enter键表单自动提交
document.onkeydown = function(event) {  
    var target, code, tag;  
    if (!event) {  
        event = window.event; //针对ie浏览器  
        target = event.srcElement;  
        code = event.keyCode;  
        if (code == 13) {  
            tag = target.tagName;  
            if (tag == "TEXTAREA") { return true; }  
            else { return false; }  
        }  
    }  
    else {  
        target = event.target; //针对遵循w3c标准的浏览器，如Firefox  
        code = event.keyCode;  
        if (code == 13) {  
            tag = target.tagName;  
            if (tag == "INPUT") { return false; }  
            else { return true; }   
        }  
    }  
}; 

//样品的弹出层的显示
function sampled(){	
	$("#bb").css({display:"block"});	
}
//



