/*-------------------------------------------------*\
   Javascript sheet for the Smooth For All Page
   
   Table of Contents
   If you conduct a Search on the page, type in the 
   section below that you would like to jump to.

   - Initating Smooth on body of all page
    
   
\*-------------------------------------------------*/
/*-------------------------------------------*\
    Initating Smooth on body of all page
\*-------------------------------------------*/
window.addEventListener("DOMContentLoaded", () => {
    document.querySelector('body').scrollIntoView({
        behavior: 'smooth'
    });
});
