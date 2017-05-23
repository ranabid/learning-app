$(document).ready(function() {
	$('video').on('play pause', function(event) {
		console.log('Curent video: ' + event.target.id);
	});
});