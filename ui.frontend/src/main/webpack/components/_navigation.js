/*-------------------------------------------------*\
   Javascript sheet for the Solution Component of Home page
   
   Table of Contents
   If you conduct a Search on the page, type in the 
   section below that you would like to jump to.

  
   - Megamenu Toolboox on hover and solution on hover  
   - Megamenu Search Box active and deactive
   - Megamenu Sticky
   
\*-------------------------------------------------*/


/*-------------------------------------------*\
    Megamenu Onhover
\*-------------------------------------------*/

window.addEventListener("DOMContentLoaded", () => {
  
  // ******* Megamenu onhover********//
  const targetToolbox = document.querySelectorAll(".dropdown-hover-menu");
  
  if(targetToolbox){
    targetToolbox.forEach(box => {     
      box.addEventListener("mouseover", mtOver, false);
      box.addEventListener("mouseout", mtOut, false);
    });    
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

});


/*-------------------------------------------*\
    Megamenu Sticky Header
\*-------------------------------------------*/

window.addEventListener("DOMContentLoaded", () => {

const header  = document.getElementById('cmp-bg-navbar');

addClassHeader = () => {
    header.classList.add("cmp-sticky");
}

removeClassHeader = () => {
    header.classList.remove("cmp-sticky");
}

window.addEventListener('scroll', function () {
    let getScrollposition = window.scrollY;
    if (getScrollposition > 0) {
        addClassHeader();
    } else {
        removeClassHeader();
    }
});

});

