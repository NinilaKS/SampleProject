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

  const controls = document.querySelectorAll(".tab-control");
  const tabs = document.querySelectorAll(".tab");
  
  // display none for 1-length tabs
  for (let i = 1; i < tabs.length; i++) {
    tabs[i].style.display = 'none';
  }
  
  // set value forl all tabs
  for (let i = 0; i < tabs.length; i++) {
    tabs[i].setAttribute("value", i);
  }
  
  // add event listener for all controls
  for (let i = 0; i < controls.length; i++) {
    controls[i].setAttribute("value", i);
    controls[i].addEventListener("click", displayTab);
  }
  
  // display tab function
  function displayTab() {
    for (let i = 0; i < tabs.length; i++) {
      tabs[i].style.display = 'none';
      controls[i].removeAttribute("id");
    }
    tabs[this.value][0].style.display = 'block';
    controls[this.value][0].setAttribute("id", "control-selected");
}
  
// ******** search on click *********
// const searchElement = document.getElementById('searchSection');
// document.addEventListener('click', function(event) {
//    searchElement.style.display = "block";
//    searchElement.style.top = "100%";
// });

// ***** close search on click outside the element *******
// const ignoreClickOnMeElement = document.getElementById('searchSection');
// document.addEventListener('mouse', function(event) {
//     const isClickInsideElement = ignoreClickOnMeElement.contains(event.target);
//   if (!isClickInsideElement) {
//     ignoreClickOnMeElement.style.display = 'none';
//   }
// });

});



window.addEventListener("DOMContentLoaded", () => {
  document.addEventListener("mouseover", function (event) {          
      if (!event.target.matches(".dropdown-hover")) {
          myFunction();
      }
   },
      false
  );
 
  function myFunction() {
    
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

});

window.addEventListener("DOMContentLoaded", () => {
  document.addEventListener("mouseout", function (event) {          
      if (!event.target.matches(".dropdown-hover")) {
          myFunction();
      }
   },
      false
  );
 
  function myFunction() {
    
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