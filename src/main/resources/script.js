const API_URL = "http://localhost:8080";

function addEmployee() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const position = document.getElementById("position").value;

    fetch(`${API_URL}/addEmployee`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ name, email, position })
    })
    .then(res => res.json())
    .then(data => {
        alert("Employee Added");
        loadEmployees();
    });
}

function loadEmployees() {
    fetch(`${API_URL}/AllEmployee`)
    .then(res => res.json())
    .then(data => {
        const list = document.getElementById("employeeList");
        list.innerHTML = "";

        data.forEach(emp => {
            const li = document.createElement("li");
            li.innerText = `${emp.name} - ${emp.email} - ${emp.position}`;
            list.appendChild(li);
        });
    });
}

window.onload = loadEmployees;