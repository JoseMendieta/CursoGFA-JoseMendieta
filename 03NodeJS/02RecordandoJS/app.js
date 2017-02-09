var arregloa = [1,7,4,43,2,9,10,5,33,73];
var arreglo1 = [];
var arreglo2 = [];
for(i=0; i<arregloa.length; i++){
    if (arregloa[i]%2 == 0)
    arreglo1.push(arregloa[i]);
    else
    arreglo2.push(arregloa[i]);
}
console.log(arreglo2);
console.log(arreglo1);