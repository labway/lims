//�鿴��ť�¼�
function chakan() {
	$("#aa").css({
		display : "block"
	});
}



//��������Ӽ�
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
//�¼�ѡ����
$(document).ready(function(){
	 $("#dateinput").datepick( {  
    dateFormat : 'yy-mm-dd'  
    }); 
    $("#dateinput2").datepick( {  
        dateFormat : 'yy-mm-dd'  
    });  			
	});      
//��ǩ���Ӽ�
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
//�رղ�
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


//����Enter�����Զ��ύ
document.onkeydown = function(event) {  
    var target, code, tag;  
    if (!event) {  
        event = window.event; //���ie�����  
        target = event.srcElement;  
        code = event.keyCode;  
        if (code == 13) {  
            tag = target.tagName;  
            if (tag == "TEXTAREA") { return true; }  
            else { return false; }  
        }  
    }  
    else {  
        target = event.target; //�����ѭw3c��׼�����������Firefox  
        code = event.keyCode;  
        if (code == 13) {  
            tag = target.tagName;  
            if (tag == "INPUT") { return false; }  
            else { return true; }   
        }  
    }  
}; 

//��Ʒ�ĵ��������ʾ
function sampled(){	
	$("#bb").css({display:"block"});	
}
//



