var userName = document.getElementById("name-txt");
var password = document.getElementById("password-txt");

document.getElementById("submit-btn").addEventListener("click", function(){
  console.log (userName.value + " " + password.value);
  var employee = {
    "name": userName.value,
    "password": password.value
  }
  var xhttp = new XMLHttpRequest();
      xhttp.onreadystatechange = function() {
           if (this.readyState == 4 && this.status == 200) {
               alert(this.responseText);
           }
      };
      xhttp.open("POST", "/inputEmployee", true);
      xhttp.setRequestHeader("Content-type", "application/json");
      xhttp.send(employee);
});

