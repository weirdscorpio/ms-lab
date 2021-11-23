const express = require("express");
const path = require("path");
const app = express();

app.use(express.urlencoded());
app.use(express.json());

app.get("/", (req, res, next) => {
  res.sendFile(path.join(__dirname, "/public", "/index.html"));
});

app.post("/", (req, res, next) => {
  let fn = req.body.fname;
  let sn = req.body.lname;
  console.log(fn, sn)
  res.json({ firstname: fn, secondname: sn });
});

app.listen(8000, function (err) {
  if (err) console.log(err);
  else console.log("Server up and running");
});
