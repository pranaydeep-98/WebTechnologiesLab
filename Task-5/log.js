function isValid(){
    let username=document.getElementById("username").value.trim();
    let password=document.getElementById("inputPassword").value.trim();
    if( username==="") {
        alert("Please Enter Username");
        return false;
    }
    if (password === "") {
        alert("Please enter your password");
        return false;
    }
    let validUsername = "Pranaydeep";
    let validPassword = "Pranaydeep";

    if (username === validUsername && password === validPassword) {
        alert("Login Successful!");
    } else {
        alert("Invalid Username or Password");
    }
}