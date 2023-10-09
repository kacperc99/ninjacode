const username = document.getElementById("name");
const usersurname = document.getElementById("surname");
const useremail = document.getElementById("email");
var validRegex = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|.(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;


function send() {
  if (username.value === '') {
    document.getElementById('error').innerText = 'no name provided';
    return;
  }

  if (usersurname.value === '') {
    document.getElementById('error').innerText = 'no surname provided';
    return;
  }

  if (useremail.value === '') {
    document.getElementById('error').innerText = 'no e-mail provided';
    return;
  }
  if (!useremail.value.match(validRegex)) {
    document.getElementById('error').innerText = 'invalid e-mail';
    return;
  }

  const usernamevalue = username.value;
  const usersurnamevalue = usersurname.value;
  localStorage.setItem('user_name', usernamevalue);
  localStorage.setItem('user_surname', usersurnamevalue);
  window.location.assign('success.html');
}