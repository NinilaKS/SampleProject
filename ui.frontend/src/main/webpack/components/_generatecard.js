// generate challenges cards on clicking challenges
let changeCards = document.getElementsByClassName("challenges-card");

const countArr = document.querySelectorAll(".cmp-card-cont");
for (const element of changeCards) {
  element.addEventListener("click", toggleCards.bind(null, element));
}
function toggleCards(id) {
  showCard(id.getAttribute("data-id"));
}
let visibleCard = null;
function showCard(id) {
  if (visibleCard !== id) {
    visibleCard = id;
  }
  hideCard();
}
function hideCard() {
  let divClicked, i, id;
  for (i = 0; i < countArr.length; i++) {
    id = countArr[i].id;
    divClicked = document.getElementById(id);
    if (visibleCard === id) {
      divClicked.style.display = "block";      
    } else {
      divClicked.style.display = "none";
    }
  }
}

let buttonClicked = document.getElementsByClassName("challenges-card");
for (const element of buttonClicked) {
  element.addEventListener("click", function () {
    let current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
