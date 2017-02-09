var express = require('express');
var router = express.Router();
var corridasModel = require('../models/corridas');

router.get('/', function(req, res) {
    corridasModel.getCorridas((err,rows)=>{
        if (req.accepts("html")){
            res.render("corridas",{corridas:rows})
        }
        else{
        res.json(200,rows);
    }
    });
});


router.post('/insertar',function (req,res){
    var corrida ={};
    corrida.ID_SERVICIO = req.body.id;
    corrida.ORIGEN = req.body.origen;
    corrida.DESTINO = req.body.destino;
     corrida.FECHA_SALIDA=req.body.fechaSalida;
    corrida.HORA_SALIDA =req.body.horaSalida;
    corrida.FECHA_LLEGADA= req.body.fechaInicio;
    corrida.HORA_LLEGADA=req.body.horaInicio;
   
    corrida.NUMERO_ESCALAS= req.body.escalas;
    
    corridasModel.insertaCorridas (corrida,(err,response)=>{
        if(response && response.insertId){
            res.json(200,{"sucess":true});
        }
        else {
            res.json(500,{"sucess":false});
        }
        
    });
    
});

router.get('/:id', function (reg,res){
    corridasModel.getCorridas(req.params.id, function (err,rows){
        if (req.accepts("html")){
            res.render("corridas",{corridas:rows});
        }else{
            res.json(200,rows);
        }
    });
});

module.exports = router;
