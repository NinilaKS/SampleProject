/*-------------------------------------------------*\
   Javascript sheet for the Showing and removing div 
   as per resoultion
   
   Table of Contents
   If you conduct a Search on the page, type in the 
   section below that you would like to jump to.

   - Variable declare for the structure
   - Removing Div structure as per resoultion
   - Initiating the function 
   
\*-------------------------------------------------*/
/*-------------------------------------------*\
    Variable declare for the structure
\*-------------------------------------------*/
const desktopView = document.querySelector(".cmp-big")?.cloneNode(true);
const mobileDevice = document.querySelector(".cmp-small")?.cloneNode(true);
const wrapContainer = document.querySelector(".card-wrapper");

/*-------------------------------------------*\
    Removing Div structure as per resoultion
\*-------------------------------------------*/
const handleStructure = () => {
    const width = Math.max(document.documentElement.clientWidth, window.innerWidth || 0);
    if (width > 768) {
        if (wrapContainer) {
            wrapContainer.innerHTML = "";
            wrapContainer.insertAdjacentElement("afterbegin", desktopView);
        }
        
    }
    else {
        if (wrapContainer) {
            wrapContainer.innerHTML = "";
            wrapContainer.insertAdjacentElement("afterbegin", mobileDevice);
        }       
    }
};

/*-------------------------------------------*\
        Initiating the function
\*-------------------------------------------*/
window.addEventListener('resize', handleStructure, false);
handleStructure();



