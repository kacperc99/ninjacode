const fname = localStorage.getItem('user_name');
const lname = localStorage.getItem('user_surname');

document.getElementById("nam").textContent = fname;
document.getElementById("surnam").textContent = lname;

function returnal(){
    window.location.assign("index.html");
}