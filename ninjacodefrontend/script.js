const username = document.getElementById("name");
const usersurname = document.getElementById("surname");
const useremail = document.getElementById("email");

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

  const usernamevalue = username.value;
  const usersurnamevalue = usersurname.value;
  localStorage.setItem('user_name', usernamevalue);
  localStorage.setItem('user_surname', usersurnamevalue);
  window.location.assign('success.html');
}