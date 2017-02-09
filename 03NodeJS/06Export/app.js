var boletos = require('./procesos.js');

var b1 = {
    folio:49203,
    origen: "GTO",
    destino: "GDL",
    costo: 350
};

var b2 = {
    folio:50643,
    origen: "MEX",
    destino: "LEO",
    costo: 700
};

var b3 = {
    folio:45453,
    origen: "AGS",
    destino: "QRO",
    costo: 550
};

boletos.insertar(b1);
boletos.insertar(b2);
boletos.insertar(b3);

boletos.imprimir();