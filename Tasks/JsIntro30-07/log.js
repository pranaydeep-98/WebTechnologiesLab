function loginDetection(){ 
    const username=document.getElementById("username").value;
    const demo=document.getElementById("demo");
    if (username==="") {
        demo.innerText="Username cannot be empty";
    } 
    else {
           demo.innerText="Login attempted with username: "+username;
    }
}