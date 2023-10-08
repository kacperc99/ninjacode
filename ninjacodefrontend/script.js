const username = document.getElementById("name");
const usersurname = document.getElementById("surname");
const useremail = document.getElementById("email");

function send(){
    if(username.value!=='')
    {
        if(usersurname.value!=='')
        {
            if(useremail.value!=='')
            {
                const usernamevalue = username.value;
                const usersurnamevalue = usersurname.value;
                localStorage.setItem('user_name',usernamevalue);
                localStorage.setItem('user_surname',usersurnamevalue);
                window.location.assign("success.html");
            }
            else
                document.getElementById("error").innerText = 'no e-mail provided';
        }
        else
            document.getElementById("error").innerText = 'no surname provided';
    }
    else
        document.getElementById("error").innerText = 'no name provided';
}