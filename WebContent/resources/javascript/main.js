
$( document ).ready(function() {
	var href = window.location.href;
	var active = href.substr(href.lastIndexOf('/') + 1);
	if (active=="") active = 'start';
	$(".nav li").removeClass('active');
	$(".nav li." + active).addClass('active');
});

