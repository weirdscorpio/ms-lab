const express = require('express')

const app = express()

app.get('/', (req, res, next) => {
	res.send('Test')
})
 
var PORT = 8000;
 
app.listen(PORT, function(err){
    if (err) console.log("Error in server setup")
    console.log("Server listening on Port", PORT);
})