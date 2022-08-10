/*-------------------------------------------------*\
   Javascript sheet for the AOS Animation For All 
   Page
   
   Table of Contents
   If you conduct a Search on the page, type in the 
   section below that you would like to jump to.

   - Initating AOS Animation
    
   
\*-------------------------------------------------*/
/*-------------------------------------------*\
            Initating AOS Animation
\*-------------------------------------------*/
import  AOS  from 'aos';

window.addEventListener("DOMContentLoaded", () => {
    AOS.init({
        disable: false,
        startEvent: 'DOMContentLoaded',

    });
});
