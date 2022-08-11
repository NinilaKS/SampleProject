/*-------------------------------------------------*\
   Javascript sheet for the Solution Component of Home page
   
   Table of Contents
   If you conduct a Search on the page, type in the 
   section below that you would like to jump to.

   - Megamenu Submenu active change and hide
   - Megamenu Toolboox on hover and solution on hover
   - Homepage Header Banner slides
   - Megamenu Search Box active and deactive
   - 
   
\*-------------------------------------------------*/


window.addEventListener("DOMContentLoaded", () => {

  //************* Banner list image */
  
  const UL=document.querySelectorAll(".list li");
  const video =document.querySelectorAll(".list li video");
  /*get the single list to add active class*/
     UL.forEach(li =>{
      li.addEventListener('mouseover',function(){
          UL.forEach(l=>l.classList.remove('active'));
          this.classList.add('active');
  
          /*if list contain active class then get the src from child elemnt to push banner src*/
          if(li.classList.contains("active")){
               let src=li.children[2].children[0].getAttribute('src');
              console.log(src);
              document.getElementById('bannersrc').src=src;
          }         
      })      
    });
  
});

window.addEventListener("DOMContentLoaded", () => {

// ******** search on click *********
 //const searchElement = document.getElementById('searchSection');
 // document.addEventListener('click', function(event) {
 //   searchElement.style.display = "block";
 //   searchElement.style.top = "100%";
// });

// ***** close search on click outside the element *******
 const ignoreClickOnMeElement = document.getElementById('searchSection');
 document.addEventListener('mouse', function(event) {
     const isClickInsideElement = ignoreClickOnMeElement.contains(event.target);
   if (!isClickInsideElement) {
     ignoreClickOnMeElement.style.display = 'none';
   }
 });

});



window.addEventListener("DOMContentLoaded", () => {
  
  // ******* Megamenu Toolbox onhover********//
  const targetToolbox = document.querySelector(".dropdown-hover-toolbox");
  if(targetToolbox){
    targetToolbox.addEventListener("mouseover", mtOver, false);
    targetToolbox.addEventListener("mouseout", mtOut, false);
  }
  function mtOver() {
    const bgChangeTopbar= document.getElementById('cmp-bg-change');
    const bgChangeNavbar= document.getElementById('cmp-bg-navbar');
    
    if(bgChangeTopbar){
      bgChangeTopbar.classList.add('cmp-bg-change-top');
      bgChangeTopbar.style.visibility='unset';
    }

    if(bgChangeNavbar){
      bgChangeNavbar.classList.add('cmp-bg-change-navbar');
      bgChangeNavbar.style.visibility='unset';
    }
  }

  function mtOut() {  
    const someElement= document.getElementById('cmp-bg-change');
    const someElement1= document.getElementById('cmp-bg-navbar');

    if(someElement){
      someElement.classList.remove('cmp-bg-change-top');     
    }

    if(someElement1){
      someElement1.classList.remove('cmp-bg-change-navbar');      
    }
  }


  // ******* Megamenu solution onhover********//
  const targetSolution = document.querySelector(".dropdown-hover-solution");
  if(targetSolution){
    targetSolution.addEventListener("mouseover", msOver, false);
    targetSolution.addEventListener("mouseout", msOut, false);
  }
  function msOver() {
    const bgChangeTopbar= document.getElementById('cmp-bg-change');
    const bgChangeNavbar= document.getElementById('cmp-bg-navbar');
    
    if(bgChangeTopbar){
      bgChangeTopbar.classList.add('cmp-bg-change-top');
      bgChangeTopbar.style.visibility='unset';
    }

    if(bgChangeNavbar){
      bgChangeNavbar.classList.add('cmp-bg-change-navbar');
      bgChangeNavbar.style.visibility='unset';
    }
  }

  function msOut() {
    const someElement= document.getElementById('cmp-bg-change');
    const someElement1= document.getElementById('cmp-bg-navbar');

    if(someElement){
      someElement.classList.remove('cmp-bg-change-top');     
    }

    if(someElement1){
      someElement1.classList.remove('cmp-bg-change-navbar');      
    }
  }

});


 // ******* Megamenu Toolbox Navigation Submenu active********//

window.addEventListener("DOMContentLoaded", () => {

const ul = document.querySelector('ul.list-group');

ul.addEventListener('click', e => {
  e.preventDefault();
  let li = e.target.closest('li a');
  if (li) {
    ul.querySelectorAll('li a').forEach(elm => elm.classList.remove('active'));
    li.classList.add('active');
  }
});

});

// ******* Megamenu SOlution Navigation Submenu active********//

window.addEventListener("DOMContentLoaded", () => {

  const ul = document.querySelector('ul.cmp-list-group-solution-subnav');
  
  ul.addEventListener('click', e => {
    e.preventDefault();
    let li = e.target.closest('li a');
    if (li) {
      ul.querySelectorAll('li a').forEach(elm => elm.classList.remove('active'));
      li.classList.add('active');
    }
  });
  
  });