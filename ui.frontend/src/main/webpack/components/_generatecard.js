/*-------------------------------------------------*\
   Javascrip sheet for the Solution Component of Home page
   
   Table of Contents
   If you conduct a Search on the page, type in the 
   section below that you would like to jump to.

   - Changing the text when clicking the challenge cards
   - Class change of challenge card to active 
    
   
\*-------------------------------------------------*/

/*-------------------------------------------*\
Changing the text when clicking the challenge cards
\*-------------------------------------------*/

let changeCards = document.getElementsByClassName("challenges-card");

const countArr = document.querySelectorAll(".cmp-card-cont");
for (const element of changeCards) {
  element.addEventListener("mouseover", toggleCards.bind(null, element));
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

/*-------------------------------------------*\
Class change of challenge card to active 
\*-------------------------------------------*/

let buttonClicked = document.getElementsByClassName("challenges-card");
for (const element of buttonClicked) {
  element.addEventListener("mouseover", function () {
    let current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
