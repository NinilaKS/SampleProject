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
            li.addEventListener('click',function(){
                UL.forEach(l=>l.classList.remove('active'));
                this.classList.add('active');

                /*if list contain active class then get the src from child elemnt to push banner src*/
                if(li.classList.contains("active")){
                    let src=li.children[2];
                     if(src.classList.contains('video')){
                       document.getElementById('banner').innerHTML=` <video autoplay muted loop>
                            <source src="720.MP4" type="video/mp4">    
                         </video> `;
                     }else if(src.classList.contains('img1')){
                        document.getElementById('banner').innerHTML=`<img src="Asset/1.jpg"/>`;
                     }else if(src.classList.contains('img2')){
                        document.getElementById('banner').innerHTML=`<img src="Asset/2.jpg"/>`;
                     }else{
                        console.log(src)
                     }
                }
            })

          });
  
});


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


 // ******* Megamenu Toolbox Navigation Submenu active********//

window.addEventListener("DOMContentLoaded", () => {

  const links = document.querySelectorAll(".submenu-link");
  for (var i = 0; i < links.length; i++) {
    var link = links[i];
    link.onclick = function() {
      var prev = document.getElementsByClassName("active");
      if (prev && prev[0]) {
        prev[0].classList.remove("active");
      }
      this.classList.add("active");
    };
  }

});


// ******* Megamenu Sticky Header ********//

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


