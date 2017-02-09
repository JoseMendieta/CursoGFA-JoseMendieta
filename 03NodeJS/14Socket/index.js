var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/',(req,res)=>{
    res.sendfile(__dirname + "/index.html")
});

io.on('connection',(socket)=>{
    console.log("Cliente Conectado")
    socket.on('mensaje chat', (mensaje)=>{

        console.log(mensaje);
        io.emit('mensaje chat', mensaje)
    });

});

http.listen(3000,()=>{
    console.log("Servidor corriendo en puerto 3000");
});