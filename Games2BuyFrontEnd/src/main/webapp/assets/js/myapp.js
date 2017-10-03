$(function() {

	switch (menu) {
	case 'About Us':
		$('#aboutus').addClass('active');
		break;

	case 'Contact Us':
		$('#contactus').addClass('active');
		break;

	default:
		$('#home').addClass('active');
		break;

	}
});