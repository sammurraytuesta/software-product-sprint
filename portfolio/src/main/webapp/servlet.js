/** Fetches the current date from the server and adds it to the page. */ 

async function sayHello() { 
    const responseFromServer = await fetch('/hello'); 
    const jsonFromResponse = await responseFromServer.json(); 
    const helloContainer = document.getElementById('hello-container'); 
    helloContainer.innerText = jsonFromResponse[Math.floor(Math.random() * jsonFromResponse.length)];
    console.log(jsonFromResponse[Math.floor(Math.random() * jsonFromResponse.length)]);
}
