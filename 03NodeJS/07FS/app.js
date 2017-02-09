var fs = require('fs');
var contenido;

fs.readFile('./archivo.txt', function (err, data) {

    contenido = data.toString();
    console.log(contenido);
    escribir();

});

function escribir()
{

    fs.writeFile('./nuevo.txt', contenido, err => {
        if (contenido)
            console.log("Escritura Realizada.")
    });
}