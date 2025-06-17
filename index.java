// script.js
let currentIndex = 0;

function changeSlide() {
    const slides = document.querySelectorAll(".side-slide");

    // Remove active class from all
    slides.forEach(slide => slide.classList.remove("active"));

    // Increment index
    currentIndex = (currentIndex + 1) % slides.length;

    // Add active to next slide
    slides[currentIndex].classList.add("active");
}

// Auto-change image every 3 seconds
setInterval(changeSlide, 3000);

// Optional: call once to ensure first slide is shown if not already set
changeSlide();