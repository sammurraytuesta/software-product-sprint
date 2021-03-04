$('document').ready(()=>{
//  console.log('scroll');
    $('.scroll').click(function(e){
        //console.log('scroll');
        e.preventDefault();
        $('html,body').animate({
            scrollTop: $(this.hash).offset().top
        }, 2000)
    });

    /* scrollreveal -  */

    //scrollReveal().reveal('.showcase-text');

   /*  sr.reveal('.showcase-text',{
        origin: 'down',
        distance: '100px',
        duration: 2000,
        scale: '0.5',
        delay: 2000

    }); */

    const sr = ScrollReveal({
        origin: 'down',
        distance: '100px',
        duration: '200',
        scale: '0.2',
        resent: true
    });

    sr.reveal('.showcase-text', {
        delay: 1000
    });

    sr.reveal('.main_1',{
        delay: 1000
    })
});

