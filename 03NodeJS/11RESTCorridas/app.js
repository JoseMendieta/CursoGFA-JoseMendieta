var Cliente = require('node-rest-client').Client;
var cliente = new Cliente();

cliente.get("http://localhost:8081/rest/Consulta/2",(data,response)=>{
    console.log(data);
})

cliente.post("http://localhost:8081/rest/Insertar",{
    parameters:{
        origen: "ON",
        destino: "AGS",
        fechaSalida: "2017-02-02",
        fechaLlegada: "2017-02-03",
        horaSalida: "23:00:00",
        horaLlegada: "02:30:00",
        escalas: 1
    }
},(data,response)=>{
    console.log(data);
})