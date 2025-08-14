function processPayment(event) {
    event.preventDefault(); // prevent page reload

    let cardName = document.getElementById("cardName").value.trim();
    let cardNumber = document.getElementById("cardNumber").value.trim();
    let expiry = document.getElementById("expiry").value;
    let cvv = document.getElementById("cvv").value.trim();
    let msg = document.getElementById("demo");

    // Validate card name
    if (cardName.length < 3) {
        msg.style.color = "red";
        msg.innerText = "Cardholder name must be at least 3 characters.";
        return;
    }

    // Validate card number (16 digits only)
    let cardPattern = /^\d{16}$/;
    if (!cardPattern.test(cardNumber)) {
        msg.style.color = "red";
        msg.innerText = "Enter a valid 16-digit card number.";
        return;
    }

    // Validate expiry date (must be in the future)
    let today = new Date();
    let expDate = new Date(expiry + "-01");
    if (expiry === "" || expDate <= today) {
        msg.style.color = "red";
        msg.innerText = "Enter a valid future expiry date.";
        return;
    }

    // Validate CVV (3 or 4 digits)
    let cvvPattern = /^\d{3,4}$/;
    if (!cvvPattern.test(cvv)) {
        msg.style.color = "red";
        msg.innerText = "CVV must be 3 or 4 digits.";
        return;
    }

    // If all validations pass
    msg.style.color = "green";
    msg.innerText = "Payment processed successfully!";
}
