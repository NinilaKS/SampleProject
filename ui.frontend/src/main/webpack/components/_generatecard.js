// generate challenges cards on clicking challenges
(function() {

  console.log("ninila ks");
const countArr = document.querySelectorAll(".cmp-card-cont");

var visibleId = null;
function showCard(id) {
  if (visibleId !== id) {
    visibleId = id;
  }
  hideCard();
}
function hideCard() {
  var div, i, id;
  for (i = 0; i < countArr.length; i++) {
    id = countArr[i].id;
    div = document.getElementById(id);
    if (visibleId === id) {
      div.style.display = "block";
    } else {
      div.style.display = "none";
    }
  }
}

var btns = document.getElementsByClassName("challenges-card");
console.log(btns);
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function () {
    var current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
}());
