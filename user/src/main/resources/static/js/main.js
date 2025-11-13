
const wrapper = document.querySelector('.slider-wrapper');
const prevBtn = document.querySelector('.slider-btn.prev');
const nextBtn = document.querySelector('.slider-btn.next');
const cardWidth = document.querySelector('.cards_item').offsetWidth + 32; // gap 포함
prevBtn.addEventListener('click', () => {wrapper.scrollBy({ left: -cardWidth, behavior: 'smooth' })});
nextBtn.addEventListener('click', () => {wrapper.scrollBy({ left: cardWidth, behavior: 'smooth' })});

//카드 드래그
const slider = document.querySelector('.slider-wrapper');
let isDown = false;
let startX;
let scrollLeft;

slider.addEventListener('mousedown', (e) => {
    isDown = true;
    startX = e.pageX - slider.offsetLeft;
    scrollLeft = slider.scrollLeft;
    slider.style.cursor = 'grabbing';
});

slider.addEventListener('mouseup', () => {
    isDown = false;
    slider.style.cursor = 'grab';
});

slider.addEventListener('mouseleave', () => {
    isDown = false;
    slider.style.cursor = 'grab';
});

slider.addEventListener('mousemove', (e) => {
    if(!isDown) return;
    e.preventDefault();
    const x = e.pageX - slider.offsetLeft;
    const walk = startX - x;      // 이전과 반대로 계산
    slider.scrollLeft = scrollLeft + walk;
});

slider.addEventListener('touchstart', (e) => {
    startX = e.touches[0].pageX - slider.offsetLeft;
    scrollLeft = slider.scrollLeft;
});
slider.addEventListener('touchmove', (e) => {
    const x = e.touches[0].pageX - slider.offsetLeft;
    const walk = startX - x;
    slider.scrollLeft = scrollLeft + walk;
});