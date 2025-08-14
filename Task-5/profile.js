function saveProfile(event) {
    event.preventDefault(); // stop form from submitting

    let name = document.getElementById("name").value.trim();
    let dob = document.getElementById("dob").value;
    let email = document.getElementById("email").value.trim();
    let username = document.getElementById("username").value.trim();
    let msg = document.getElementById("msg");

    // Name validation
    if (name.length < 3) {
        msg.style.color = "red";
        msg.innerText = "Full name must be at least 3 characters.";
        return;
    }

    // DOB validation (must be in the past)
    let today = new Date();
    let birthDate = new Date(dob);
    if (birthDate >= today || dob === "") {
        msg.style.color = "red";
        msg.innerText = "Please enter a valid date of birth.";
        return;
    }

    // Email validation
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        msg.style.color = "red";
        msg.innerText = "Enter a valid email address.";
        return;
    }

    // Username validation
    if (username.length < 4) {
        msg.style.color = "red";
        msg.innerText = "Username must be at least 4 characters.";
        return;
    }

    // If everything is fine
    msg.style.color = "green";
    msg.innerText = "Profile saved successfully!";
}
