var boletos = [
    {
        folio: 4,
        destino: "GTO",
        precio: 62
    },
    {
        folio: 41,
        destino: "GDL",
        precio: 300
    },
    {
        folio: 34,
        destino: "QRO",
        precio: 250
    },
    {
        folio: 24,
        destino: "MEX",
        precio: 450
    }
]

//Ordenar los boletos en el mismo arreglo por precio
//if(a.precio > b.precio)

boletos.sort(function(a, b) {
    var at = a.precio,
        bt = b.precio;
    return at > bt ? 1 : ( at < bt ? -1 : 0 );
});



console.log(boletos);