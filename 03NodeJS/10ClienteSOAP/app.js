var soap = require('soap');
//var xml2js = require('xml2js');
//var url = "http://www.webservicex.com/globalweather.asmx?wsdl";

var url = "http://localhost:8081/estados?wsdl";
//var parser = xml2js.parseString;

var options = {
    ignoredNamespaces: {
        namespaces: ['ws'],
        override: true
    }
};

soap.createClient(url,options,(err1, cliente) =>{
    cliente.getEstados((err2,response)=>{
    //console.log(response);
        response.estado.forEach((e) => {
        console.log(e.nombre + " | " + e.capital);
})
})
//console.log(cliente.lastRequest);
})