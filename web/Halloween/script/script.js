// Bouton Musique
const audio = document.getElementById('audio');
const playButton = document.querySelector('.play-button');
const pauseButton = document.querySelector('.pause-button');
const volumeControl = document.getElementById('volume');
        
playButton.addEventListener('click', () => {
    audio.play();
    playButton.style.display = 'none';
    pauseButton.style.display = 'inline';
});
        
pauseButton.addEventListener('click', () => {
    audio.pause();
    playButton.style.display = 'inline';
    pauseButton.style.display = 'none';
});
        
volumeControl.addEventListener('input', () => {
    audio.volume = volumeControl.value;
});

document.querySelector('.play-buttonTEL').addEventListener('click', () => {
    audio.play();
    document.querySelector('.play-buttonTEL').style.display = 'none';
    document.querySelector('.pause-buttonTEL').style.display = 'inline';
});

document.querySelector('.pause-buttonTEL').addEventListener('click', () => {
    audio.pause();
    document.querySelector('.play-buttonTEL').style.display = 'inline';
    document.querySelector('.pause-buttonTEL').style.display = 'none'
})

// Premiere div cachée
document.getElementById('BoutonDispa').addEventListener('click', function() {
    // Ajouter la classe d'animation
    this.classList.add('fade-out');
    this.addEventListener('animationend', () => {
        this.style.display = 'none'; // Cacher le bouton
        document.getElementById('DivCachee1').classList.remove('Cachee1');
        document.getElementById('Tablecachee1').classList.remove('Cachee1');
        document.getElementById('DividerCachee1').classList.remove('Cachee1')
    });
});

// Deuxieme div cachée
let inputBuffer = '';

document.addEventListener('keydown', function(event) {
    inputBuffer += event.key;

    if (inputBuffer.toLowerCase().includes('halloween')) {
        document.getElementById('Tablecachee2').classList.remove('Cachee2');
        document.getElementById('DivCachee2').classList.remove('Cachee2');
        document.getElementById('DividerCachee2').classList.remove('Cachee2');
    }
    // Limiter la taille du buffer pour éviter de surcharger
    if (inputBuffer.length > 20) {
        inputBuffer = inputBuffer.slice(1); // Garder seulement les 19 derniers caractères
    }
});
    

// Mettre en gras touts les Jack du premier paragraphe ( J'avais la flemme )
document.addEventListener('DOMContentLoaded', function() {
    const keyword = 'Jack';
    const regex = new RegExp(`(${keyword})`, 'gi'); 

    const paragraphs = document.querySelectorAll('.PremierParagraphe');

    paragraphs.forEach(paragraph => {
        paragraph.innerHTML = paragraph.innerHTML.replace(regex, '<span class="highlight">$1</span>');
    });
});