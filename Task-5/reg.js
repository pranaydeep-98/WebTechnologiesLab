function Register(event) {
    event.preventDefault(); 

    let fullname = document.getElementById("fullname").value.trim();
    let email = document.getElementById("email").value.trim();
    let username = document.getElementById("username").value.trim();
    let password = document.getElementById("password").value.trim();
    let confirmPassword = document.getElementById("confirm_password").value.trim();
    if (fullname === "") {
        alert("Please enter your full name");
        return false;
    }
    if (email === "") {
        alert("Please enter your email");
        return false;
    }
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address");
        return false;
    }
    if (username === "") {
        alert("Please enter a username");
        return false;
    }
    if (username.length < 4) {
        alert("Username must be at least 4 characters long");
        return false;
    }

    if (password === "") {
        alert("Please enter a password");
        return false;
    }
    if (password.length < 6) {
        alert("Password must be at least 6 characters long");
        return false;
    }
    let passPattern = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$/;
    if (!passPattern.test(password)) {
        alert("Password must contain at least one letter and one number");
        return false;
    }

    if (confirmPassword === "") {
        alert("Please confirm your password");
        return false;
    }
    if (password !== confirmPassword) {
        alert("Passwords do not match");
        return false;
    }

    alert("Registration successful!");
    return true;
}
