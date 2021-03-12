/** Fetches the current date from the server and adds it to the page. */ 

async function sayHello() { 
    const responseFromServer = await fetch('/hello'); 
    const textFromResponse = await responseFromServer.text(); 
    const helloContainer = document.getElementById('hello-container'); 
    helloContainer.innerText = textFromResponse; 
}
