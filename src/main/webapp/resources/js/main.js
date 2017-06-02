$(window).resize(function() {
	var h = $(window).height();
	h = h - 190;
	$('#video-panel').height(h);
	console.log("Video panel height: "+$('#video-panel').height());
});

$(window).trigger('resize');



//SideNav Initialization
$(".button-collapse").sideNav();


