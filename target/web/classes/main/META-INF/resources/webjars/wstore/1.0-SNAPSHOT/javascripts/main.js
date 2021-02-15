function funcJson(a, b){

var requestOptions = {
  method: 'GET',
  redirect: 'follow'
};

fetch(b, requestOptions)
  .then(response => response.text())
  .then(result => {
  a.innerHTML = result;
  })
  .catch(error => console.log('error', error));
}


