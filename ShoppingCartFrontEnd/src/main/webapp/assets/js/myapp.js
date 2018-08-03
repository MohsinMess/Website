$(fucntion)()
{
	// Highlighten selected optioln in navbar
	switch(menu)
	{
	
	case'about':
		$('#about').addclass('active');
		break;
	case'contact':
		$('#contact').addclass('active');
		break;
	default:	
		$('#home').addclass('active');
		break;
	}
	
	
}