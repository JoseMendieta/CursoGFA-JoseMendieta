setTimeout(()=>{console.log("Primer Mensaje");},2000);

setTimeout(()=>{console.log("Tercer Mensaje");},3000);

var funcionX = ()=>{console.log("Mensaje Repetitivo");}

funcionX();
setInterval(funcionX,1000);

console.log("Segundo Mensaje")