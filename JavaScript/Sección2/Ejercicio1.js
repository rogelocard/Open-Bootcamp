// Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:
// - Tu nombre (string)
// - Tu edad (number)
// - ¿Eres desarrollador? (boolean)
// - Tu fecha de nacimiento (Date)
// - Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)

const fechaNacimiento = new Date(1999, 00, 05);

const libro = {
    titulo: "Alive to wonder",
    autor: "John piper",
    fecha: "01/05/2005",
    url: "https://www.desiringgod.org/books/alive-to-wonder"
};

const myList = ["Roger", 23, true, fechaNacimiento, libro];

console.log(myList);