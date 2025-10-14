function Register(){ 
    const username=document.getElementById("username").value.trim();
    const email=document.getElementById("email").value.trim();
    const fullname=document.getElementById("fullname").value.trim();
    const demo=document.getElementById("demo");
    if (username===""||email===""||fullname==="") {
        demo.innerText="All fields are required";
    } 
}