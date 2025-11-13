
const wrapper = document.querySelector('.slider-wrapper');
const prevBtn = document.querySelector('.slider-btn.prev');
const nextBtn = document.querySelector('.slider-btn.next');
const cardWidth = document.querySelector('.cards_item').offsetWidth + 32; // gap 포함
prevBtn.addEventListener('click', () => {wrapper.scrollBy({ left: -cardWidth, behavior: 'smooth' })});
nextBtn.addEventListener('click', () => {wrapper.scrollBy({ left: cardWidth, behavior: 'smooth' })});