/*-------------------------------------------------*\
   Javascript sheet for the AOS Animation For All 
   Page
   
   Table of Contents
   If you conduct a Search on the page, type in the 
   section below that you would like to jump to.

   - Initating AOS Animation
   - project-dramix-container
   
\*-------------------------------------------------*/
/*-------------------------------------------*\
            Initating AOS Animation
\*-------------------------------------------*/
import AOS from 'aos';

window.addEventListener("DOMContentLoaded", () => {

    const projectdramixcontainer = document.querySelector(".teasercards");
    if (projectdramixcontainer) {
        projectdramixcontainer.setAttribute('data-aos', 'zoom-out-left');
        projectdramixcontainer.classList.add('aos-init');
    }

    AOS.init({
        initClassName: "aos-init",
        startEvent: "DOMContentLoaded",
    });
});
