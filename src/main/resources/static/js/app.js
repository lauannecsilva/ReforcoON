var btnEntrar = document.querySelector("#entrar");
var btnCriar  = document.querySelector("#criar");
var body      = document.querySelector("body");

btnEntrar.addEventListener("click", function () {
    body.className = "sign-in-js";
});

btnCriar.addEventListener("click", function () {
    body.className = "sign-up-js";
});