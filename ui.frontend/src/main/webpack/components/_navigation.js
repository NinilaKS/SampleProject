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

  const someEle = document.getElementById("softwares");//Sample Element
someEle.addEventListener("click", function(){
  show();// <- There use your function with param in brackets
}, false);

  // ******* megamenu image onclick ********
  let previd;
  function show(idname){
    if(!document.getElementById(idname.id).classList.contains("imgshow")){
      document.getElementById(idname.id).classList.add("imgshow");
    }
    if(previd){
      if(idname.id != previd){
        child = document.getElementById(previd);
        child.previousElementSibling.classList.remove('active')
        child = document.getElementById(idname.id);
        child.previousElementSibling.classList.add('active')
        document.getElementById(previd).style.display = "none";
        document.getElementById(idname.id).style.display = "block";
      }
    }
    else{
        child = document.getElementById(idname.id);
        child.previousElementSibling.classList.add('active')
        document.getElementById(idname.id).style.display = "block";
    }
    previd = idname.id;
    document.getElementById("dropdownid").addEventListener('click', function (event) {
            event.stopPropagation();
    });
  }
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
  targetToolbox.addEventListener("mouseover", mOver, false);
  targetToolbox.addEventListener("mouseout", mOut, false);

  function mOver() {
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

  function mOut() {  
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
  targetSolution.addEventListener("mouseover", msOver, false);
  targetSolution.addEventListener("mouseout", msOut, false);

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

