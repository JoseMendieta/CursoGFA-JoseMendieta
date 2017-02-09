var mysql = require('mysql');
var conexion = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "pass",
    database: "servicios",
    port: 3306
})

var corridasModel = {};

corridasModel.getCorrida = function (id, callback) {
    if (conexion) {
        conexion.query(`SELECT * FROM corrida WHERE id = ${id}`, (err, row) => {
            if(err){
                throw err
            }else{
                callback(err, rows);
            }
        });
    }

}


corridasModel.getCorridas = function (callback) {
    if (conexion) {
        conexion.query('select * from tservic', (err, rows) => {
            if (err) {
                throw err
            }
            else {
                callback(err, rows);
            }
        });
    }
};

corridasModel.insertaCorridas = function (corrida, callback) {
    if (conexion) {
        conexion.query('INSERT INTO tservic SET ?', corrida, (err, rows) => {
            if (err) {
                throw err
            }
            else {
                callback(err, rows);
            }
        });
    }
};

module.exports = corridasModel;

