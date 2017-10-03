$(function() {

	switch (menu) {
	case 'About Us':
		$('#aboutus').addClass('active');
		break;

	case 'Contact Us':
		$('#contactus').addClass('active');
		break;

	case 'All Games':
		$('#store').addClass('active');
		break;

	default:
		$('#store').addClass('active');
		$('#a_' + menu).addClass('active');
		break;

	}
});